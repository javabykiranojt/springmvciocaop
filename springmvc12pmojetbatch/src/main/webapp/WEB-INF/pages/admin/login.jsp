
<font color="red"> <%
 	String errorMsg = (String) request.getAttribute("msg");
 	if (errorMsg != null)
 		out.println(errorMsg);
 %></font>
<form action="login">
	<input type="text" name="username" /> <br> <br> <br> <br> <input type="submit" />
</form>