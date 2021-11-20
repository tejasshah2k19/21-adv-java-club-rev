<%@page import="com.bean.ProductBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>

	<%
		ArrayList<ProductBean> products = (ArrayList<ProductBean>) request.getAttribute("products");
	%>

	<table border="1">
		<tr>
			<th>ProductId</tH>
			<th>Name</th>
			<th>Qty</th>
			<th>Price</th>
			<th>Action</th>
		</tr>


		<%
			for (ProductBean p : products) {
		%>
		<tr>
			<td><%=p.getProductId()%></td>
			<td><%=p.getName()%></td>
			<tD><%=p.getQty()%></tD>
			<td><%=p.getPrice()%></td>
			<td><a
				href="DeleteProductController?productId=<%=p.getProductId()%>">Delete</a>
			</td>
		</tr>
		<%
			}
		%>


	</table>


</body>
</html>