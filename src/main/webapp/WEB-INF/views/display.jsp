<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
		<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Weather Forcast</title>
</head>
<body>
		
		<c:forEach items="${weatherToday}" var="current">
			<tr>
				<td>${current.day}</td>
				<td>${current.low}</td>
				<td>${current.temp}</td>
				<td>${current.weather}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>