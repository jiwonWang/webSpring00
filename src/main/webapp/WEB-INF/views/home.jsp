<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<a href="/webApp/aLink?num=100&name=김길동">A태그 링크걸기</a>
<p>
  폼 데이터 전송<br/>
  <form method="post" action="/webApp/formData"><!-- get방식은 한글 깨지지 않고, post방식은 깨짐 -->
    이름:<input type="text" name="name" /><br/>
    번호:<input type="text" name="num"/><br/>
    연락처:<input type="text" name="tel"/><br/>
    <input type="submit" value="전송"/>
  </form>
</p>
<img src="/webApp/imgList/gal12.jpg"/>
<img src="/webApp/resources/gal6.jpg"/>
</body>
</html>
