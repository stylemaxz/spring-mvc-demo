<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		first Name := <form:input path="firstName"/>
		<br>
		last Name : <form:input path="lastName" />
		<br><br>
		Country : 
		<form:select path="country" >
			<!-- <form:option value="br" label="Brazil" /> -->
			<form:options items="${student.countryOptions}" />
		</form:select>
		<br><br>
		Favorite Language : 
		<br>
		Java <form:radiobutton path="favoriteLanguage" value="Java" />
		C <form:radiobutton path="favoriteLanguage" value="C" />
		C# <form:radiobutton path="favoriteLanguage" value="C#" />
		
		<br>
		OS
		Linux <form:checkbox path="os" value="linux" />
		Windows <form:checkbox path="os" value="windows" />
		Mac <form:checkbox path="os" value="mac" />
		
		<input type="submit" value="submit">
		
	</form:form>
</body>
</html>