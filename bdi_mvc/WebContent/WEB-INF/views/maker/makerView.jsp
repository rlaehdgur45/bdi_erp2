<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file ="/WEB-INF/views/common/common.jsp"%>
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
				<th>${maker.mprice*maker.mcnt}</th>
			</tr>
			<tr>
				<th>메이커설명</th>
				<th>${maker.mdesc}</th>
			</tr>
		</table>
		<div>
			<button onclick="goPage()">리스트 이동</button>
			<button onclick="goUpdate()">수정</button>
		</div>
	</div>
	<script>

		function goPage(){
			location.href="/maker/makerList";
		}
		
		function goUpdate(){
			
		}
	</script>
</body>
</html>
