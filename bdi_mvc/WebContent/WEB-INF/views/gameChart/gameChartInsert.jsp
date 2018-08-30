<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file ="/WEB-INF/views/common/common.jsp"%>
<c:if test="${!empty rMap}">
<script>
	alert('${rMap.msg}');
	if('${rMap.success}' == 'true'){
		location.href="/gameChart/gameCharList";
	}
</script>	
</c:if>
<body>
<div class="container">
		<form action="/gameChart/gameChartInsert" method="post">
		<table class="table table-bordered">
				
				<tr>
					<th>게임이름</th>
					<td><input type="text" name="gcName" ></td>
				</tr>
				<tr>
					<th>게임가격</th>
					<td><input type="number" name="gcPrice" ></td>
				</tr>
				<tr>
					<th>배급사</th>
					<td><input type="text"  name="gcVendor" ></td>
				</tr>
				<tr>
					<th>게임주문번호</th>
					<td><input type="number" name="gcOrder"></td>
				</tr>
				<tr>
					<th>게임설명</th>
					<td><input type="text" name="gcDesc"></td>
				</tr>
				<tr>
					<th>게임이미지</th>
					<td><input type="text" name="gcImg" ></td>
				</tr>
				<tr>
					<td colspan="2">
					<button>등록</button></td>
				</tr>
			</table>
			
		</form>
	</div>
</body>
</html>