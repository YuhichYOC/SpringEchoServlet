<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page pageEncoding="UTF-8" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" 
           prefix="c" %>

<%@ taglib uri="http://www.springframework.org/tags" 
           prefix="spring" %>

<%@ taglib uri="http://www.springframework.org/tags/form" 
           prefix="form" %>

<!DOCTYPE html>
<html>

<head>

<%@ include file="commonreference.jsp" %>

<title>
Echo Application
</title>
</head>

<body>

<div class="centerContents">

<%@ include file="commonheader.jsp" %>

	<p>
		Hello <c:out value="${name}" /> !
	</p>

</div>

</body>

</html>