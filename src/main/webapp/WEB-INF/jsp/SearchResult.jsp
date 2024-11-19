<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="center">
		<h1>Search Result</h1>
		<c:if test="${not empty error}">
			<p style="color: red;">${error}</p>
		</c:if>
		<c:if test="${not empty employee}">
			<table border="1">
				<tr>
					<th>ID</th>
					<td>${employee.empId}</td>
				</tr>
				<tr>
					<th>Name</th>
					<td>${employee.empName}</td>
				</tr>
				<tr>
					<th>Email</th>
					<td>${employee.empEmail}</td>
				</tr>
				<tr>
					<th>Department</th>
					<td>${employee.empDept}</td>
				</tr>
				<tr>
					<th>Salary</th>
					<td>${employee.empSal}</td>
				</tr>
				<tr>
					<th>Phone Number</th>
					<td>${employee.empPhno}</td>
				</tr>
			</table>
		</c:if>
		<form action="/" method="get">
			<button type="submit">Back</button>
		</form>

	</div>
</body>
</body>
</html>