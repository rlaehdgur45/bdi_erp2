<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file ="/WEB-INF/views/common/common.jsp"%>
<c:if test="${!empty rMap}">
<script>
	alert('${rMap.msg}');
	if('${rMap.success}' == 'true'){
		location.href="/gameChart/gameChartList";
	}
</script>
</c:if>
<body>
<div class="container">
		<h4>유저업데이트</h4>
		<form action="/user/userUpdate" method="post">
		<table class="table table-bordered table-hover">
				<tr>
					<th>번호</th>
					<td>${game.gcnum}</td>
				</tr>
				<tr>
					<th>게임이름</th>
					<td><input type="text" name="gcName" value="${game.gcname}"></td>
				</tr>
				<tr>
					<th>게임가격</th>
					<td><input type="number" name="gcPrice" value="${game.gcprice}"></td>
				</tr>
				<tr>
					<th>배급사</th>
					<td><input type="text" name="gcVendor" value="${game.gcvendor}"></td>
				</tr>
				<tr>
					<th>게임주문번호</th>
					<td><input type="number" name="gcOrder" value="${game.gcorder}"></td>
				</tr>
				<tr>
					<th>게임설명</th>
					<td><input type="text" name="gcDesc" value="${game.gcdesc}"></td>
				</tr>
				<tr>
					<th>게임이미지</th>
					<td><input type="text" name="gcImg" value="${game.gcimg}"></td>
				</tr>
				<tr>
					<td colspan="2" style="text-align:center">
					<button>수정</button></td>
				</tr>
			</table>
			<input type="hidden" type="number" name="gcNum" value="${game.gcnum}">
		</form>
	</div>
</body>
</html>