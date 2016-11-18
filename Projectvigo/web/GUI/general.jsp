<%-- 
    Document   : general
    Created on : Nov 10, 2016, 4:08:09 PM
    Author     : vigo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Neth Fm</title>
	<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE7; IE=EmulateIE9">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no"/>
        <link rel="stylesheet" type="text/css" href="css/style.css" media="all" />
        <link rel="stylesheet" type="text/css" href="css/demo.css" media="all" />
        <link rel="stylesheet" type="text/css" href="css/menubar.css" media="all" />
        <link rel="stylesheet" href="css/jquery-ui.css">
        <script src="js/jquery1.js"></script>
        <script src="js/jquery-ui.js"></script>
        
        <script>
        $(function() {
            $( "#s_date" ).datepicker();
        });
        </script>
    
        <script>
        $(function() {
            $( "#e_date" ).datepicker();
        });
        </script>
        
</head>
<body>
    
<div id="hmenu"> 
    <ul> 
      <li><a href="#">General</a></li> 
      <li><a href="./activity.jsp">Activity</a></li>
      <li><a href="#">3 rd Tab</a></li> 
      <li><a href="#">4 th Tab</a></li> 
      <li><a href="#">5 th Tab</a></li> 
      <li><a href="#">6 th Tab</a></li> 
      <li><a href="#">7 th Tab</a></li>
    </ul>   
</div> 
    
<div class="container">
			<!-- freshdesignweb top bar -->
            
            <div class="clr"></div>
			<header>
				<h1>General</h1>
            </header>       
      <div  class="form">
    		<form id="contactform" action="/Projectvigo/webresources/entity.promotiontab/FillDB" method="POST"> 

    			
                
            <p class="contact"><label for="site_id">Site ID</label></p><br>
            <input id="site_id" name="siteid" placeholder="site id" required="" tabindex="2" type="text"><br>
            
            <p class="contact"><label for="promotion_id">Promotion ID</label></p><br>
            <input id="promotion_id" name="promotionid" placeholder="promotion id" required="" tabindex="2" type="text"><br>
         
            <p class="contact"><label for="descriptin">Description</label></p><br>
            <input id="description" name="description" placeholder="description" required="" tabindex="2" type="text"><br>
         
            <p class="contact"><label for="type">Type</label></p><br>
            <input id="ty" name="type" placeholder="type" required="" tabindex="2" type="text"><br>
         
            <p class="contact"><label for="responsible">Responsible</label></p><br>
            <input id="responsible" name="responsible" placeholder="Responsible" required="" tabindex="2" type="text"><br>
            
            <div>
                <label>Start Date</label><br><br>
                <input type="text" id="s_date" name="sdate">
            </div>
  
           
            <div>
                <label>End Date</label><br><br>
                <input type="text" id="e_date" name = "edate">
            </div>
    			      
            <p class="contact"><label for="note">Note</label></p>
            <textarea id="note" name="note" placeholder="Add a Note here" required=""  tabindex="2" rows="5" cols="50"></textarea><br><br>
   
            <p class="contact"><label for="state">State</label></p><br>
            <input id="state" name="state" placeholder="state" required="" tabindex="2" type="text"><br>
         
            <input type="submit" value="Login" />
    </form> 
</div>      
</div>

</body>
</html>