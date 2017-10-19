<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="jquery-3.2.1.js"></script>
<script>
var model = [];
model.address = "${place.address}"</script>


</head>
<body>
	<div id="main">
	<p> list items</p>
		<ul>
		</ul>
	</div>
	<div>
	<form:form commandName="newPlace">
	<form:label path="name">Insert Name</form:label>
	<form:input path="name"/>
	<form:label path="address">Insert Number</form:label>
	<form:input path="address"></form:input>
	<form:errors path="address"></form:errors>
	<input type="submit" value="add"/>
	</form:form>
	</div>
	<div id="submitted"><p data-address=${address}>${address}</p></div>
</body>
<script type="text/javascript" src="placeHandler.js"></script>
</html>