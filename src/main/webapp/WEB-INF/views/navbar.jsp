
<nav class="navbar navbar-expand-lg navbar-light bg-secondary">
  <div class="container-fluid ">
    <a class="navbar-brand text-white" href="${pageContext.request.contextPath }/real_estate">RealEstate</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active text-white" aria-current="page" href="${pageContext.request.contextPath }">Home</a>
       <li class="nav-item "> <a href="${pageContext.request.contextPath }/displayallLand" class=" nav-link text-decoration-none text-white">Land</a></li>
	    <li class="nav-item "> <a href="${pageContext.request.contextPath }/displayallFlats" class=" nav-link text-decoration-none text-white">Flats</a></li>
        <li class="nav-item "> <a href="${pageContext.request.contextPath }/displayallDuplex" class=" nav-link text-decoration-none text-white">Duplex</a></li>
        
         
	    <li class="nav-item "> <a href="${pageContext.request.contextPath }/registerpage" class=" nav-link text-decoration-none text-white">SignIn</a></li>
	    <li class="nav-item"> <a href="${pageContext.request.contextPath }/login" class=" nav-link text-decoration-none text-white"><span class="fa fa-user-circle fa-spin"></span>Login</a></li>
	      
        
      </ul>
      <form action="${pageContext.request.contextPath }/searchbar" class="d-flex">
        <input class="form-control me-2" type="search" placeholder="land,flats,duplex." name="data" aria-label="Search">
        <button class="btn btn-outline-light" type="submit">Search</button>
      </form>
    </div>
  </div>
</nav>

<!-- href="${pageContext.request.contextPath }/land"
href="${pageContext.request.contextPath }/flats"
href="${pageContext.request.contextPath }/duplex"
href="${pageContext.request.contextPath }/rent"-->
