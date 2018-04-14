<%@ page import = "java.util.*" %>
<html>

<body>
	<%!
		Date date = new Date();
	Date getDate(){
		return date;
	}
	%>
	
	<%= getDate() %>
</body>
</html>