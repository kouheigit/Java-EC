<%-- 
    Document   : zaikolast
    Created on : 2017/12/04, 18:27:50
    Author     : user
--%>

<%-- 
    Document   : kadai16-7
    Created on : 2017/11/16, 17:50:35
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    String id = (String) request.getAttribute("id");
    String name = (String) request.getAttribute("name");
    String Number = (String) request.getAttribute("Number");

%>



<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

    </head>
    <body>
        <div style ="margin-left: 440px">
              <h1>以下の商品を購入でよろしいでしょうか？</h1>
        </div>
       
        <div style ="margin-left:600px">
            
        <form action="./zaikolast1" method="post">
            <BR>
     
            <BIG><% out.print(name); %></BIG><br>
            <BIG><% out.print(Number); %>円</BIG><br>
            <img src='/Zaikoweb/img/<%out.print(id);%>.jpg' style='width:200px' >
            <BR>
            <BR>
            <BR>
            <a>いくつ購入されますか？</a> 
            <select name="buy">
                
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
                <option value="4">4</option>
                <option value="5">5</option>
                <input type="hidden" name= "name" value='<% out.print( name ); %>'>
                  <input type="hidden" name="Number"value='<%out.print( Number );%>'>
                  
            </select>
        </p>
        <p><input type="submit" value="購入する"></p>
        </div>
</body>
</form>
</body>
</html>