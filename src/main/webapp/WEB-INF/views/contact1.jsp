<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="base.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contact Page</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-secondary">
  <div class="container-fluid ">
   <a href="${pageContext.request.contextPath }/flats/${flatsId}"class="navbar-brand text-white">Back</a>
    
  </div>
</nav>
<div class="container">
<div class="row g-5 mt-5">
  
  <div class="card " style="width: 100%;">
  <img src="<c:url value="/resources/images/dilip.jpeg" />" class="card-img-top mt-2" alt="..."><br>
  <div class="card-body text-center">
    <h5 class="card-title">Name:Dilip Chauhan</h5>
    <p class="card-text">Phone:6202334512</p>
    <p class="card-text">Email:dilipgmail.com</p>
  </div>
</div>
  </div>
</div>

</body>
</html>