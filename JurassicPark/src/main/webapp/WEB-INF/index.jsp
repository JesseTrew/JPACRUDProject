<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jurassic Park Database Home</title>
</head>
<body>
	<h3>Jurassic Park Database Home</h3>
	<form action="getDino.do" method="GET">
		<input type="text" name="did" placeholder="Enter Dino ID"/> <input type="submit"
			value="Display Dinosaur" />
	</form>
	<br>
	<div>
		<form action="updateDinoForm.do" method="GET">
			<input type="text" name="did" placeholder="Enter Dino ID"/> <input type="submit"
				value="Update Dinosaur" />
		</form>
		<br>
		<form action="deleteDinoResult.do" method="GET">
			<input type="text" name="did" placeholder="Enter Dino ID"/> <input type="submit"
				value="Delete Dinosaur" />
		</form>
		<br>
		<form action="addDinoForm.do" method="GET">
			<input class="btn btn-info" type="submit" value="Add a Dinosaur" />
		</form>
		<br>
	</div>
	<br>
	<h4>List of all dinosaurs at Jurassic Park</h4>
	<c:if test="${not empty dinos}">
		<ul>
			<c:forEach var="dino" items="${dinos}">
				<li><a href="getDino.do?did=${dino.id}">ID: ${dino.id} --
						Name: ${dino.name} -- Species: ${dino.species}</a></li>
				<br>
			</c:forEach>
		</ul>
	</c:if>
</body>
</html>