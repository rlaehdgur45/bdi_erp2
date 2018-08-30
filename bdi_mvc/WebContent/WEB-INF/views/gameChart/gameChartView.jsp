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
		<h4>유저뷰</h4>
		<table class="table table-bordered table-hover">
				<tr>
					<th>번호</th>
					<td>${game.gcnum}</td>
				</tr>
				<tr>
					<th>게임이름</th>
					<td>${game.gcname}</td>
				</tr>
				<tr>
					<th>게임가격</th>
					<td>${game.gcprice}</td>
				</tr>
				<tr>
					<th>배급사</th>
					<td>${game.gcvendor}</td>
				</tr>
				<tr>
					<th>게임주문번호</th>
					<td>${game.gcorder}</td>
				</tr>
				<tr>
					<th>게임설명</th>
					<td>${game.gcdesc}</td>
				</tr>
				<tr>
					<th>게임이미지</th>
					<td>${game.gcimg}</td>
				</tr>
				<tr>
					<td colspan="2" style="text-align:center">
					<form action="/gameChart/gameChartDelete" method ="post">
					<button type="button" data-page='/gameChart/gameChartList'>이동</button>
					<button type="button" data-page='/gameChart/gameChartUpdate?gcNum=${game.gcnum}'>수정</button>
					<button>삭제</button>
					<input type="hidden" type="number" name="gcNum" value="${game.gcnum}">
					</form>
					</td>
				</tr>
		</table>
</div>
</body>
</html>