<%-- 
    Document   : zaikosyouhin
    Created on : 2017/11/30, 16:19:46
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<form action="./memberpass" method="post">
    <!--このHTML文で画像ファイルに入っているenoshimaの画像（jpg)を背景へ定める!-->
    <div style ="margin-left:400px"> <!--このHTML文で上部の/Zaikoweb/img/enoshima.jpgを左よりに表示する!-->
    </div><!--</div>で文字を整えることを閉じる!-->
     <div style ="margin-left:550px">
                     
         <BR>
         <BR>
         <BR>
         
   　 <font size="3">会員の登録情報を表示します</font>
    <BR>
               <input type="hidden" name="id" rows="" cols="">
            <input type="hidden" name="name" rows="" cols=""><br><!--input type="hidden"!でname="name"という値だけ./allsyouhinへと送る!-->
     </div>
             <div style ="margin-left:625px">
            　<input type="submit" value="会員情報一覧へ"name="name">
             </div>
             <div style ="margin-left:620px">
                 <BR>
                 <BR>
                 <BR>
                 
           
             </div>
     </div>
</form>
