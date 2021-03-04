<%-- 
    Document   : zaikosyouhin
    Created on : 2017/11/30, 16:19:46
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<form action="./allsyouhin" method="post">
    <body background="/Zaikoweb/img/木1.jpg"><!--このHTML文で画像ファイルに入っているenoshimaの画像（jpg)を背景へ定める!-->
    <div style ="margin-left:400px"> <!--このHTML文で上部の/Zaikoweb/img/enoshima.jpgを左よりに表示する!-->
    </div>   
     <div style ="margin-left:550px">
                       <a href="http://localhost:8080/Zaikoweb/zaikomenu.jsp">
<img src="/Zaikoweb/img/絵.jpg" width="300px"   onmouseover="this.src='/Zaikoweb/img/絵2.jpg';"   onmouseout="this.src='/Zaikoweb/img/絵.jpg';" border="0">
</a>
         <BR>
         <BR>
         <BR>
         
   　 <font size="6"><marquee width="300">商品一覧を表示します</marquee></font>
    <BR>
               <input type="hidden" name="id" rows="" cols="">
            <input type="hidden" name="name" rows="" cols=""><br><!--input type="hidden"!でname="name"という値だけ./allsyouhinへと送る!-->
             <input type="hidden" name="Number" rows="" cols="">
     </div>
             <div style ="margin-left:625px">
            　<input type="submit" value="商品一覧ページへ"name="name">
             </div>
             <div style ="margin-left:620px">
                 <BR>
                 <BR>
                 <BR>
                 
           
             </div>
     </div>
</form>
