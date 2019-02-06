<!doctype html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="utf-8" />
<title>seasons</title>
</head>
<body>
<ul>
	<c:forEach var="season" items="${seasons}" >
		<li>${season}</li>
	</c:forEach>
</ul>
</body>
</html>
