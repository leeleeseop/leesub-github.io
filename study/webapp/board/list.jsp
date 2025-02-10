<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>일반 게시판 리스트</title> <!-- 웹페이지의 제목 -->
<style type="text/css">

/* box 속성의 객체를 가운데 정렬 시키기 - table */
table {
	margin: 0 auto; /*테이블을 화면 중앙에 배치합니다*/
	width: 800px; /* 너비 800px로 지정 */
}
th, td {
	border: 1px solid #888; /* 테두리 설정 */
	padding: 5px; /* 테두리와 데이터의 공백 */
}
th {
	background: black; /* 배경색 - 블랙 */
	color: white; /* 글자색 - #fff */
}
.dataRow:hover {
	background: #ddd; /*테이블의 헤더의 배경색을 설정*/
	cursor: pointer; /*마우스 커서를 포인트로 설정*/
}
button:hover { /* 마우스를 버튼 위에 올렸을 때 커서 모양을 포인터로 변경하여 클릭 가능함을 표시 */
	cursor: pointer; /*마우스를 커서를 버튼에 올려두면 포인트로 변함*/
}
</style>
</head>
<body>
	<table>
		<tr>
			<th colspan="5">
				<h1>일반 게시판 리스트</h1> <!-- 테이블의 제목 지정 -->
			</th>
		</tr>
		<tr>
		<!-- 게시물의 컬럼 제목 -->
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회수</th>
		</tr>
		<!-- 게시물을 클릭하면 view.jsp페이지로 이동 -->
		<tr onclick="location='view.jsp';" class="dataRow">
			<td></td>
			<td>자바란?</td>
			<td>홍길동</td>
			<td>2024.05.01</td>
			<td>15</td>
		</tr>
		<tr onclick="location='view.jsp';" class="dataRow">
			<td>1</td>
			<td>키오스크 과정</td>
			<td>관리자</td>
			<td>2024.04.20</td>
			<td>21</td>
		</tr>
		<tr>
			<!-- 등록버튼의 포함하는 테이블 -->
			<td colspan="5"><a href="writeForm.jsp"><button>등록</button></a></td>
		</tr>
	</table>
</body>
</html>
