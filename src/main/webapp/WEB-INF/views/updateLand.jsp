<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Land Page</title>
<%@include file="base.jsp" %>
</head>
<body style="background-image: url('<c:url value="/resources/images/background5.jpg" />');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;">
  
  
 <div class="container mt-5">
  <div class="row justify-content-center">
 
   <div class="col-6 bg-info rounded">
    <form action="${pageContext.request.contextPath }/UpdateLand" method="post" enctype="multipart/form-data">
	<h3 class="text-center">Update Land Details</h3>
	<input type="hidden" name="id" value="${land.id }">
     <div class="form-group my-2">
     	<label class="mb-1">Description </label>
     	<input type="text" class="form-control" name="description" value="${land.description }" required>
     </div>
     <div class="form-group my-2">
      <label class="mb-1">Location </label>
      <input type="text" class="form-control" name="location" value="${land.location }" required>
     </div>
     <div class="form-group my-2">
      <label class="mb-1">Price </label>
      <input type="number" class="form-control" name="price" value="${land.price }" required>
     </div>
     <div class="form-group my-2">
      <label class="mb-1">About </label>
      <input type="text" class="form-control" name="about" value="${land.about }" required>
     </div>
     <div class="form-group my-2">
      <label class="mb-1">First Photo </label>
      <input type="file" class="form-control" name="photo" value="${land.photo }" required>
     </div>
     <div class="form-group my-2">
      <label class="mb-1">Second Photo</label>
      <input type="file" class="form-control" name="photo1" value="${land.photo1 }" required>
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