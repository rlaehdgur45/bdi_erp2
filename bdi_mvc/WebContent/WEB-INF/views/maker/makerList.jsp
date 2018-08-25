<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file ="/WEB-INF/views/common/common.jsp"%>
<body>
	<div class="container">
		<h4>메이커리스트</h4>
		<table class="table table-bordered table-hover">
			<thead>
			<tr>
				<th>번호</th>
				<th>메이커명</th>
				<th>가격</th>
				<th>수량</th>
				<th>총액</th>
				<th>메이커설명</th>
			</tr>
			</thead>
			<tbody>
			<c:forEach items="${list}" var="m">
				<tr>
					<th>${m.mnum}</th>
					<th><a href="/maker/makerView?mNum=${m.mnum}">${m.mname}</a></th>
					<th>${m.mprice}</th>
					<th>${m.mcnt}</th>
					<th>${m.mtotal}</th>
					<th>${m.mdesc}</th>
				</tr>
			</c:forEach>
			</tbody>
		</table>
		<button onclick="goPage()">메이커등록</button>
		<button onclick="deleteDel()">삭제하기</button>
	</div>
	<script>
	function goPage(){
		location.href="/views/maker/makerInsert";
	}
	</script>
</body>
</html>