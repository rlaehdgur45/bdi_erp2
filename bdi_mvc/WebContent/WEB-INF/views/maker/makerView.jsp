<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file ="/WEB-INF/views/common/common.jsp"%>
<c:if test="${!empty rMap}">
<script>
	alert('${rMap.msg}');
	if('${rMap.success}' == 'true'){
		location.href="/maker/makerList";
	}
</script>	
</c:if>
<body>
	<div class="container">
		<h4>메이커뷰</h4>
		<table class="table table-bordered table-hover">

			<tr>
				<th>번호</th>
				<th>${maker.mnum}</th>
			</tr>
			<tr>
				<th>메이커명</th>
				<th>${maker.mname}</th>
			</tr>
			<tr>
				<th>가격</th>
				<th>${maker.mprice}</th>
			</tr>
			<tr>
				<th>수량</th>
				<th>${maker.mcnt}</th>
			</tr>
			<tr>
				<th>총액</th>
				<th>${maker.mtotal}</th>
			</tr>
			<tr>
				<th>메이커설명</th>
				<th>${maker.mdesc}</th>
			</tr>
			<tr>
				<td colspan="2" style="text-align:center">
					<form action="/maker/makerDelete" method="post"style="">
						<button type="button" data-page='/maker/makerList'>리스트가기</button>
						<button type="button" data-page='/maker/makerUpdate?mNum=${maker.mnum}'>메이커수정</button>
						<button>삭제</button>
						<input type="hidden" type="number" name="mNum" value="${maker.mnum}">
					</form>
				</td>
			</tr>
		</table>
	</div>
	
</body>
</html>
