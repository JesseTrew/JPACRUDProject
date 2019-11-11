<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add a Dino</title>
</head>
<body>
	<h3>
		<strong>Add a dinosaur to the database</strong>
	</h3>
	<form action="addDino.do" method="POST" modelAttribute="dino">

		<label>Species (String input): </label> <input type="text"
			name="species"> <br /> <label>Name (String input): </label>
		<input type="text" name="name"> <br /> <label>Weight
			(Integer input): </label> <input type="text" name="weight"> <br /> <label>Height
			(Integer input): </label> <input type="text" name="height"> <br />
			<label>Diet (String input): </label> <input type="text"
			name="diet"> <br />
		<p>Flying?:</p>
		<select name="flying">
			<option value="true">Yes</option>
			<option value="false">No</option>
		</select> <br />  <br><label>Special Characteristics
			(String input): </label> <input type="text" name="specialChars"> <br /> <br>
		<input type="submit" value="Add Dinosaur">
	</form>
</body>
</html>