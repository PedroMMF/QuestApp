<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Questionary App</title>
		
		<!--  reference our style sheet -->
		<link type="text/css"
			  rel="stylesheet"
			  href="${pageContext.request.contextPath }/src/main/webapp/resources/css/style.css"/>
	</head>
	<body>
		<div id="wrapper">
			<div id="header">
				<h2>Questionary App</h2>
			</div>
		</div>
		<br><br>
		
		<table>
					<tr>
						<td><input type="submit" value="Edit" class="button" /></td>
						<td><input type="submit" value="List" class="button" /></td>
					</tr>
		</table>
	</body>
</html>


