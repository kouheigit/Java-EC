<%-- 
    Document   : zaikopass
    Created on : 2017/12/04, 23:45:35
    Author     : user
--%>

<%-- 
    Document   : kadai17-9
    Created on : 2017/11/27, 18:27:23
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>    
    
    <form action="./zaikopass1" method="post">
        <BR>
        <BR>
        <BR>
        
     <div style="margin-left: 530px">
         
    　          登録するidはすべて数字でお願いします（例、18800901）<br>
     <textarea name="id" rows="1" cols="30"></textarea><br>
       
        </div>
             <div style="margin-left: 530px">
            
            　登録するパスワードを英数字でお願いします(例、Syamu777またはHamazakiなど）<br>
             <textarea name="name" rows="1" cols="30"></textarea><br>
        </div>
        <div style="margin-left: 530px">
            
            <input type="submit" value="挿入する">
           
        </div>
        </form>
</html>