<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>일반 게시판 글등록</title>
<style type="text/css">

/* box 속성의 객체를 가운데 정렬 시키기 - table */
table {
	margin: 0 auto; /*테이블을 화면 중앙에 배치합니다*/
	width: 800px; /* 너비 지정 */
}

th, td {
	border: 1px solid #888; /* 테두리 */
	padding: 5px; /* 테두리와 데이터의 공백 */
}

th {
	background: black; /* 헤더 배경색 - 블랙 */
	color: white; /* 헤드 글자색 - 화이트 */
}

input, select, textarea, button {
	padding: 5px; /*버튼 여백 설정*/
}

.textInput {
	width: 98%; /*너비설정*/
}

input, select, textarea {
	background: #ddd; /*배경색 설정*/
}

input:focus, select:focus, textarea:focus {
	background: white; /*배경색 변경*/
}
</style>
</head>
<body>
	<form action="write.jsp" method="post">
		<table>
			<!-- tr : table row - 테이블 한줄 -->
			<tr>
				<!-- th : table head - 테이블 제목 텍스트 -->
				<th colspan="2">
					<h1>일반 게시판 글등록</h1>
				</th>
			</tr>
			<!-- 게시판 데이터의 제목 -->
			<tr>
				<th>제목</th>
				<td><input id="title" name="title" required class="textInput" maxlength="100" 
				pattern="^[^ .].{2,99}$" title="맨앞에 공백문자 불가. 3~100자 입력" placeholder="제목 입력 : 3자 이상 100자 이내"></td>
			</tr>
			<!-- 게시판 데이터의 내용 -->
			<tr>
				<th>내용</th>
				<td><textarea class="textInput" id="content" name="content" required rows="7" 
				placeholder="첫글자는 공백문자나 줄바꿈을 입력할 수 없습니다."></textarea></td>
			</tr>
			<!-- 게시판 데이터의 작성자 -->
			<tr>
				<th>작성자</th>
				<td><input id="writer" name="writer" required class="textInput" maxlength="10"
				 pattern="^[a-zA-Z가-힣]{2,10}$" title="한글과 영어만 입력. 2~10자 입력" placeholder="이름은 영어와 한글만 가능"></td>
			</tr>
			<!-- 게시판 데이터의 비밀번호 -->
			<tr>
				<th>비밀번호</th>
				<td><input type="password" id="pw" name="pw" required class="textInput" maxlength="20" 
				pattern="^.{3,20}$" title="3~20자 입력 가능" placeholder="비밀번호를 입력하세요."></td>
			</tr>
			<!-- 게시판 데이터의 비밀번호 확인 -->
			<tr>
				<th>비밀번호 확인</th>
				<td><input type="password" id="pw2" required class="textInput" maxlength="20" 
				pattern="^.{3,20}$" title="3~20자 입력 가능" placeholder="비밀번호 확인을 입력하세요."></td>
			</tr>
			<tr>
				<td colspan="2">
					<!-- a tag : 데이터를 클릭하면 href의 정보를 가져와서 페이지 이동시킨다. -->
					<button>등록</button> <!-- 등록버튼 -->
					<button type="reset">다시입력</button> <!-- 다시입력버튼 -->
					<button type="button" onclick="history.back();">취소</button> <!-- 취소버튼 -->
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
