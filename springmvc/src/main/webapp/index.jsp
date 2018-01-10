<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
	
</script>
<title>main</title>

</head>
<body>
	<a href="http://localhost:8080/springmvc/testParamsAndHeaders?age=10">testParamsAndHeaders</a>
	<br>
	<a href="http://localhost:8080/springmvc/helloworld">helloworld</a>
	<br>
	<form action="http://localhost:8080/springmvc/helloworld" method="post">
		<input type="submit" value="提交"><br>
	</form>
	<a href="http://localhost:8080/springmvc/testAntPath/dasfdsaf/abc">testAntPath</a>
	<br>
	<a href="http://localhost:8080/springmvc/testPathVariable/29">testPathVariable</a>

</body>
</html>