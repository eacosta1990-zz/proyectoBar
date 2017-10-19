<%@ include file="./cabezera.jsp"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:if test="${msg != null}">
	<div id="success" class="alert alert-success" role="alert">${msg}</div>
	<br>

</c:if>
<c:if test="${error != null}">
	<div id="error" class="alert alert-danger" role="alert">${error}</div>
	<br>

</c:if>


<div id="resultado"></div>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
</body>
</html>