<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags"  prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><spring:message code="user.login" /></title>
</head>
<body>
<h1><spring:message code="user.login" /></h1>

	<div id="langsel">
		<a href="?lang=en">in english</a> | <a href="?lang=fi">suomeksi</a>
	</div>
	
		<form:form modelAttribute="henkilo" method="post">
		  	<fieldset>		
				<p>
					<form:label	path="kayttajatunnus"><spring:message code="user.username" /></form:label><br/>
					<form:input path="kayttajatunnus" />		
				</p>
				<p>	
					<form:label path="salasana"><spring:message code="user.password" /></form:label><br/>
					<form:input path="salasana" type="password"/>
				</p>
				<p>	
					<button type="submit"><spring:message code="user.logincommand" /></button>
				</p>
			</fieldset>
		</form:form>

</body>
</html>