<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="base.jsp" %>
</head>
<body style="background-image: url('<c:url value="/resources/images/background3.jpg" />');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;">
<nav class="navbar navbar-expand-lg navbar-light bg-secondary">
  <div class="container-fluid ">
    <a href="${pageContext.request.contextPath }/profilepage"class="navbar-brand text-white">Back</a>
   <marquee class="text-light"><h3>Update Your Profile</h3></marquee>
    
  </div>
</nav>
<div class="container mt-5">
  <h1 class="text-center mb-3">${msg}</h1>
  <div class="row justify-content-center">
  <!--<c:out value="${loginId}" /> this is for session value-->
   <div class="col-6 bg-info rounded">
    <form action="${pageContext.request.contextPath }/UpdateServlet" method="post" enctype="multipart/form-data">
    <h3 class="text-center">Update your Profile</h3>
    <div class="form-group my-2">
    <input type="hidden" name="id" value="${loginUser.getId() }"/>
    </div>
     <div class="form-group my-2">
     	<label class="mb-1">Name </label>
     	<input type="text" class="form-control" name="user_name" placeholder="Enter your name" required value="${loginUser.getUser_name() }">
     </div>
     <div class="form-group my-2">
      <label class="mb-1">Email </label>
      <input type="email" class="form-control" name="user_email" placeholder="Enter your email" required value="${loginUser.getUser_email()}" />
     </div>
     <div class="form-group my-2">
      <label class="mb-1">Password </label>
      <input type="password" class="form-control" name="user_password" placeholder="Enter your password" required value="${loginUser.getUser_password()}">
     </div>
     <div class="form-group my-2">
      <label class="mb-1">Address </label>
      <input type="text" class="form-control" name="user_address" placeholder="Enter your address" required value="${loginUser.getUser_address()}">
     </div>
     <div class="form-group my-2">
      <label class="mb-1">Phone </label>
      <input type="text" class="form-control" name="user_phone" placeholder="Enter your phone" required value="${loginUser.getUser_phone()}">
     </div>
     <div class="form-group my-2">
      <label class="mb-1">Photo</label>
      <input type="file" class="form-control" name="user_photo" required value="${loginUser.getUser_photo()}" />
     </div>
     <div class="form-group my-2">
     <label >Male</label><input type="radio" name="user_gender" value="Male" class="mx-2" required >
     <label >Female</label><input type="radio" name="user_gender" value="Female" class="mx-2" required>
     </div>
    <div class="container text-center my-3">
     <button type="submit" class="btn btn-outline-light">Update</button>
    </div>
    
    </form>
  </div>
  </div>
 </div>
</body>
</html>