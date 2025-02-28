<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="pageNav" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<link rel="stylesheet" href="/css/reviewStyle.css">

<style>
.star-rating {
position: relative;

    flex-direction: row; /* 가로 정렬 */
/*     align-items: center; 세로 가운데 정렬 */
    text-align: center;
    font-size: 0;
    top: -15px;
}
</style>
<script type="text/javascript">
	
	
$(document).ready(function() {
       // 리뷰 이미지 클릭 시 모달 열기
       $(document).on('click', '.review-image img', function() {
           var modal = $('#imageModal');
           var modalImg = $('#modalImage');
           modalImg.attr('src', $(this).attr('src'));
           modal.show();
       });
       
       // 모달 닫기 버튼 클릭 시 모달 닫기
       $(document).on('click', '.close', function() {
           $('#imageModal').hide();
       });
});  

        
$(function() {
	
	
    //판매자에게만 리뷰답변 등록 수정 삭제 버튼 보이게 하는 소스
    let sellerId = $(".reviewList").data("sellid");	
    let id = "${login.id}";
    if(id != null && sellerId==id ){
        $(".reviewList").find(".replyreviewWriteBtn, .replyreviewUpdateBtn, .repltdeleteBtn").show();
       // console.log($(".reviewList").find(".replyreviewWriteBtn"));
    }else{
        $(".reviewList").find(".replyreviewWriteBtn, .replyreviewUpdateBtn, .repltdeleteBtn").hide();
       // console.log($(".reviewList").find(".replyreviewWriteBtn"));
	}
	
	
	if(${scroll != null}) {
		$('html, body').animate({ scrollTop: $(document).height()  }, 'smooth'); 		
	}
	
	
	if(${scroll != null}) {
		$('html, body').animate({ scrollTop: $(document).height()  }, 'smooth'); 		
	}
	
	
	     // 리뷰 수정 모달창
	     $(".reviewUpdateBtn").click(function() {
	         $("#reviewupdateModal").modal("show");
	     });
	
	
	    // 리뷰답변 수정 모달창
	    $(".replyreviewUpdateBtn").click(function() {
	        $("#replyreviewupdateModal").modal("show");
	    });
	
	
		// 리뷰답변 등록 모달창
		$(".replyreviewWriteBtn").click(function() {
			let reviewNo = $(this).data("reviewno");
			$("#inputno").val(reviewNo);
			console.log("log");
			$("#replyModal").modal("show");
		});
		
		
		// 리뷰답변삭재 버튼
		$(".repltdeleteBtn").click(function() {
		    var reviewReplyNo = $(this).data("reviewreplyno");
		    var goodsNo = $(this).data("goodsno");
		    if(confirm("답변을 삭제하시겠습니까?"))
		   	location = `/review/replydelete.do?reviewReplyNo=\${reviewReplyNo}&goodsNo=\${goodsNo}`;
		});
	
	// perPageNum 처리
	$("#perPageNum").change(function() {
		$("#searchForm").submit();
	});
});


//좋아요 토글 함수 수정
function toggleLike(reviewNo, userId) {
    $.ajax({
        type: 'POST',
        url: '/reviewlike/toggle',  // 수정된 토글 메서드 사용
        contentType: 'application/json',
        dataType: 'json',  // 응답을 JSON으로 받도록 설정
        data: JSON.stringify({ reviewNo: reviewNo, id: userId }),
        success: function(response) {
        location.reload(); // 새로고침하여 좋아요 개수 갱신
        	
            // 서버로부터 변경된 좋아요 개수를 반환받음
            let likeCount = response;

            // 좋아요 개수 업데이트
            $('#likeCount-' + reviewNo).text(likeCount);

            // 버튼 스타일 변경
            let likeButton = $('.like-button[data-reviewno="' + reviewNo + '"]');
            if (likeButton.hasClass('liked')) {
                likeButton.removeClass('liked');
                likeButton.text('좋아요');
            } else {
                likeButton.addClass('liked');
                
            }
        },
        error: function(error) {
            console.log(error);
            alert("좋아요 처리 중 오류가 발생했습니다.");
        }
    });
}



//좋아요 버튼 클릭 이벤트 수정
$(document).on('click', '.like-button', function() {
    var reviewNo = $(this).data('reviewno');
    var userId = '${login.id}';
    console.log("좋아요 토글: 리뷰번호 = " + reviewNo + ", 사용자ID = " + userId);
    toggleLike(reviewNo, userId);
});

</script>


<!-- 리뷰 이미지 확대 모달 -->
<div id="imageModal" class="modal">
    <span class="close">&times;</span>
    <div class="modal-content">
        <img id="modalImage" alt="리뷰 이미지 확대">
    </div>
</div>


<!-- 전체 리뷰수 & 평점별점 -->
<div class="card-body-top m-1">
<!-- 전체 리뷰수 -->
	<div class="ReviewCount">
		<h4 class="totalRiv" style="position: relative; top: 18px;">전체 리뷰수</h4> 
		<h4 style="position: relative; right: -50px; top: 14px;">${totalReviewCount}</h4>
	</div>
		<div>
			<h4 class="totalscor mt-5" style="position: relative; top: -12px;">
				사용자 총 평점:
				<fmt:formatNumber value="${averageRating}" type="number" maxFractionDigits="2" />/ 5
			</h4>
			<!-- 평점 & 별점 -->
			<div class="star-rating" style="position: relative; right: -60px;">
				<c:set var="integerPart"
					value="${fn:substringBefore(averageRating, '.')}" />
				<c:set var="decimalPart"
					value="${fn:substring(fn:substringAfter(averageRating, '.'), 0, 1)}" />
				<c:forEach begin="1" end="5" varStatus="status">
					<c:choose>
						<c:when test="${status.index <= integerPart}">
							<!-- 완전히 채워진 별 -->
							<i class="fa fa-star checked"></i>
						</c:when>
						<c:when test="${status.index == integerPart + 1}">
							<!-- 소수점 값을 바탕으로 부분적으로 채워진 별 -->
							<i class="fa fa-star partially-filled"
								style="--percent: ${decimalPart * 10}%"></i>
						</c:when>
						<c:otherwise>
							<!-- 빈 별 -->
							<i class="fa fa-star"></i>
						</c:otherwise>
					</c:choose>
				</c:forEach>
			</div><!-- 평점 & 별점 end -->
		</div>
