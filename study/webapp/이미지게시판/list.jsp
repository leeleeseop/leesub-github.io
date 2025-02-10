<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이미지 LIST</title>
<!-- 1. Bootstrap 4 + jquery 3.7 라이브러리 등록 CDN -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
<!-- 아이콘 라이브러리 -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<style type="text/css">
.dataRow:hover {
	background: #ddd;
	cursor: pointer;
}
</style>

<script type="text/javascript">
	$(function() {

		// 2. jquery 확인
		console.log("jquery loading..... --------------- ");

	});
</script>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <style>
        .centered-text {
            text-align: center;
        }
    </style>
</head>
<body class="bg-dark text-white">
	<!-- 3. body 부분의 소스를 채운다. w3schools.com 사이 소스 참소. -->
	<div class="container">
		<h2 class="centered-text">
			<i class="fa fa-image"></i> 이미지 리스트
		</h2>
		<form action="list.jsp>">
			<div class="row">
				<div class="col-md-8 offset-md-2">
					<div class="input-group mb-3 float-left">
						<div class="input-group-prepend">
							<select name="key" id="key" class="form-control">
								<option value="t">제목</option>
								<option value="c">내용</option>
								<option value="s">작성자</option>
								<option value="tc">제목/내용</option>
								<option value="tw">제목/작성자</option>
								<option value="cw">내용/작성자</option>
								<option value="tcw">모두</option>
							</select>
						</div>
						<input type="text" class="form-control" placeholder="검색" id="word" name="word">
						<div class="input-group-append">
							<button class="btn btn-outline-primary">검색</button>
						</div>
					</div>
				</div>
			</div>
		</form>
		<div class="row">
			<div class="col-md-4">
				<div class="card" style="width: 100%">
					<img class="card-img-top" src="/img/KakaoTalk_20240612_163708447_01.jpg" alt="Card image">
					<div class="card-body">
						<h4 class="card-title text-dark">도담이</h4>
						<p class="card-text">
							도담이 <br> 7살
						</p>
					</div>
				</div>
				<!-- image card의 끝 -->
			</div>
			<!-- col-md-4의 끝 -->
			<div class="col-md-4">
				<div class="card" style="width: 100%">
					<img class="card-img-top" src="/img/KakaoTalk_20240612_163708447.jpg" alt="Card image">
					<div class="card-body">
						<h4 class="card-title">도담이</h4>
						<p class="card-text">
							도담이 
							<br> 7살
						</p>
					</div>
				</div>
				<!-- image card의 끝 -->
			</div>
			<div class="col-md-4">
				<div class="card" style="width: 100%">
					<img class="card-img-top" src="/img/KakaoTalk_20240612_163708447_03.jpg" alt="Card image">
					<div class="card-body">
						<h4 class="card-title">도담이</h4>
						<p class="card-text">
							도담이 <br> 7살
						</p>
					</div>
				</div>
				<!-- image card의 끝 -->
			</div>
		</div>

		<div class="row">
			<div class="col-md-4">
				<div class="card" style="width: 100%">
					<img class="card-img-top" src="/img/KakaoTalk_20240612_163708447.jpg" alt="Card image">
					<div class="card-body">
						<h4 class="card-title">도담이</h4>
						<p class="card-text">
							도담이 <br> 7살
						</p>
					</div>
				</div>
				<!-- image card의 끝 -->
			</div>
			<!-- col-md-4의 끝 -->
			<div class="col-md-4">
				<div class="card" style="width: 100%">
					<img class="card-img-top" src="/img/KakaoTalk_20240612_163708447_02.jpg" alt="Card image">
					<div class="card-body">
						<h4 class="card-title">도담이</h4>
						<p class="card-text">
							도담이 <br> 7살
						</p>
					</div>
				</div>
				<!-- image card의 끝 -->
			</div>
		</div>
		<div class="row">
			<div class="col-md-4">
				<div class="card" style="width: 100%">
					<img class="card-img-top" src="/img/KakaoTalk_20240612_163708447_02.jpg" alt="Card image">
					<div class="card-img-overlay">
						<h4 class="card-title">John Doe</h4>
						<p class="card-text">Some example text.</p>
						<a href="#" class="btn btn-primary">See Profile</a>
					</div>
				</div>
				<!-- image card의 끝 -->
			</div>
			<!-- col-md-4의 끝 -->
		</div>
		</div>
</body>
</html>
