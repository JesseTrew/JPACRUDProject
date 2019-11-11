<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Added Dinosaur</title>
</head>
<body>
<h1>Dinosaur Successfully Added to Database</h1>

<h2>Species: ${dino.species}</h2>
		<h3>Name: ${dino.name}</h3>
		<p>ID: ${dino.id}</p>
		<p>Height: ${dino.height} meters</p>
		<p>Weight: ${dino.weight} kilograms</p>
		<p>Flying: ${dino.flying}</p>
		<p>Diet: ${dino.diet}</p>
		<p>Special Characteristics: ${dino.specialChars}</p>
</body>
</html>