</div><!-- 전체리뷰수 end -->

<hr class="sidebar-divider my-0 mt-2 ">


<c:forEach items="${list}" var="vo">
	<div class="review-container">
		
		
		<!-- 별점 -->
		<div class="review-star-rating ml-2">
			<c:forEach begin="1" end="5" varStatus="status">
				<i 
				  class="fa fa-star ${status.index <= vo.starscore ? 'checked' : ''}"></i>
			</c:forEach>
		</div>

          <!-- 리뷰삭제버튼 -->
		<c:if test="${!empty login && login.id == vo.id}">
			<button type="button" class="btn btn-primary deleteBtn"
				data-reviewno="${vo.reviewNo}" data-orderno="${vo.orderNo}">
				<i class="material-icons">close</i>
			</button>
		</c:if>
		
		
		<!-- 리뷰 헤더: 아이디와 작성일 -->
		<div class="like-review-hedder-container ml-2">
			<span>${fn:substring(vo.id, 0, 2)}*****</span> 
		<span
			class="writdeDate ml-2"><fmt:formatDate
				value="${vo.writeDate}" pattern="yyyy-MM-dd" />
		</span>
		</div>
	

		<!-- 리뷰 내용 -->
		<div class="review-content ml-3">
			<pre>${vo.reviewContent}</pre>
		</div>


		<!-- 리뷰 이미지 -->
		<div class="review-image">
			<c:if test="${not empty vo.reviewImage}">
				<img src="${vo.reviewImage}" onerror="this.style.display='none';" />
			</c:if>
		</div>


		<!-- 좋아요 버튼 및 개수 -->
		<div class="like-review-container">
			<div class="review-footer mt-3 ml-3">
				<button class="btn btn-success like-button" data-reviewno="${vo.reviewNo}">
					<i class="fa fa-heart"></i> 
					<span id="likeCount-${vo.reviewNo}">${vo.likeCount}</span>
				</button>
			</div>


			<!-- 리뷰수정버튼 -->
			<c:if test="${!empty login && login.id == vo.id}">
				<button type="button" class="btn btn-primary reviewUpdateBtn"
					data-reviewno="${vo.reviewNo}" data-goodsno="${vo.goodsNo}"
					data-starscore="${vo.starscore}"
					data-reviewcontent="${fn:escapeXml(vo.reviewContent)}"
					data-reviewimage="${vo.reviewImage}">리뷰수정</button>
			</c:if>
			
			
			<!-- 리뷰답변하기 -->
			<c:if test="${ !empty login && login.gradeNo == 5 && empty vo.replyId}">
				<button type="button" class="btn btn-primary replyreviewWriteBtn" data-reviewno="${vo.reviewNo}">답변하기</button>
			</c:if>


			<!-- 리뷰답변수정 & 삭제 -->
			<c:if test="${not empty vo.replyId}">
				<button type="button" class="btn btn-primary replyreviewUpdateBtn"
					data-reviewno="${vo.reviewNo}"
					data-reviewReplyNo="${vo.reviewReplyNo}"
					data-replyContent="${vo.replyContent}">답변수정하기</button>

				<button type="button" class="btn btn-danger repltdeleteBtn"
					data-reviewreplyno="${vo.reviewReplyNo}"
					data-reviewno="${vo.reviewNo}" data-goodsno="${vo.goodsNo}">삭제</button>
			</c:if>
		</div>


		<!-- 리뷰답변삭제 모달 -->
		<div class="modal fade" id="replydeleteModal">
			<div class="modal-dialog modal-dialog-centered">
				<div class="modal-content">

					<form action="/review/replydelete.do" method="post">
						<input type="hidden" name="reviewReplyNo" value=""> <input
							type="hidden" name="reviewNo" value=""> <input
							type="hidden" name="goodsNo" value="">
						<!-- Modal body -->
						<div class="modal-body">정말로 삭제하시겠습니까?</div>

						<!-- Modal footer -->
						<div class="modal-footer">
							<button type="submit" class="btn btn-danger">삭제</button>
							<button type="button" class="btn btn-secondary"
								data-dismiss="modal">취소</button>
						</div>
					</form>
				</div>
			</div>
		</div>
		

		<!-- 답변 영역 -->
		<c:if test="${not empty vo.replyId}">
			<div class="reply-container">
				<!-- 답변 헤더: 답변자와 답변 작성일 -->
				<div class="reply-header ml-3">
					판매자 <input type="hidden" ${vo.replyId}> 
					<span class="float-right mr-3">
					<fmt:formatDate value="${vo.replyWriteDate}" pattern="yyyy-MM-dd" /></span>
				</div>

				<!--답변 내용 -->
				<div class="reply-content ml-3">
					<pre>${vo.replyContent}</pre>
				</div>
			</div>
		</c:if>
		
		
	</div>
</c:forEach>

<jsp:include page="replyupdateForm.jsp"/>

<div class="card-footer">
	<div>
		<pageNav:pageNavReview listURI="" pageObject="${pageObject}" />
	</div>
</div>
