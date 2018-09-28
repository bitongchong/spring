<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="hello">hello_test</a>
<br>
<a href="hello2/requestTest">requestMapping_test</a>
<br>
<a href="hello2/requestMethodTest">requestMethodTest</a>
<br>
<a href="hello2/requestAntTest">requestAntTest</a>
<br>
<a href="hello2/requestVariableTest/101">requestAntTest</a>
<br>

<a href="mapTest">mapTest</a>
<br>
<a href="hidden_put">hidden_put</a>
<br>
<a href="hidden_get">hidden_get</a>
<br>
<form action="hidden_delete/1" method="post">
	<input type="hidden" name="_method" value="DELETE"/>
	<input type="text" name="id"/>
	<button>提交delete</button>
</form>
<br>
<form action="hidden_put/2" method="post">
	<input type="text" name="_method" value="put"/>
		<button>提交put</button>
</form>
<br>
<a href="requestParamTest?username=liuyuehe&&password=123">requestParam</a>
<br>

<a href="requestHeader">requestHeader</a>

<form action="userInfo" method="post">
	<input type="text" name="name"/>
	<input type="text" name="age"/>
	<input type="text" name="sex"/>
	<input type="text" name="address.city">
	<input type="text" name="address.price">
	<button>check</button>
</form>
<br>
<a href="modelAndView">modelAndView</a>

<a href="mapTest2">mapTest2</a>
<a href="mapTest3">mapTest3</a>

<a href="viewTest">testView</a>
<a href="viewRedirectTest2">viewRedirectTest2</a>


</body>
</html>