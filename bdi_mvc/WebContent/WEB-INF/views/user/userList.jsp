<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file ="/WEB-INF/views/common/common.jsp"%>
<body>
유저리스트<br>
<%-- <%=request.getAttribute("list")%> --%>
<div class="container">
	<table class ="table table-borderd table-hover">
		<thead>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>나이</th>
			</tr>
		</thead>
		<tbody>
		<%
		List<Map<String,String>> list = (List<Map<String,String>>)request.getAttribute("list");
	/* 	for(int i=0;i<10;i++){
			out.println("<tr>");
			out.println("<td>"+list.get(i).get("name"));
			out.println("</td>");
			out.println("<td>"+list.get(i).get("age"));
			out.println("</td>");
			out.println("</tr>");
		} */
		for(Map<String,String>map : list){
		%>
			<tr>
				<td><%= map.get("num") %></td>
				<td><%= map.get("name") %></td>
				<td><%= map.get("age") %></td>
			</tr>
		<%
		}
		%>
		</tbody>
	</table>

</div>
</body>
</html>