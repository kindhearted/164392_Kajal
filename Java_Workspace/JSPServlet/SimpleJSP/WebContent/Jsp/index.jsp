<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
public int add(int num1,int num2)
{		
	return num1+num2;
}
%>
<h3>Hello Everyone!!!</h3>

<%
int i=3;
int j=54;
int k=i+j;
out.print(k);
%>

<h1>Value of addition is  <%=k %></h1>
<% 
k=add(100, 300);
%>
<h1>Value of addition is  <%=k %></h1>


</body>
</html>