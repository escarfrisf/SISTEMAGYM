<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%-- <jsp:include page="general.jspf"></jsp:include> --%>
<link rel="stylesheet"
	href="http://netdna.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	type="text/css">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="resources/images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="resources/vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
<!-- 	<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css"> -->
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="resources/vendor/animate/animate.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="resources/vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="resources/vendor/select2/select2.min.css">
<!--===============================================================================================-->
<!-- 	<link rel="stylesheet" type="text/css" href="resources/css/util.css"> -->
	<link rel="stylesheet" type="text/css" href="resources/css/main.css">
<!--===============================================================================================-->
</head>
<body>
	
	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100">
				<div class="login100-pic js-tilt" data-tilt>
					<img src="resources/images/logo.jpg" alt="IMG">
				</div>

				<form class="login100-form validate-form" action="Home" method="GET"> 
					<span class="login100-form-title">
						INICIAR SESÍON
					</span>

					<div class="wrap-input100"  data-validate = "Password is required">
						<input class="input100" type="text" id="usertxt" name="usertxt" placeholder="Usuario">
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<i class="fa fa-envelope" aria-hidden="true"></i>
						</span>
					</div>

					<div class="wrap-input100" data-validate = "Password is required">
						<input class="input100" type="password" name="passtxt" id="passtxt" placeholder="Password">
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<i class="fa fa-lock" aria-hidden="true"></i>
						</span>
					</div>
					
					<div class="container-login100-form-btn">
				
						<input type="submit"  class="login100-form-btn"  >
							Login
						</input>
					</div>
				

					<div class="text-center p-t-12">
						<span class="txt1">
							Forgot
						</span>
						<a class="txt2" href="#">
							Username / Password?
						</a>
					</div>

					<div class="text-center p-t-136">
						<a class="txt2" href="#">
							Create your Account
							<i class="fa fa-long-arrow-right m-l-5" aria-hidden="true"></i>
						</a>
					</div>
				</form>
			</div>
		</div>
	</div>
	
	


<script src="resources/js/jquery.js"></script>

<script src="resources/js/jquery.min.js"></script>

	<script src="resources/js/jquery-3.1.1.min.js"></script>
<!--===============================================================================================-->
<!-- 	<script src="resources/vendor/bootstrap/js/popper.js"></script> -->
<!-- 	<script src="resources/vendor/bootstrap/js/bootstrap.min.js"></script> -->
<!-- <!--===============================================================================================--> -->
<!-- 	<script src="resources/vendor/select2/select2.min.js"></script> -->
<!--===============================================================================================-->
<!-- 	<script src="resources/vendor/tilt/tilt.jquery.min.js"></script> -->
	<script type="text/javascript" >
	
		
function VarLogin(){
	alert("holaaa");
	var usuario= $("#usertxt").val();
	var pass=$("#passtxt").val();
console.log("user :"+ usuario);
// $.ajax({
// 	  method: "GET",
// 	  url: "Home",
// 	  data:{pass:pass,user:usuario},
// dataType: "json"
// 	});
	
	
	
}
		


	
// 		$('.js-tilt').tilt({
// 			scale: 1.1
// 		})
	</script>
<!--===============================================================================================-->
<!-- 	<script src="resources/js/main.js"></script> -->

</body>
</html>