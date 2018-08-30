<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file ="/WEB-INF/views/common/common.jsp"%>
<body>
<div class="container">
	<table class="table table-bordered table-hover">
		<thead>
		<tr>
			<th>번호</th>
			<th>게임이름</th>
			<th>게임가격</th>
			<th>배급사</th>
			<th>게임주문번호</th>
			<th>게임설명</th>
			<th>게임이미지</th>
		</tr>
		</thead>
		<tbody>
		<c:forEach items="${list}" var="game">
			<tr>
				<th><a href="/gameChart/gameChartView?gcNum=${game.gcnum}">${game.gcnum}</a></th>
				<th>${game.gcname}</th>
				<th>${game.gcprice}</th>
				<th>${game.gcvendor}</th>
				<th>${game.gcorder}</th>
				<th>${game.gcdesc}</th>
				<th>${game.gcimg}</th>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<button onclick="goPage()">게임등록</button>
</div>
<script>
function goPage(){
	location.href="/views/gameChart/gameChartInsert";
}
</script>
</body>
</html>