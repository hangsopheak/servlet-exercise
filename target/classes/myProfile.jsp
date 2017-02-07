<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>My Profile</title>
<meta name="viewport" content="width=device-width, initial-scale=1">

</head>
<body>
	My Profile
	<h1>User ID: <%= request.getAttribute("userId") %></h1>
	<h1>Email: <%= request.getAttribute("email") %></h1>
	<h1>Created Date: <%= request.getAttribute("createdDate") %></h1>
	<h1>Photo URL: <%= request.getAttribute("urlPhoto") %></h1>
	
	<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
	<script
		src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</body>
</html>
