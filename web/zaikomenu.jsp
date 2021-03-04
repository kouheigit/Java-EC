<%-- 
    Document   : zaikomenu
    Created on : 2017/11/30, 15:43:57
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


　　　　　　　                                          
    <title>JSP Page</title>
</head>
<div style="margin-left: 550px">
      <a href="http://localhost:8080/Zaikoweb/zaikomenu.jsp"><img src="/Zaikoweb/img/絵.jpg" width="300px"></a>
</div>
<body background="/Zaikoweb/img/木.jpg"><!--このHTML文で画像ファイルに入っているenoshimaの画像（jpg)を背景へ定める!-->
    <div style ="margin-left:400px"> <!--このHTML文で上部の/Zaikoweb/img/木.jpgを左よりに表示する!-->
                  
        <div style="margin-left: 200px"><!--メニュー画面という文字を中央に配置する!-->
           
                <font size="6"color="#950000"><marquee width="300">不思議な一品があります！！！</marquee></font>
   
        </div><!--divを閉じる!-->
    <form action="./zaikomenu" method="post"><!--postを利用してzaikomenuのサーブレットへfromから/fromの内容を送る*/!--> 
         
     　　　　　　　　　　　　　<input type="submit" value="商品一覧ページへ"name="syouhin">
        <input type="submit" value="検索ページへ"name="kensaku">
        <input type="submit" value="管理人専用ページへ"name="kanri">

        </p>
    </form>  
    </div>
</body>
</html>
