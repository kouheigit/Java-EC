<!DOCTYPE html>
<html>
    <head>
        <%@page contentType="text/html" pageEncoding="UTF-8"%>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


 


    <form action="./zaikokanri" method="post">
        <BR>
        <BR>
        <BR>
        <div style="margin-left: 550px">
            <input type="submit" value="商品登録ページへ"name="syouhinadd">
            <BR>
            <BR>
            <BR>

            <input type="button" value="商品削除ページへ" onClick="location.href = 'http://localhost:8080/Zaikoweb/syouhinsakujo.jsp'">
            <BR>
            <BR>
            <BR>
            <input type="button" value="会員情報一覧ページへ" onClick="location.href = 'http://localhost:8080/Zaikoweb/memberpass.jsp'">
              <BR>
            <BR>
            <BR>
            <input type="button" value="会員情報削除ページへ" onClick="location.href = 'http://localhost:8080/Zaikoweb/membersakujo.jsp'">
            </form>  
        </div>
    </body>
</html>