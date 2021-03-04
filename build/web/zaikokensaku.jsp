<%-- 
    Document   : zaikokensaku
    Created on : 2017/11/30, 16:20:35
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<form action="./zaikokensaku" method="post">
   <body background="/Zaikoweb/img/木1.jpg"><!--このHTML文で画像ファイルに入っているenoshimaの画像（jpg)を背景へ定める!-->
    <div style ="margin-left:400px"> <!--このHTML文で上部の/Zaikoweb/img/enoshima.jpgを左よりに表示する!-->
    </div>             
    
           　     
             <div style="margin-left: 580px">
                 <a href="http://localhost:8080/Zaikoweb/zaikomenu.jsp">
<img src="/Zaikoweb/img/絵.jpg" width="300px"   onmouseover="this.src='/Zaikoweb/img/絵2.jpg';"   onmouseout="this.src='/Zaikoweb/img/絵.jpg';" border="0">
</a>
       
                 <BR>
                 <BR>
                 <BR>
        
                     <font size="6"><marquee width="300">検索したい商品名を入力してください</marquee></font>
                 <BR>
            <textarea name="name" rows="1" cols="30" required></textarea><br>
            <input type="submit" value="検索する">
            <input type="hidden" name="Number" rows="" cols="">
            
            <BR>
            <BR>
            <BR>
            
             </div>
    </form>
    