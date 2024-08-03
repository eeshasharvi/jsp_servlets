<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="bootstrap.jsp" %>
</head>
<style>
body{
   background-color: black;
}
input{
width:50%;
margin: 10px 20px;
}
.card{
justify-content:center;
}
</style>
<body>
<!--  
<section>
<div class="container">
<div class="row">
    <div class="col-md-8">
        <div class="card">
            <div class="card-content">
                <form action="register" method="post">
                    <input type="text" placeholder="Enter Username" class="form-control" name="username">
                    <input type="email" placeholder="Enter email" class="form-control" name="email">
                    <input type="text" placeholder="Enter branch" class="form-control" name="branch">
                    <button class="btn btn-outline-primary">register</button>
                </form>
            </div>
        </div>
    </div>
</div>


</div>


</section>
-->
<section class="h-100 h-custom" style="background-color: #8fc4b7;">
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-lg-8 col-xl-6">
        <div class="card rounded-3">
          <div class="card-body p-4 p-md-5">
            

            <form action="register" method="post">
             <input type="text" placeholder="Enter Username" class="form-control" name="username">
                    <input type="email" placeholder="Enter email" class="form-control" name="email">
                    <input type="text" placeholder="Enter branch" class="form-control" name="branch">
                    <button class="btn btn-outline-primary">register</button>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>


</body>
</html>