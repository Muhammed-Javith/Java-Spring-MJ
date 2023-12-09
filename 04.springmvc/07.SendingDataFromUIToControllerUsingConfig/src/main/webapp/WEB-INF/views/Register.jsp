<%@page language="java" isELIgnored="false"
	contentType="text/html; charset=ISO-885
	9-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPEhtml>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO8859-1">
<title>Insert title here</title>
<style type="text/css">
td {
	color: blue;
}

#formDiv {
	width: 30%;
	border: 2px solid green;
	float: left;
}

#data {
	width: 30%;
	height: 200px;
	float: left;
	margin-left: 30px;
	border: 2px solid green;
}
</style>
</head>
<body>
	<div id="formDiv">
		<form action="reg" method="POST" id="form">
			<table border="1">
				<tr>
					<td>Employee ID ::</td>
					<td><input type="text" name="empId"></td>
				</tr>
				<tr>
					<td>Employee Name ::</td>
					<td><input type="text" name="empName" /></td>
				</tr>
				<tr>
					<td>Employee Password ::</td>
					<td><input type="password" name="empPwd" /></td>
				<tr>
					<td>Employee Gender ::</td>
					<td><input type="radio" name="empGen" value="MALE" /> MALE <input
						type="radio" name="empGen" value="FEMALE" /> FEMALE</td>
				</tr>
				<tr>
					<td>Employee Address ::</td>
					<td><textarea rows="3" cols="19" name="empAddr"></textarea></td>
				</tr>
				<tr>
					<td>Employee Country ::</td>
					<td><select name="empCountry">
							<option>INDIA</option>
							<option>RUSIA</option>
							<option>ISRIAL</option>
							<option>AMERICA</option>
					</select></td>
				</tr>
				<tr>
					<td><input type="submit" value="Register" /></td>
				</tr>
			</table>
		</form>
	</div>
	<div id="data">
		&nbsp;&nbsp;Employee ID :: ${emp.empId } <br>
		&nbsp;&nbsp;Employee Name :: ${emp.empName }<br>
		&nbsp;&nbsp;Employee Password :: <br> 
		&nbsp;&nbsp;Employee Gender::${emp.empGen }<br> 
		&nbsp;&nbsp;Employee Address:: ${emp.empAddr }<br>
		&nbsp;&nbsp;Employee Country:: ${emp.empCountry }<br>
	</div>
</body>
</html>