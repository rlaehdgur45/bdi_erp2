<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file ="/WEB-INF/views/common/common.jsp"%>
<body>
<%
Date date = new Date();
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
out.print("session ID : " + session.getId());
date.setTime(session.getCreationTime());
out.print("<br>셰선 생성시간 : " +sdf.format(date));
date.setTime(session.getLastAccessedTime());
out.print("<br>쎄션 마지막 접속 시간: " + sdf.format(date));

%>
</body>
</html>