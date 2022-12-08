<%@page import="com.kfh.training.SomeWork"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Getting Started with JSPs</title>
</head>
<body>
<!-- Jsp declarations -->
<%!
int value = 541 ;

void func(){
	
}

%>
value
<%= value = 678 %>
<%-- This is a JSP comment --%>
<%
	response.setContentType("text/html");

	out.println(new Date());
	out.println(78 + 901);
	out.println("IBM".toLowerCase());
	
	SomeWork work = new SomeWork();
	out.println("<br>Addition is : " + work.operate(45, 90));
	
	
	/* for(int index = 9; index < 99; index++){
		out.println(index + "<br>");
	} */
%>
<hr>
<%
	out.println("Hello KFH...");
%>
<hr>

<!-- <select>
<option>456</option>
<option>457</option>
<option>458</option>
<option>459</option>
<option>460</option>
</select> -->
<select>
<option>Please select your ID</option>
<%
	for(int index = 456; index <= 666; index++){
		out.println("<option>" + index + "</option>");
	}
%>
</select>










</body>
</html>
