<%-- 
    Document   : UserLogin
    Created on : Nov 8, 2016, 3:57:50 PM
    Author     : Shyamali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
            form{
                float:left; /*to clear the floats of inner elements,usefull if you wanna add a border or background image*/
                width:300px;
            }
            label{
                float:left;
                width:150px;
                margin-bottom:10px; /*or whatever you want the spacing to be*/
            }
            input{
                float:left;
                width:150px;
                margin-bottom:10px; /*or whatever you want the spacing to be*/
            }

        </style>
        <title>User Login</title>
    </head>
    <body> 
            <center>
                <form action="/Projectvigo/webresources/entity.user/Postme" method="POST">
            <input type="text" name="UserName" /> <br>
            <input type="password" name="Password"  /> <br>
            <input type="submit" value="Login" />
        </form>
                
<!--                                <form action="http://localhost:48861/PMC/webresources/entity.user/UserLoginget/1" method="get">
            <input type="text" name="UserName" value="" /> <br>
            <input type="password" name="Password" value="" /> <br>
            <input type="submit" value="Login" />
        </form>-->
                </center>
    </body>
</html>
