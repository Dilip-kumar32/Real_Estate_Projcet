<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lands</title>
<%@include file="base.jsp" %>
</head>

<body style="background-image: url('<c:url value="/resources/images/background3.jpg" />');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;">
<nav class="navbar navbar-expand-lg navbar-light bg-secondary">
  <div class="container-fluid ">
   <a href="${pageContext.request.contextPath }/displayallLand"class="navbar-brand text-white">Back</a>
    
  </div>
</nav>
   <div class="container">
  <div class="row g-5 mt-5">
  
  <div class="card " style="width: 100%;">
  <img src="<c:url value="/resources/images/${land.photo}" />" class="card-img-top mt-2" alt="..."><br>
  <img src="<c:url value="/resources/images/${land.photo1}" />" class="card-img-top" alt="...">
  <div class="card-body text-center">
    <h5 class="card-title">Lands</h5>
    <p class="card-text">Description: ${land.description}</p>
    <p class="card-text">Location: ${land.location}</p>
    <p class="card-text">About: ${land.about}</p>
    <p class="card-text">Price: ${land.price}</p>
    <div class="container text-center"><a href="${pageContext.request.contextPath }/contact" class="btn btn-primary px-4">Contact To Dealer</a></div>
  </div>
</div>
  </div>
 
  
  </div>
  
  
</body>
</html>