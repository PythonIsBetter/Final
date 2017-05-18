<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%
String name=new String(request.getParameter("username").getBytes("ISO-8859-1"),"utf-8");
%>
<head>
<title>搜索机票</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Truck Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template,Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- bootstarp-css -->
<link href="css/test/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!--// bootstarp-css -->
<!-- css -->
<link rel="stylesheet" href="css/test/style.css" type="text/css" media="all" />
<link rel="stylesheet" type="text/css" href="css/Search.css" />
<link rel="stylesheet" type="text/css" href="css/Calendar.css" />
<!--// css -->
<script src="js/jquery-1.11.1.min.js"></script>
<!--fonts-->
<link href='http://fonts.useso.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,800,700,600' rel='stylesheet' type='text/css'>
<!--/fonts-->
<link href="css/test/animate.css" rel="stylesheet" type="text/css" media="all">
<script src="js/wow.min.js"></script>
<script>
	 new WOW().init();
	 
	 function goSomeWhere(n) 
	 {
	 	switch(n)
	 	{
	 	case 1:
	 		window.location.href="Foreground3.jsp?name="+"<%=name%>";
	 		break;
	 	case 2:
	 		window.location.href="about.jsp?name="+"<%=name%>";
	 		break;
	 	case 3:
	 		window.location.href="Question.jsp?name="+"<%=name%>";
	 		break;
	 	case 4:
	 		window.location.href="mail.jsp?name="+"<%=name%>";
	 		break;
	 	}
	 }
</script>

<script type="text/javascript" language="javascript">
   function immediately() 
   {
    	var element = document.getElementById("search");
   		 if ("\v" == "v") 
    	{
    		 element.onpropertychange = webChange;
    	} 
   		 else 
   		 {
   			 element.addEventListener("search", webChange, false);
    	} 
   		 function webChange() 
   		 {
   			 if (element.value)
   			 {
   				 document.getElementById("search").innerHTML = element.value
   				 };
 		}
	}
   
   function check()
	{
	   var departure=document.search.departure.value;
		var destination=document.search.destination.value;
		 if(departure.length==0||destination.length==0)
		 {
			 if(departure.length==0&&destination.length==0)
				 	alert("请选择出发和到达的城市");
			 else  if(departure.length==0)
			 { 
				 alert("请选择出发城市");
			  }
			 return false;
		 }
	}
</script>
</head>

<body>
	<!-- banner -->
	<div id="home" class="banner a-banner">
		<!-- container -->
		<div class="container">
			<div class="header">
				<div class="head-logo">
					<a href="Foreground1.jsp"><img src="img/test/logo.png" alt="" /></a>
					
				</div>
				<div class="top-nav">
					<span class="menu"><img src="img/test/menu.png" alt=""></span>
					<ul class="nav1">
						<li class="hvr-sweep-to-bottom"><a href="#" onclick="goSomeWhere(1)">首页<i><img src="img/test/nav-but1.png" alt=""/></i></a></li>
						<li class="hvr-sweep-to-bottom"><a href="#" onclick="goSomeWhere(2)">关于我们<i><img src="img/test/nav-but2.png" alt=""/></i></a></li>
						<li class="hvr-sweep-to-bottom"><a href="#" onclick="goSomeWhere(3)">疑问<i><img src="img/test/nav-but4.png" alt=""/></i></a></li>
						<li class="hvr-sweep-to-bottom"><a href="index.html">退出登录<i><img src="img/test/nav-but3.png" alt=""/></i></a></li>
						
						</ul>
			    </div>
			    <form action="ResultServlet" method="post" name="search" onsubmit="return check()">
