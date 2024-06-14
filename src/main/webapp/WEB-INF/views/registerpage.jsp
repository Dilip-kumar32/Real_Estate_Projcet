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
    <title>Register page</title>
    <style>
    .banner{
	height: 200px;
	   }
    </style>
  </head>
  <body style="background-image: url('<c:url value="/resources/images/background3.jpg" />');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;">
  <!--  navbar start here -->
  <%@include file="navbar.jsp" %>
 <!-- navbar end here --> 
 
  <div class="container mt-5">
  <h1 class="text-center mb-3">${msg}</h1>
  <div class="row justify-content-center">
 
   <div class="col-6 bg-info rounded pt-2">
    <form action="${pageContext.request.contextPath }/SaveServlet" method="post" enctype="multipart/form-data">
    <h3 class="text-center">Register Your Self</h3>
     <div class="form-group my-2">
     	<label class="mb-1">Name </label>
     	<input type="text" class="form-control" name="user_name" placeholder="Enter your name" required>
     </div>
     <div class="form-group my-2">
      <label class="mb-1">Email </label>
      <input type="email" class="form-control" name="user_email" placeholder="Enter your email" required>
     </div>
     <div class="form-group my-2">
      <label class="mb-1">Password </label>
      <input type="password" class="form-control" name="user_password" placeholder="Enter your password" required>
     </div>
     <div class="form-group my-2">
      <label class="mb-1">Address </label>
      <input type="text" class="form-control" name="user_address" placeholder="Enter your address" required>
     </div>
     <div class="form-group my-2">
      <label class="mb-1">Phone </label>
      <input type="text" class="form-control" name="user_phone" placeholder="Enter your phone" required>
     </div>
     <div class="form-group my-2">
      <label class="mb-1">Photo</label>
      <input type="file" class="form-control" name="user_photo" required>
     </div>
     <div class="form-group my-2">
     <label >Male</label><input type="radio" name="user_gender" value="Male" class="mx-2" required >
     <label >Female</label><input type="radio" name="user_gender" value="Female" class="mx-2" required>
     </div>
    <div class="container text-center my-3">
     <button type="submit" class="btn btn-outline-light">Submit</button>
    </div>
    
    </form>
  </div>
  </div>
 </div>

</body>
</html>