<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file ="/WEB-INF/views/common/common.jsp"%>
<body>

<div class="container">

	<table class =" table table-bordered table-hover">
		<thead>
			<tr>
				<th>부서번호</th>
				<th>부서이름</th>
				<th>부서설명</th>
				<th>부서총인원</th>
			</tr>
		</thead>
		<c:forEach items="${departList}" var="depart">
			<tr>
				<td>${depart.diNo}</td>
				<td>${depart.diName}</td>
				<td>${depart.diDesc}</td>
				<td>${depart.diCnt}</td>
			</tr>
		</c:forEach>
	</table>
	<div>
		<button data-page="/views/depart/departInsert">등록</button>
	</div>
</div>
</body>
</html>