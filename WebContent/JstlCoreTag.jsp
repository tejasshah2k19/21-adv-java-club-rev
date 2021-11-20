<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<b>Royal</b>



	<%
		int a = 90;
	%>

	<%=a%>

	<%
		if (a % 2 == 0) {
			out.print("number is even");
		} else {
			out.print("number is odd ");
		}
	%>
	<Br>

	<c:set value="90" var="a"></c:set>
	<c:out value="${a}"></c:out>
	<br>
	<c:if test="${a%2 == 0 }">
			number is even 
	</c:if>
	<c:if test="${a%2 != 0 }">
			number is odd 
	</c:if>



	<c:set var="choice" value="2"></c:set>
	<c:choose>
		<c:when test="${choice == 1  }">
			case 1
		</c:when>
		<c:when test="${choice == 2 }">
			case 2
		</c:when>

		<c:when test="${choice == 3  }">
			case 3
		</c:when>
		<c:otherwise>
			default
		</c:otherwise>
	</c:choose>














</body>
</html>