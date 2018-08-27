<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file ="/WEB-INF/views/common/common.jsp"%>
<body>
<div class="container">
		<h4>유저리스트</h4>
		<table class="table table-bordered table-hover">
			<thead>
				<tr>
					<th>사용자번호</th>
					<th>이름</th>
					<th>아이디</th>
					<th>비밀번호</th>
					<th>내용</th>
					<th>나이</th>
					<th>번호</th>
				</tr>
			</thead>
			<tbody>
			 <c:forEach items="${list}" var ="s">
				<tr>
					<th><a href="/user/userView?uiNo=${s.uino}">${s.uino}</th>
					<th>${s.uiname}</th>
					<th>${s.uiid}</th>
					<th>${s.uipwd}</th>
					<th>${s.uidesc}</th>
					<th>${s.uiage}</th>
					<th>${s.dino}</th>
				</tr>
			 </c:forEach>
			</tbody>
		</table>
		<button onclick ="goPage()">등록하기</button>

	</div>
	<script>
		function goPage(){
			location.href="/views/user/userInsert";
			
		}
	</script>
</body>
</html>