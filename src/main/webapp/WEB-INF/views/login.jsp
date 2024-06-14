<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    
    <%@include file="base.jsp" %>
    <title>Login page</title>
    <style>
    .banner{
	height: 200px;
	   }
	 .imageforbackground{
	   background-image: url('<c:url value="/resources/images/${photo}"/>');
	   background-repeat: no-repeat;
       background-size: 416px 289px;
	   }
    </style>
  </head>
  <body style="background-image: url('<c:url value="/resources/images/background3.jpg"/>');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;">
  
  <!--  navbar start here -->
  <%@include file="navbar.jsp" %>
  
 <!-- navbar end here --> 
 
  
  
  <div class="container mt-5" >
  <div class="row justify-content-center">
  	<div class="col-4  rounded" >
  <div class="card imageforbackground bg-info">
  	
  	<h5 class="card-title text-center mt-3">Login Page</h5>
  	<div class="card-body " >
  	
  	
  	 <form action="${pageContext.request.contextPath }/ServletLogin" method="post">
  	 
  	  <div class="form-group my-2">
  	  	<label class="text-white">Email</label>
  	  	<input type="text" class="form-control" placeholder="Enter your email" name="user_email">
  	  </div>
  	  <div class="form-group">
  	   <label class="text-white">Password</label>
  	   <input type="password" class="form-control" placeholder="Enter your password" name="user_password">
  	  </div>
  	  <div class="container text-center my-3">
  	  <button type="submit" class="btn btn-outline-light">Submit</button>
  	  </div>
  	 </form>
  	 </div>
  	</div>
  	</div>
  	</div>
  </div>
 
    
  </body>
</html>