<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div class="center">
		<a href="/addEmployees">Add Employee</a>

<br><br><br>
		<c:if test="${empty employees}">
			<h2>No Employee found!</h2>
		</c:if>

		<c:if test="${not empty employees}">
			<div>
				<form action="/search-employees" method="get">
					<input type="text" name="id" placeholder="Search employees by id...">
					<button type="submit">Search</button>
				</form>
				<br><br>
				
				<table>
					<thead>
						<tr>
							<th>Name</th>
							
							<th>Email</th>
							<th>Department</th>
							<th>Salary</th>
							<th>Phone Number</th>
							<th>Edit</th>
							<th>Delete</th>
						</tr>
					</thead>

					<tbody>
						<c:forEach var="employee" items="${employees}">
							<tr>
								<td>${employee.empName}</td>
								<td>${employee.empEmail}</td>
								<td>${employee.empDept}</td>
								<td>${employee.empSal}</td>
								<td>${employee.empPhno}</td>
								<td><a href="/employee-update/${employee.empId}">Edit</a></td>
								<td><a href="/employee-delete/${employee.empId}">Delete</a></td>
							</tr><br><br>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</c:if>
	</div>
</body>

</body>
</html>