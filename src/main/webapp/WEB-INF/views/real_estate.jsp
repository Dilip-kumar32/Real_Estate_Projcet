<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@include file="base.jsp" %>
<style>
.text-justify{
  text-align: justify;
  text-justify: inter-word;
}
</style>
</head>
<body style="background-image: url('<c:url value="/resources/images/background3.jpg" />');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;">
  <!--  navbar start here -->
 <nav class="navbar navbar-expand-lg navbar-light bg-secondary">
  <div class="container-fluid ">
    <a class="navbar-brand text-white" href="real_estate.jsp">RealEstate</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">      
	    <li class="nav-item"> <a href="${pageContext.request.contextPath }" class=" nav-link text-decoration-none text-white">Home</a></li>
      </ul>
     
    </div>
  </div>
</nav>
<!-- navbar end here -->

  <div class="container text-justify mt-5 ">
    <p>Real estate platform is a digital space where realtors, home sellers, and homebuyers can get in touch to make a purchase or rent contract for a real estate item. </p>
    <p>First and foremost, building a real estate website should serve a purpose. The purpose of all real estate platforms is to efficiently solve a user’s problem – search for a new home in a quick and troublesome way. To do that, an app should:</p>
    <p>No matter whether you're the one who sells, buys, or rents a house, you know how stressful it could be. Each case has its difficulties, and each role has its obstacles. So it brings us to a very logical decision – create real estate websites for different user roles with various functionality.</p>
    <p>The real estate marketplace works as a mediator between homeowners and buyers/renters. Property owners can list their estate on the site, set the approximate price, and find the customers. Customers, on the other hand, can search for a place, check property photos, building plans, and overall descriptions. </p>
    <p>A property listing site is a real estate platform where people can find houses for sale or rent. Unlike a real estate marketplace, homeowners usually can't list their property without an agent. </p>
    <p>Property management websites are all about homeowners. They're in the driving seat and can fully manage their property and potential customers. Usually, websites for property management are focused on residential and commercial properties.</p>
  </div>

</body>
</html>