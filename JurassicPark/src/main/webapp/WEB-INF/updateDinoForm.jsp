<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Dinosaur</title>
</head>
<body>
<form action="updateDino.do" method="POST" modelAttribute="film">
	 <label>Name: </label>
	 <input type="hidden" name="id" value="${dino.id }">
	 <input type="text" name="name" value="${dino.name }"> 
	 <br />
	 <label>Species: </label>
	 <input type="text" name="species" value="${dino.species }">
	 <br /> 
	 <label>Height: </label>
	 <input type="text" name="height" value="${dino.height }"> 
	 <br /> 
	 <label>Diet: </label> 
	 <input type="text" name="diet" value="${dino.diet}"> 
	 <br />
	 <p>Flying?:</p>
		<select name="flying">
			<option value="true">Yes</option>
			<option value="false">No</option>
		</select>
		<br>
	 <label>Weight: </label>
	 <input type="text" name="weight" value="${dino.weight }">
	 <br /> 
	 <label>Special Characteristics: </label> 
	 <input type="text" name="specialChars" value="${dino.specialChars}">  
	 <br />
	 <input type="submit" value="Update Dinosaur">
</body>
</html>