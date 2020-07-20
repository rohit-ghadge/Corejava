---------------------------------------------Single line tag injavascript----------------------------------------

 * <link rel="stylesheet" href="fun.css">
 * <img src="puppies/golden.jpeg">
 * “Port 4200 is already in use”
 * sudo kill $(sudo lsof -t -i:4200) 
 * if you want to use the jquery in .ts file then import below line.
 * import * as $ from 'jquery';

---------------------------------------------------jQuery Effects---------------------------------------------------
### slideDown :-
<html>
  <head>
    <title>Javascript</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <link rel="stylesheet" href="fun.css">
        <script> 
        $(document).ready(function(){
          $("#flip").click(function(){
            $("#panel").slideDown("slow");
          });
        });
        </script>
  </head>
  <body>
      <div id="flip">click on this</div>
      <div id="panel">this will show after slidedown</div>
  </body>
</html>

#panel, #flip {
  padding: 5px;
  text-align: center;
  background-color: cyan;
  border: solid 1px black;
}
#panel{
  padding:50px;
  display:none;
}
---------------------------------------------------------------------------------------------------------------------
### before  :-
     <script>
	$(document).ready(function(){
	$("ul").before("<h1>this is working</h1>") //.after
	})
     </script>
---------------------------------------------------------------------------------------------------------------------
###click and text :-
	 <script>
	$(document).ready(function(){
	  $("button").click(function(){
	    $("p").text("Hello world!");
	  });
	});
</script>
------------------------------------------------------------------------------------------------------------------------
### html():-
<script>
$(document).ready(function(){
  $("button").click(function(){
    $("p").html("Hello <b>world!</b>");
  });
});
</script>
-------------------------------------------------------------------------------------------------------------------
### Ready attr
      <script>	
	$(document).ready(function(){
	$("img").attr("border","5px solid black")
	})
     </script>
---------------------------------------------------------------------------------------------------------------------
### click css :-
<script>
	$(document).ready(function(){
	$("#btn").click(function(){
     $(".puppies").css("visibility","visible");
	})
	})
</script>
-----------------------------------------------------------------------------------------------------------------------
### hide image when we clik on it:-
<script>
	$(document).ready(function(){
	$("img").click(function(){
     $(this).hide();
	})
 	})
</script>
---------------------------------------------------------------------------------------------------------------------
### show image when clik on imag
<script>
$(document).ready(function(){
    $("#show").click(function(){
        $("img").show();
    })
    })
</script>
    
-----------------------------------------------------------------------------------------------------------------------
### fadeOut :-	
    <script>
      $(document).ready(function(){
	  $("#rohit").click(function(){
	    $("#one").fadeOut("slow");
	    $("#two").fadeOut("fast");
	    $("#three").fadeOut("slow");

	})
	})
     </script>
----------------------------------------------------------------------------------------------------------------------
### fadeIn :-
	<script>
	$(document).ready(function(){
	    $("#in").click(function(){
		   $("img").fadeIn();
	    })
	    })
	 </script>
--------------------------------------------------------------------------------------------------------------------
###  draggable (it work only jQuery UI)
      <script>
	$(document).ready(function(){   //dropable
     $("#drag").draggable();
	})
     </script>

------------------------------------------------------------------------------------------------------------------
