<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    

<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Add Expenses</h1>
	<form:hidden path="id"/>
	<form:form action="${contextRoot}/expense" method="post" modelAttribute="expense">
	<form:input path="expensename" placeholder="Enter Expense Name"/>
	<form:input path="amount" placeholder="Enter Expense Amount"/>
	<form:textarea path="note" placeholder="Enter Note(Optional)"/>
	<a href="${contextRoot}/expense/${expense.id}/delete">Delete</a>
	<button type="submit">Add Expense</button>
	
	
	</form:form>

</body>
</html>