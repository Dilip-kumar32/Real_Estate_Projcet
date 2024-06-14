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
    <title>Real Estate</title>
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
 
 <!-- banner start here -->
 <div class="jumbotron banner">
  <div class="container-fluid  bg-primary text-center text-white ">
	 <h1 class="display-2">Welcome to Our RealEstate Website </h1>
	 <p>Real estate is property consisting of land and the buildings on it, along with its natural resources such 
	 as crops, minerals or water; immovable property of this nature; an interest vested in this an item of real property,
	  buildings or housing in general.</p>
	 
	  <a href="${pageContext.request.contextPath }/login" class="btn btn-outline-light btn-lg mb-3"><span class="fa fa-user-circle fa-spin"></span>Login</a>
	 
  </div>
 </div>
  <!-- banner end here -->
  
  
  <!-- body part start here -->
  
  <div class="container mt-5">
   <h1 class="text-center mb-2"> This is for Flats</h1>
  <div class="row g-5">
  <div class="col-4 ">
  <div class="card" style="width: 25rem;">
  <img src="<c:url value="/resources/images/duplex3.jpg" />" class="card-img-top" alt="..."style="height:266px;">
  <div class="card-body">
    <h5 class="card-title">Flats</h5>
    <p class="card-text">A flat, similar to an apartment, is a housing unit that's self-contained but is part of a larger building with several units.</p>
    <div class="container text-center "><a href="${pageContext.request.contextPath }/displayallFlats" class="btn btn-primary px-4">Flats</a></div>
  </div>
</div>
  </div>
  <div class="col-4">
  <div class="card" style="width: 25rem;">
  <img src="<c:url value="/resources/images/flat2.jpg" />" class="card-img-top" alt="...">
  <div class="card-body">
    <h5 class="card-title">Flats</h5>
    <p class="card-text">A flat, similar to an apartment, is a housing unit that's self-contained but is part of a larger building with several units.</p>
    <div class="container text-center"><a href="${pageContext.request.contextPath }/displayallFlats" class="btn btn-primary px-4">Flats</a></div>
  </div>
</div>
  </div>
  
  <div class="col-4">
  <div class="card" style="width: 25rem;">
  <img src="<c:url value="/resources/images/flat3.jpg" />"  class="card-img-top" alt="..." style="height:266px;">
  <div class="card-body">
    <h5 class="card-title">Flats</h5>
    <p class="card-text">A flat, similar to an apartment, is a housing unit that's self-contained but is part of a larger building with several units.</p>
    <div class="container text-center"><a href="${pageContext.request.contextPath }/displayallFlats" class="btn btn-primary px-4">Flats</a></div>
  </div>
</div>
  </div>
  
  
  </div>
  <h1 class="text-center mt-4"> This is for Duplex</h1>
  <div class="row g-5">
  <div class="col-4 ">
  <div class="card" style="width: 25rem;">
  <img src="<c:url value="/resources/images/duplex1.jpg" />" class="card-img-top" alt="..."style="height:266px;">
  <div class="card-body">
    <h5 class="card-title">Duplex</h5>
    <p class="card-text">A duplex house plan has two living units attached to each other, either next to each other as townhouses, condominiums or above each other like apartments.</p>
    <div class="container text-center"><a href="${pageContext.request.contextPath }/displayallDuplex" class="btn btn-primary px-4">Duplex</a></div>
  </div>
</div>
  </div>
  <div class="col-4">
  <div class="card" style="width: 25rem;">
  <img src="<c:url value="/resources/images/duplex2.jpg" />" class="card-img-top" alt="..." style="height:266px;">
  <div class="card-body">
    <h5 class="card-title">Duplex</h5>
    <p class="card-text">A duplex house plan has two living units attached to each other, either next to each other as townhouses, condominiums or above each other like apartments.</p>
    <div class="container text-center"><a href="${pageContext.request.contextPath }/displayallDuplex" class="btn btn-primary px-4">Duplex</a></div>
  </div>
</div>
  </div>
  
  <div class="col-4">
  <div class="card" style="width: 25rem;">
  <img src="<c:url value="/resources/images/duplex4.jpg" />" class="card-img-top" alt="..." style="height:266px;">
  <div class="card-body">
    <h5 class="card-title">Duplex</h5>
    <p class="card-text">A duplex house plan has two living units attached to each other, either next to each other as townhouses, condominiums or above each other like apartments.</p>
    <div class="container text-center"><a href="${pageContext.request.contextPath }/displayallDuplex" class="btn btn-primary px-4">Duplex</a></div>
  </div>
</div>
  </div>
  
  
  </div>
  <h1 class="text-center mt-4"> This is for Lands</h1>
  <div class="row g-5">
  <div class="col-4 ">
  <div class="card" style="width: 25rem;">
  <img src="<c:url value="/resources/images/land1.jpg" />" class="card-img-top" alt="...">
  <div class="card-body">
    <h5 class="card-title">Lands</h5>
    <p class="card-text">Land, also known as dry land, ground, or earth, is the solid terrestrial surface of Earth not submerged by the ocean or another body of water.</p>
    <div class="container text-center"><a href="${pageContext.request.contextPath }/displayallLand" class="btn btn-primary px-4">Lands</a></div>
  </div>
</div>
  </div>
  <div class="col-4">
  <div class="card" style="width: 25rem;">
  <img src="<c:url value="/resources/images/land2.jpg" />" class="card-img-top" alt="...">
  <div class="card-body">
    <h5 class="card-title">Lands</h5>
    <p class="card-text">Land, also known as dry land, ground, or earth, is the solid terrestrial surface of Earth not submerged by the ocean or another body of water.</p>
    <div class="container text-center"><a href="${pageContext.request.contextPath }/displayallLand" class="btn btn-primary px-4">Lands</a></div>
  </div>
</div>
  </div>
  
  <div class="col-4">
  <div class="card" style="width: 25rem;">
  <img src="<c:url value="/resources/images/land3.jpg" />" class="card-img-top" alt="..." style="height:266px;">
  <div class="card-body">
    <h5 class="card-title">Lands</h5>
    <p class="card-text">Land, also known as dry land, ground, or earth, is the solid terrestrial surface of Earth not submerged by the ocean or another body of water.</p>
    <div class="container text-center"><a href="${pageContext.request.contextPath }/displayallLand" class="btn btn-primary px-4">Lands</a></div>
  </div>
</div>
  </div>
  
  
  </div>
  
  </div>
   
    <div class="container-fluid bg-secondary mt-3 py-3 mb-0 text-white text-center">
  <p class="d-inline-flex pt-3"> Email: dilipkug9@gmail.com</p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <a class=" text-white text-decoration-none" href="${pageContext.request.contextPath }">Home</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <a class=" text-white text-decoration-none" href="${pageContext.request.contextPath }/real_estate">Real_Estate</a>
  </div>
  </body>
</html>