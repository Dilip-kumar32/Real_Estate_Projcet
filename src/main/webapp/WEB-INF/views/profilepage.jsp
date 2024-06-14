<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    
    <%@include file="base.jsp" %>
    <title>Real Estate</title>
    <style>
    .banner{
	height: 200px;
	   }
    </style>
  </head>
  <body style="background-image: url('<c:url value="/resources/images/background5.jpg" />');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;">
  
  <!--  navbar start here -->
 <nav class="navbar navbar-expand-lg navbar-light bg-secondary">
  <div class="container-fluid ">
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">      
      	<li class="nav-item"> <a href="${pageContext.request.contextPath }/ServletLogout" class=" nav-link text-decoration-none text-white"><span class="fa fa-user-circle fa-spin"></span> LogOut</a></li>
      </ul>
    </div>
    <a href="${pageContext.request.contextPath }/profile" class=" nav-link d-flex text-decoration-none text-white"><c:out value="${loginUser.getUser_name()}" /></a>
	   
  </div>
</nav>
 <!-- navbar end here --> 
 
<div class="container text-center mt-5">
<h3>${message}</h3>
<table class="table table-bordered table-striped table-light">
  <thead class="table-dark py-2">
    <tr>
      <th scope="col" >Features</th>
      <th scope="col">Add Operation</th>
      <th scope="col">Update Operation</th>
      <th scope="col">Delete Operation</th>
    </tr>
  </thead>
  <tbody >
    <tr>
      <th scope="row" >Land</th>
      <td><a href="${pageContext.request.contextPath }/land_form" class="btn btn-outline-success">Add Property </a></td>
      <td><a href="${pageContext.request.contextPath }/displayalllandupdate" class="btn btn-outline-warning">Update Property</a></td>
      <td><a href="${pageContext.request.contextPath }/displayalllandfordelete" class="btn btn-outline-danger">Delete Property</a></td>
    </tr>
    <tr>
      <th scope="row" >Flats</th>
      <td><a href="${pageContext.request.contextPath }/flats_form" class="btn btn-outline-success">Add Property</a></td>
      <td><a href="${pageContext.request.contextPath }/displayallflatsupdate" class="btn btn-outline-warning">Update Property</a></td>
      <td><a href="${pageContext.request.contextPath }/displayallflatsfordelete" class="btn btn-outline-danger">Delete Property</a></td>
    </tr>
    <tr>
      <th scope="row" >Duplex</th>
      <td><a href="${pageContext.request.contextPath }/duplex_form" class="btn btn-outline-success">Add Property</a></td>
      <td><a href="${pageContext.request.contextPath }/displayallduplexupdate" class="btn btn-outline-warning">Update Property</a></td>
      <td><a href="${pageContext.request.contextPath }/displayallduplexfordelete" class="btn btn-outline-danger">Delete Property</a></td>
    </tr>
    
  </tbody>
</table>

</div> 

</body>
</html>