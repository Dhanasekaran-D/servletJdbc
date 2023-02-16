<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Enter Sdutent Details</title>
</head>
<body>
     <h1>Sdutent  Details</h1>


		<form action="SdutentDetailsController" method="post">
		<div>
				Roll no : <input type="text" name="id" id="id">
			</div>
			<br /> <br />
			<div>
				Name : <input type="text" name="Name" id="Name">
			</div>
			<br /> <br />
		
			<div>
				Father Name : <input type="text" name="fatherName" id="fatherName">
			</div>
			<br /> <br />
			<div>
			Which Class : <input type="text" name="whichclass" id="whichclass">
			</div>
			<br /> <br />
			<div>
				phone : <input type="text" name="phone" id="phone">
			</div>
			<br /> <br />
			
			<div>
				City : <input type="text" name="city" id="city">
			</div>
			<br /> <br />
			<div>
				State : <input type="text" name="state" id="state">
			</div>
			<br /> <br />
			<div>
				Country : <input type="text" name="country" id="country">
			</div>
			<br /> <br />

			<div>
				<button type="submit">OK</button>
			</div>
		</form>

</body>
</html>