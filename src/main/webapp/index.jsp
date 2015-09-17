<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%> 
<html>
<body>
<% out.print(request.getSession()); %> 
<% out.println(request.getHeader("Cookie")); %>
</body>
</html>
