<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Duplex Details</title>
<%@include file="base.jsp" %>
</head>
<body>
<!-- ************************* important method use for back to the previous page *************************** -->
<nav class="navbar navbar-expand-lg navbar-light bg-secondary">
  <div class="container-fluid ">
    <a href="${pageContext.request.contextPath }/profilepage"class="navbar-brand text-white">Back</a>
   <marquee class="text-light"><h3>Update Flats Property</h3></marquee>
    
  </div>
</nav>
<!-- **************************** navbar end here************************** -->
	
 <div class="container mt-5">
   
  <div class="row g-5">
<c:forEach items="${flats}" var="l">
<div class="col-4 ">
  <div class="card" style="width: 25rem;">
  <img src="<c:url value="/resources/images/${l.photo }" />" class="card-img-top" alt="..."style="height:266px;">
  <div class="card-body text-center">
    <h5 class="card-title">Flats</h5>
    <p class="card-text">Description: ${l.description}</p>
    <p class="card-text">Location: ${l.location }</p>
    <p class="card-text">About: ${l.about}</p>
    <p class="card-text">Price: ${l.price}</p>
    <div class="container text-center "><a href="${pageContext.request.contextPath }/updateflats/${l.id}" class="btn btn-primary px-4">Update</a></div>
  </div>
</div>
  </div>
</c:forEach>
</div>
</div>
</body>
</html>