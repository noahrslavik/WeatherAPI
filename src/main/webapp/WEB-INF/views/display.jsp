<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Weather Forcast</title>
</head>
<body>

<table>	
		<c:forEach items="${forcast}" var="day">
			<tr>
				<td>${day.day}</td>
				<td>${day.low}</td>
				<td>${day.temp}</td>
				<td>${day.weather}</td>
			</tr>	
		</c:forEach>			
		
	</table>





</body>
</html>