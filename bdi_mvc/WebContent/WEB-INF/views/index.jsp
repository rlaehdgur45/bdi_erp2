<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file ="/WEB-INF/views/common/common.jsp"%>
<%
String url = "/WEB-INF/views/user/userList.jsp";

%>
<body>
	<div class="container">
		빅데이터 MVC 첫페이지
		<div class="left"></div>
		<div class="right"></div>
		<jsp:include page="<%=url %>"/>
	</div>


</body>

</html>