<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>常见问题</title>
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
					<a href="index.html"><img src="img/test/logo.png" alt="" /></a>
				</div>
				<div class="top-nav">
					<span class="menu"><img src="img/test/menu.png" alt=""></span>
					<ul class="nav1">
						<li class="hvr-sweep-to-bottom"><a href="#" onclick="goSomeWhere(1)">首页<i><img src="img/test/nav-but1.png" alt=""/></i></a></li>
						<li class="hvr-sweep-to-bottom"><a href="#" onclick="goSomeWhere(2)">关于我们<i><img src="img/test/nav-but2.png" alt=""/></i></a></li>
						<li class="hvr-sweep-to-bottom active"><a href="#" onclick="goSomeWhere(3)">疑问<i><img src="img/test/nav-but4.png" alt=""/></i></a></li>
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
	<!-- products-top -->
	<div class="products-top">
		<!-- container -->
		<div class="container">
			<h3 class="wow fadeInRight animated" data-wow-delay="0.4s" style="visibility: visible; -webkit-animation-delay: 0.4s;">疑问</h3>
			<h5 class="wow fadeInRight animated" data-wow-delay="0.4s" style="visibility: visible; -webkit-animation-delay: 0.4s;">在这里我们会回答各种各样的问题 <span>虽然不是在线回答</span></h5>
			<div class="products-top-grids wow fadeInLeft animated" data-wow-delay="0.4s" style="visibility: visible; -webkit-animation-delay: 0.4s;">
				<div class="col-md-4 products-grid">
					<div class="products-number">
						<p>1.</p>
					</div>
					<div class="products-text">
						<h4>机票数据来源</h4>
						<p>对此问题，比较官方的说法是，用爬虫（然而其实是手动爬虫）从携程网上爬取的数据</p>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="col-md-4 products-grid">
					<div class="products-number">
						<p>2.</p>
					</div>
					<div class="products-text">
						<h4>为什么没有写出来爬虫</h4>
						<p>面对携程网的反爬虫 机制我们无能为力（我们还是萌新）</p>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="col-md-4 products-grid">
					<div class="products-number">
						<p>3.</p>
					</div>
					<div class="products-text">
						<h4>为什么还不能在线购买机票</h4>
						<p>因为时间有限，我们还没有实现这方面的功能，以后会慢慢补上的</p>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="clearfix"> </div>
			</div>
			<div class="products-top-grids wow fadeInRight animated" data-wow-delay="0.4s" style="visibility: visible; -webkit-animation-delay: 0.4s;">
				<div class="col-md-4 products-grid">
					<div class="products-number">
						<p>4.</p>
					</div>
					<div class="products-text">
						<h4>为什么航线不全</h4>
						<p>因为各种各样的原因，数据库的信息不够完善</p>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="col-md-4 products-grid">
					<div class="products-number">
						<p>5.</p>
					</div>
					<div class="products-text">
						<h4>如何找回密码</h4>
						<p>您可以联系我们，下方有我们的联系方式</p>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="col-md-4 products-grid">
					<div class="products-number">
						<p>6.</p>
					</div>
					<div class="products-text">
						<h4>这个网站的独特之处在哪里？</h4>
						<p>没有广告！！！！！！！！！！！！！！！！</p>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
		<!-- container -->
 	</div>
	<!-- //products-top -->
	
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

		</div>
		<!-- //container -->
	</div>
</body>
</html>