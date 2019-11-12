<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jurassic Park Database Home</title>
<!-- Bootstrap CSS -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link rel="stylesheet" href="style.css">
</head>
<body id="page-top" class="text-center">
<!-- Navigation -->
  <nav class="navbar navbar-expand-sm bg-dark">

  <!-- Links -->
  <ul class="navbar-nav">
    <li class="nav-item">
      <a class="nav-link" href="addDinoForm.do">Add a Dino</a>
    </li>
  </ul>
</nav>
  <div class="view my-container" style="background-repeat: no-repeat; background-size: cover; background-position: center center;">
	    <img src="https://d15v4l58k2n80w.cloudfront.net/file/1396975600/33656994729/width=1280/height=720/format=-1/fit=crop/crop=0x725+3144x1770/rev=1/t=421624/e=never/k=001b1ddb/One+Sheet+No+Logos.jpg">
	
	<h3 >Jurassic Park Database Home</h3>
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
	<h4 id="font1">List of all dinosaurs at Jurassic Park</h4>
	<c:if test="${not empty dinos}">
		<ul>
			<c:forEach var="dino" items="${dinos}">
				<li><a href="getDino.do?did=${dino.id}">ID: ${dino.id} --
						Name: ${dino.name} -- Species: ${dino.species}</a></li>
				<br>
			</c:forEach>
		</ul>
	</c:if>
	</div>
	<!-- bootstrap javascript -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>