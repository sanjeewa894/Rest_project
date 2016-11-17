
<%-- 
    Document   : index
    Created on : Nov 9, 2016, 5:51:10 PM
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
<div class="container">
			<!-- freshdesignweb top bar -->
            
            <div class="clr"></div>
			<header>
				<h1>Activity</h1>
            </header>       
      <div  class="form">
    		
                      <form id="contactform" action="/Projectvigo/webresources/entity.activitytab/intuser" method="POST"> 
                         
                        <p class="contact"><label for="A">Activity_seq</label></p><br> 
                        <input id="Activityseq" name="activityseq" placeholder="State" required="" type="text"> <br>
         
                        <p class="contact"><label for="activity_id">Activity Id</label></p><br>
    			<input id="activity_id" name="activityid" placeholder="ID" required="" tabindex="1" type="text"> 
    			<br>
    			 
    			<p class="contact"><label for="description">Description</label></p><br>
    			<input id="description" name="description" placeholder="Description" required="" type="text"> 
    			<br>
                
                <p class="contact"><label for="responsible">Responsible</label></p><br>
    			<input id="responsible" name="responsible" placeholder="Responsible" required="" tabindex="2" type="text"> 
    			<br>
    		
                <div>
                   <label>Start Date</label><br><br>
                   <input type="text" id="s_date" name="sdate">
               </div>
  
           
              <div>
                   <label>End Date</label><br><br>
                   <input type="text" id="e_date" name="edate">
               </div>
              
            
            <p class="contact"><label for="state">State</label></p><br> 
            <input id="state" name="state" placeholder="State" required="" type="text"> <br>
            
            <p class="contact"><label for="state">site_id</label></p><br> 
            <input id="site_id" name="siteid" placeholder="State" required="" type="text"> <br>
            
            <p class="contact"><label for="state">promotion_id</label></p><br> 
            <input id="promotion_id" name="promotionid" placeholder="State" required="" type="text"> <br>
            
            <p class="contact"><label for="state">parent_id</label></p><br> 
            <input id="parent_id" name="parentid" placeholder="State" required="" type="text"> <br>
            
          
            <p class="contact"><label for="state">note</label></p><br> 
            <input id="note" name="note" placeholder="State" required="" type="text"> <br>
           
            <input type="submit" value="Sumbit" />
   </form> 
</div>      
</div>

</body>
</html>


