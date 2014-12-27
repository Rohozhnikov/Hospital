<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>

	<div class="navbar navbar-inverse navbar-fixed-top headroom">
		<div class="container">
			<div class="navbar-header">
				<!-- Button for smallest screens -->
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="home"><img
					src="assets/images/logo.png" alt="Progressus HTML5 template"></a>
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav pull-right">
					<li><a href="home">Home</a></li>
					<li><a href="about">About</a></li>
					<li><a href="admin">admin</a></li>
					<li><a href="medic">Medic</a></li>
					<li><a href="sidebar-left.jsp">Left Sidebar</a></li>
					<li class="active"><a href="sidebar-right.jsp">Right
							Sidebar</a></li>
					<li>
					<li><a href="contact">Contact</a></li>
					<li><a class="btn" href="#" data-toggle="modal"
						data-target="#LogIn"> LOG IN / SIGN UP</a></li>
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</div>

	<!-- Modal Login -->
	<div class="modal fade" id="LogIn" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">
						<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">Authorization</h4>
				</div>
				<div class="modal-body">
					<form role="form">
						<div class="form-group">
							<label for="recipient-name" class="control-label">Phone
								or email:</label> <input type="text" class="form-control"
								placeholder="Username">
						</div>
						<div class="form-group">
							<label for="message-text" class="control-label">Password:</label>
							<input type="password" class="form-control"
								placeholder="Password">
						</div>
					</form>
				</div>
				<div class="modal-body">
					<h4>
						<a class="btn" href="#" data-toggle="modal" data-dismiss="modal"
							data-target="#SignUp"> Sign up?</a>
					</h4>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-primary">Log in</button>
				</div>
			</div>
		</div>
	</div>

	<!-- Modal Sign up -->
	<div class="modal fade" id="SignUp" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">
						<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">Sign Up</h4>
				</div>
				<div class="modal-body">
					<form role="form">
						<div class="form-group">
							<label for="recipient-name" class="control-label">First
								Name:</label> <input type="text" class="form-control"
								placeholder="Username">
						</div>
						<div class="form-group">
							<label for="recipient-name" class="control-label">Last
								Name:</label> <input type="text" class="form-control"
								placeholder="Username">
						</div>
						<div class="form-group">
							<label for="recipient-name" class="control-label">Phone:</label>
							<input type="text" class="form-control" placeholder="Username">
						</div>
						<div class="form-group">
							<label for="recipient-name" class="control-label">email:</label>
							<input type="text" class="form-control" placeholder="Username">
						</div>
						<div class="form-group">
							<label for="recipient-name" class="control-label">Address:</label>
							<input type="text" class="form-control" placeholder="Username">
						</div>
						<div class="form-group">
							<label for="recipient-name" class="control-label">Login
								ID:</label> <input type="text" class="form-control"
								placeholder="Username">
						</div>
						<div class="form-group">
							<label for="message-text" class="control-label">Password:</label>
							<input type="password" class="form-control"
								placeholder="Password">
						</div>
						<div class="form-group">
							<label for="message-text" class="control-label">Confirm
								password:</label> <input type="password" class="form-control"
								placeholder="Password">
						</div>

					</form>
				</div>
				<div class="modal-body">
					<h4>
						<a class="btn" href="#" data-toggle="modal" data-dismiss="modal"
							data-target="#LogIn"> Log In?</a>
					</h4>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-primary">Log in</button>
				</div>
			</div>
		</div>
	</div>


	<script
		src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
	<script
		src="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
	<script src="assets/js/headroom.min.js"></script>
	<script src="assets/js/jQuery.headroom.min.js"></script>
	<script src="assets/js/template.js"></script>
</body>
</html>