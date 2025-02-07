<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="pageNav" tagdir="/WEB-INF/tags" %>

<style>
.star-rating {
    direction: rtl;
    font-size: 2em;
    unicode-bidi: bidi-override;
}

.star-rating input[type="radio"] {
    display: none;
}

.star-rating label {
    color: #ddd;
    cursor: pointer;
}

.star-rating label:hover,
.star-rating label:hover ~ label {
    color: #ffcc00;
}

.star-rating input[type="radio"]:checked ~ label {
    color: #ffcc00;
}

</style>

<script>
$(function() {
	$(".reviewBtn").click(function() {
		$("#reviewModal").modal("show");
		let orderListItem = $(this).closest(".orderListItem");
		let orderNo = orderListItem.data("orderno");
		let gooodsName = orderListItem.find(".goodsName").text();
		let optionName = orderListItem.find(".optionName").text();
		let amount = orderListItem.find(".amount").text();
		$("#reviewModal #orderNo").val(orderNo);
		$("#reviewModal #gooodsName").text(gooodsName);
		$("#reviewModal #optionName").text(optionName);
		$("#reviewModal #quantity").text(amount);
	});
});


function previewImage(event) {
    const file = event.target.files[0];
    const reader = new FileReader();

    reader.onload = function(e) {
        const imgElement = document.getElementById('imagePreview');
        imgElement.src = e.target.result;
        imgElement.style.display = 'block'; // 이미지 표시
    };

    reader.onerror = function() {
        alert("이미지 업로드에 실패했습니다. 다시 시도해주세요."); // 오류 발생 시 메시지 표시
    };

    if (file) {
        reader.readAsDataURL(file); // 이미지 파일 읽기
    } else {
        alert("파일을 선택하지 않았습니다."); // 파일이 선택되지 않았을 때 메시지 표시
    }
}
</script>

  <!-- 리뷰 등록 모달 -->
<div class="modal" id="reviewModal" tabindex="-1" role="dialog" aria-labelledby="reviewModalLabel" aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered" role="document" style="max-width: 600px;">
        <div class="modal-content">
            <form id="reviewForm" action="/review/write.do" method="post" enctype="multipart/form-data">
                  <!-- Modal Header -->
                  <div class="modal-header" style="background-color: #f8f9fa;">
                      <h5 class="modal-title" id="reviewModalLabel">리뷰쓰기</h5>
                      <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                          <span aria-hidden="true">&times;</span>
                      </button>
                  </div>
  	                <!-- 상품 정보 -->
  	                <div class="modal-body">
  	                    <div class="product-info">
  	                        <p><strong>상품명:</strong> <span id="gooodsName"></span></p>
  	                        <p>옵션 선택: <span id="optionName"></span> / 수량: <span id="quantity"></span></p>
  	                    </div>
	
	                  <!-- 별점 입력 -->
          					<div class="form-group">
          					    <label for="starscore">상품은 만족하셨나요?</label>
          					    <div class="star-rating">
          					        <input type="radio" name="starscore" value="5" id="rate1"><label for="rate1">★</label>
          					        <input type="radio" name="starscore" value="4" id="rate2"><label for="rate2">★</label>
          					        <input type="radio" name="starscore" value="3" id="rate3"><label for="rate3">★</label>
          					        <input type="radio" name="starscore" value="2" id="rate4"><label for="rate4">★</label>
          					        <input type="radio" name="starscore" value="1" id="rate5"><label for="rate5">★</label>
          					    </div>
          					</div>
	
                    <!-- 리뷰 내용 입력 -->
                    <div class="form-group">
                        <label for="reviewContent">리뷰 내용</label>
                        <textarea class="form-control" id="reviewContent" name="reviewContent" rows="4" required></textarea>
                    </div>
	
                    <!-- 리뷰 이미지 업로드 -->
                    <div class="form-group">
                        <label for="reviewFile">리뷰 이미지</label>
                        <input type="file" class="form-control" id="reviewFile" name="reviewFile" onchange="previewImage(event)">
                    </div>
                                
                    <!-- 이미지 미리보기 -->
                    <div class="form-group">
                        <img id="imagePreview" src="" alt="이미지 미리보기" style="max-width: 50%; height: auto; display: none;">
                    </div>
	
                    <!-- 주문 번호 입력 -->
                    <div class="form-group">
                        <input type="hidden" class="form-control" id="orderNo" name="orderNo" required>
                    </div>
                </div>

                <!-- Modal Footer -->
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">닫기</button>
                    <button type="submit" class="btn btn-primary">등록</button>
                </div>
            </form>
        </div>
    </div>
</div>
