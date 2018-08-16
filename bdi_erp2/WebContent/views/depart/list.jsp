<%@page import="java.util.Scanner"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file ="/views/common/common.jsp"%>

<body>
<%
String age = request.getParameter("age");
String name = request.getParameter("name");
String[] hoby = request.getParameterValues("hobby");
if(age!=null){
	out.println(name +"님이 전송한 나이는 " + age + "입니다<br>");
	int a= Integer.parseInt(age);
	if(a < 10){
		out.print("유아입니다<br>");
	}
	else if(a<20){
		out.print("10대 입니다<br>");
	}
	else if(a<30){
		out.print("20대 입니다<br>");
	}
	else if(a<40){
		out.print("30대 입니다<br>");
	}
	else if(a<50){
		out.print("40대 입니다<br>");
	}
	else if(a<60){
		out.print("50대 입니다<br>");
	}
	else {
		out.print("노년 입니다<br>");
	}
	
	for(String value:hoby){
		out.println(value);
	}
	/* for(int i=0; i<hoby.length;i++){
		hobystr += hobby[i]
		out.println(hoby[i] + " ");
	} */
	out.print("입니다.");
	
}


%>
<form>
	나이:<input type="text" name ="age"><br>
	이름:<input type="text" name ="name"><br>
	취미:영화 <input type="checkbox" name="hobby" value="영화">
	음악감상 <input type="checkbox" name="hobby" value="음악감상">
	게임 <input type="checkbox" name="hobby" value="게임">
	<br>
	<button>나이전송</button>
</form>
</body>
</html>