<header>
<br>
<span class="input input--manami">
			<input 
			class="input__field input__field--manami" 
			type="text" 
			placeholder="请输入您要出发的城市" 
			id="departure"
			name="departure" 
			oninput="document.getElementById('departureshow').innerHTML=this.value;" 
			onpropertychange="document.getElementById('departureshow').innerHTML=this.value;"
			/>
			<label style="font-size:25px;" class="input__label input__label--manami" for="input-32">
				出发地<span class="input__label-content input__label-content--manami" id="departureshow"></span>
			</label>
		</span><br>
		
		<h1>出发日期</h1>
		<div style="margin-left:500px;">
		<span style="margin-left:20px;" class="input_c input_c--manami" >
		 <select  id="select" name="year" class="input_c__field input_c__field--manami"   oninput="document.getElementById('year').innerHTML=this.value;" 
			onpropertychange="document.getElementById('year').innerHTML=this.value;">
		  <option class="option_style" value="2016">2016</option>
		  <option class="option_style" value="2017">2017</option>
		  <option class="option_style" value="2018">2018</option>
		  <option class="option_style" value="2019">2019</option>
		  <option class="option_style" value="2020">2020</option>
		  </select>
		  <label class="input_c__label input_c__label--manami" for="input-32">
				年<span class="input_c__label-content input_c__label-content--manami" id="year"></span>
			</label>
		  </span>
		  
		  <span style="margin-left:20px;" class="input_c input_c--manami" >
		   <select  id="select" name="month"class="input_c__field input_c__field--manami" oninput="document.getElementById('month').innerHTML=this.value;" 
			onpropertychange="document.getElementById('month').innerHTML=this.value;">
		  <option class="option_style" value="1">1</option>
		  <option class="option_style" value="2">2</option>
		  <option class="option_style" value="3">3</option>
		  <option class="option_style" value="4">4</option>
		  <option class="option_style" value="5">5</option>
		   <option class="option_style" value="6">6</option>
		    <option class="option_style" value="7">7</option>
		     <option class="option_style" value="8">8</option>
		      <option class="option_style" value="9">9</option>
		       <option class="option_style" value="10">10</option>
		        <option class="option_style" value="11">11</option>
		         <option class="option_style" value="12">12</option>
		  </select>
		  <label class="input_c__label input_c__label--manami" for="input-32">
				月<span class="input_c__label-content input_c__label-content--manami" id="month"></span>
			</label>
		  </span>
		  
		  <span style="margin-left:20px;" class="input_c input_c--manami" >
		   <select  id="select" name="day"class="input_c__field input_c__field--manami"oninput="document.getElementById('day').innerHTML=this.value;" 
			onpropertychange="document.getElementById('day').innerHTML=this.value;">
		 <option class="option_style" value="1">1</option>
 		<option class="option_style" value="2">2</option>
		 <option class="option_style" value="3">3</option>
 		<option class="option_style" value="4">4</option>
 		<option class="option_style" value="5">5</option>
 		<option class="option_style" value="6">6</option>
 		<option class="option_style" value="7">7</option>
 		<option class="option_style" value="8">8</option>
 		<option class="option_style" value="9">9</option>
		 <option class="option_style" value="10">10</option>
 		<option class="option_style" value="11">11</option>
 		<option class="option_style" value="12">12</option>
 		<option class="option_style" value="13">13</option>
 		<option class="option_style" value="14">14</option>
 		<option class="option_style" value="15">15</option>
 		<option class="option_style" value="16">16</option>
 		<option class="option_style" value="17">17</option>
 		<option class="option_style" value="18">18</option>
 		<option class="option_style" value="19">19</option>
 		<option class="option_style" value="20">20</option>
 		<option class="option_style" value="21">21</option>
		 <option class="option_style" value="22">22</option>
		 <option class="option_style" value="23">23</option>
 		<option class="option_style" value="24">24</option>
 		<option class="option_style" value="25">25</option>
 		<option class="option_style" value="26">26</option>
 		<option class="option_style" value="27">27</option>
 		<option class="option_style" value="28">28</option>
 		<option class="option_style" value="29">29</option>
 		<option class="option_style" value="30">30</option>
 		<option class="option_style" value="31">31</option>
		  </select>
			<label class="input_c__label input_c__label--manami" for="input-32">
				日<span class="input_c__label-content input_c__label-content--manami" id="day"></span>
			</label>
		  </span>
		  </div>
		
<span class="input input--manami">
			<input 
			class="input__field input__field--manami" 
			type="text" 
			placeholder="请输入您要到达的城市" 
			id="destination"
			name="destination" 
			oninput="document.getElementById('destinationshow').innerHTML=this.value;" 
			onpropertychange="document.getElementById('destinationshow').innerHTML=this.value;"
			/>
			<label style="font-size:25px;" class="input__label input__label--manami" for="input-32">
				到达地<span class="input__label-content input__label-content--manami" id="destinationshow"></span>
			</label>
		</span>
		
		<script type="text/javascript">
		immediately();
		</script>
		<br><br>
		 
		 
		<input class="button3" type="submit" value="开始查询" >

		 <input type="hidden" name="username" value="<%=name%>">
		 
</header>
</form>
						<div class="clearfix"> </div>
					</ul>
					<!-- script-for-menu -->
							 <script>
							   $( "span.menu" ).click(function() {
								 $( "ul.nav1" ).slideToggle( 300, function() {
								 // Animation complete.
								  });
								 });
							</script>
						<!-- /script-for-menu -->
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
		<!-- //container -->
		
		
		
		
	<!-- //banner -->
	
	<!-- footer -->
	<div class="footer">
		<!-- container -->
		<div class="container">
			<div class="col-md-6 footer-left  wow fadeInLeft animated" data-wow-delay="0.4s" style="visibility: visible; -webkit-animation-delay: 0.4s;">
				<ul>
					<li><a href="#" onclick="goSomeWhere(1)">首页</a></li>
                    <li><a href="#" onclick="goSomeWhere(2)">关于我们</a></li>
					<li><a href="#" onclick="goSomeWhere(3)">疑问</a></li>
					<li><a href="#" onclick="goSomeWhere(4)">联系我们</a></li>
				</ul>
				<form>
					<input type="text" placeholder="Email" required="">
					<input type="submit" value="发送">
				</form>
			</div>
			<div class="col-md-3 footer-middle wow bounceIn animated" data-wow-delay="0.4s" style="visibility: visible; -webkit-animation-delay: 0.4s;">
				<h3>地址</h3>
				<div class="address">
					<p>华东师范第五宿舍
						<span>随便哪个房间</span>
					</p>
				</div>
				<div class="phone">
					<p>110</p>
				</div>
			</div>
			<div class="col-md-3 footer-right  wow fadeInRight animated" data-wow-delay="0.4s" style="visibility: visible; -webkit-animation-delay: 0.4s;">
				<a href="#"><img src="img/test/logo.png" alt="" /></a>
				<p>这个网页欢迎大家的建议和批评~</p>
			</div>
			<div class="clearfix"> </div>	
		</div>
		<!-- //container -->
	</div>
	<!-- //footer -->

</body>
</html>