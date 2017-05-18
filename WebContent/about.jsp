<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>关于我们</title>
<%
String name=new String(request.getParameter("name").getBytes("ISO-8859-1"),"utf-8");
%>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Truck Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template,Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- bootstarp-css -->
<link href="css/test/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!--// bootstarp-css -->
<!-- css -->
<link rel="stylesheet" href="css/test/style.css" type="text/css" media="all" />
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
<!--start-smoth-scrolling-->
		<script type="text/javascript" src="js/move-top.js"></script>
		<script type="text/javascript" src="js/easing.js"></script>
		<script type="text/javascript">
			jQuery(document).ready(function($) {
				$(".scroll").click(function(event){		
					event.preventDefault();
					$('html,body').animate({scrollTop:$(this.hash).offset().top},900);
				});
			});
		</script>
<!--start-smoth-scrolling-->

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
						<li class="hvr-sweep-to-bottom active"><a href="#" onclick="goSomeWhere(2)">关于我们<i><img src="img/test/nav-but2.png" alt=""/></i></a></li>
						<li class="hvr-sweep-to-bottom"><a href="#" onclick="goSomeWhere(3)">疑问<i><img src="img/test/nav-but4.png" alt=""/></i></a></li>
						<li class="hvr-sweep-to-bottom"><a href="index.html">退出登录<i><img src="img/test/nav-but3.png" alt=""/></i></a></li>
						<li class="hvr-sweep-to-bottom" style="background-color:#0066FF;"><a href="#" >欢迎回来，亲爱的<%=name %><i></i></a></li>
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
	</div>
	<!-- //banner -->
	<!-- about -->
	<div class="about-top">
		<!-- container -->
		<div class="container">
			<div class="about-info wow fadeInLeft animated" data-wow-delay="0.4s" style="visibility: visible; -webkit-animation-delay: 0.4s;">
				<h3>关于我们的一些资料</h3>
				<h5>我们都是萌新，还请多多指教</span></h5>
			</div>
			<div class="banner-bottom-grids a-banner-bottom-grids">
				<div class="col-md-5 banner-bottom-right wow fadeInRight animated animated" data-wow-delay="0.5s" style="visibility: visible; -webkit-animation-delay: 0.5s;">
					<img src="img/test/img1.jpg" alt="">
				</div>
				<div class="col-md-7 a-banner-bottom-text">
					<div class="jumbotron banner-bottom-left wow fadeInLeft animated animated" data-wow-delay="0.5s" style="visibility: visible; -webkit-animation-delay: 0.5s;">
					  <h3>关于这个网站</h3>
						<h5>这就是我们的<span>作业</span></h5>
						<p>但是这个不仅仅是我们的作业，我们以后有机会还会继续完善它的功能，我们会继续努力的！
						</p>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
		<!-- //container -->
	</div>
	<!-- //about -->
	
	<!-- team -->
	<div class="team">
		<!-- container -->
		<div class="container">
			<div class="team-info">
				<h3 class="wow bounceIn animated" data-wow-delay="0.4s" style="visibility: visible; -webkit-animation-delay: 0.4s;">我们的成员</h3>
				<div class="team-grids">
					<div class="col-md-3 team-grid wow bounceIn animated" data-wow-delay="0.4s" style="visibility: visible; -webkit-animation-delay: 0.4s;">
						<img src="img/test/b7.jpg" alt="">
						<h6>陈宏俊</h6>
						<p> 前端开发及美化，以及部分后端（爬虫没写出来真的很抱歉）</p>
					</div>
					<div class="col-md-3 team-grid wow bounceIn animated" data-wow-delay="0.4s" style="visibility: visible; -webkit-animation-delay: 0.4s;">
						<img src="img/test/b10.jpg" alt="">
						<h6>杨飚</h6>
						<p>参与前端开发指导和大部分后端功能开发以及完善（总而言之就是大腿）</p>
					</div>
					<div class="col-md-3 team-grid wow bounceIn animated" data-wow-delay="0.4s" style="visibility: visible; -webkit-animation-delay: 0.4s;">
						<img src="img/test/b8.jpg" alt="">
						<h6>还有你</h6>
						<p> 欢迎新朋友的加入</p>
					</div>
					
					<div class="clearfix"> </div>
				</div>
			</div>
		</div>
		<!-- //container -->
	</div>
	<!-- //team -->
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
	<a href="#home" id="toTop" class="scroll" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
</body>
</html>