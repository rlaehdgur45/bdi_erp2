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
		<h4>유저뷰</h4>
		<table class="table table-bordered table-hover">
				<tr>
					<th>사용자번호</th>
					<td>${user.uino}</td>
				</tr>
				<tr>
					<th>이름</th>
					<td>${user.uiname}</td>
				</tr>
				<tr>
					<th>아이디</th>
					<td>${user.uiid}</td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input type="hidden" type="password" name="uiPwd" value="${user.uipwd}"></td>
				</tr>
				<tr>
					<th>내용</th>
					<td>${user.uidesc}</td>
				</tr>
				<tr>
					<th>나이</th>
					<td>${user.uiage}</td>
				</tr>
				<tr>
					<th>번호</th>
					<td>${user.dino}</td>
				</tr>
				<tr>
					<td colspan="2" style="text-align:center">
					<form action="/user/userDelete" method ="post">
					<button type="button" data-page='/user/userList'>이동</button>
					<button type="button" data-page='/user/userUpdate?uiNo=${user.uino}'>수정</button>
					<button>삭제</button>
					<input type="hidden" type="number" name="uiNo" value="${user.uino}">
					
					</form>
					</td>
				</tr>
		</table>
</div>
</body>
</html>