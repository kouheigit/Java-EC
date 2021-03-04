<%-- 
    Document   : syouhinadd
    Created on : 2017/11/30, 16:21:10
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>    
    <form action="./syouhinadd" method="post">
     <div style="margin-left: 580px">
         <BR>
              　 <br>挿入したいidを入力してください<br>
               <textarea name="id" rows="1" cols="30"></textarea><br> 
               <BR>
               挿入したい名前を入力してください(例、リンゴ）<br>
            <textarea name="name" rows="1" cols="30"></textarea><br>
            <BR>
            挿入したい商品の値段の値を入力してください<br>
            <textarea name="Number" rows="1" cols="30"></textarea><br>
            <BR>
            <input type="submit" value="挿入する">
     </div>
        </form>
</html>
