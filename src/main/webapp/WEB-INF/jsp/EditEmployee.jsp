<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script>
	function validateformEdit() {

		console.log("validation function");//debug check

		var empName = document.getElementsByName("empName")[0].value.trim();

		var empEmail = document.getElementsByName("empEmail")[0].value.trim();
		var empDept = document.getElementsByName("empDept")[0].value.trim();
		var empSal = document.getElementsByName("empSal")[0].value.trim();
		var empPhno = document.getElementsByName("empPhno")[0].value.trim();

		if (empName == null || empName == "") {
			alert("Name Can't be blank or number");

			return false;//this condition has not been met
		} else if (/\d/.test(empName)) {
			alert("Name Can't be a number");
			return false;

		} else if (empPhno == null || empPhno == "") {
			alert("plz enter the phone number");
			return false;
		} else if (!/^\d{10}$/.test(empPhno)) {
			alert("Contact Number must be a 10-digit number");
			return false;

		} else if (empDept == null || empDept == "") {
			alert("plz enter the department");
			return false;
		} else if (/\d/.test(empDept)) {
			alert("depart Can't be a number");
			return false;
		} else if (empSal == null || empSal == "") {
			alert("plz enter the salary");
			return false;
		} else if (empEmail == "") {
			alert("plz enter email");
			return false;
		}
		return true;

	}
</script>
</head>
<body>
	<div>
		<form name="editUser" method="post" action="/save-user"
			modelAttribute="employeeEntity" onsubmit="return validateformEdit()">
			<h1>Edit User</h1>
			<table>
				<input type="hidden" name="empId" value="${emp.empId}" />
				<tr>
					<td><label>Name:</label></td>
					<td><input type="text" name="empName" id="empName"
						value="${emp.empName}" /></td>
				</tr>

				<tr>
					<td><label>Email:</label></td>
					<td><input type="email" name="empEmail" id="empEmail"
						value="${emp.empEmail}" readonly /></td>
				</tr>
				<tr>
					<td><label>Department:</label></td>
					<td><input type="text" name="empDept" id="empDept"
						value="${emp.empDept}" /></td>
				</tr>
				<tr>
					<td><label>Salary:</label></td>
					<td><input type="text" name="empSal" id="empSal"
						value="${emp.empSal}" readonly /></td>
				</tr>
				<tr>
					<td><label>Contact number:</label></td>
					<td><input type="number" name="empPhno" id="empPhno"
						value="${emp.empPhno}" /></td>
				</tr>
			</table>
			<br>
			<button type="submit" name="edit_submit">
				<span></span>SAVE CHANGES
			</button>
		</form>
	</div>

</body>
</html>