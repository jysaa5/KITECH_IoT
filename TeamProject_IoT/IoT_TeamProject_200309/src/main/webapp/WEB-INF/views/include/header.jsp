<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page trimDirectiveWhitespaces="true"%>
<script>

</script>

<style>
    .nav-link{
    margin: 0 30px
    }
    
    .navbar-brand{
    font-size: 2em;
    font-style: italic;
    padding: 0 10px;
    }
    a.a-line{
     text-decoration:none;
     color: #646464
    }
</style>

	<div class="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-white border-bottom shadow-sm">
		<h5 class="my-0 mr-md-auto font-weight-normal"><a href="<c:url value="/"/>" class="a-line">5G</a></h5>
		<nav class="my-2 my-md-0 mr-md-3">
			<a class="p-2 text-dark" href="<c:url value="/cctv/userCctv"/>">CCTV</a> 
			<a class="p-2 text-dark" href="<c:url value="/led/userLed"/>">LED</a> 
			<a class="p-2 text-dark" href="<c:url value="/styler/userStyler"/>">Styler</a> 
			<a class="p-2 text-dark" href="<c:url value="/history/userSelectLog"/>">My History</a>
		</nav>
		<a class="btn btn-outline-primary" href="#">Sign up</a>
	</div>