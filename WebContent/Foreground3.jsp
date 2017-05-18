<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%
String name=new String(request.getParameter("name").getBytes("ISO-8859-1"),"utf-8");
%>
<head>
<title>欢迎使用</title>
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
</script>
<script language="javascript">
function shoppingCart() 
{
	var location= "MyShoppingCartServlet?username="+"<%=name%>";
	window.location.href = location;
}
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
					<a href="Foreground3.jsp"><img src="img/test/logo.png" alt="" /></a>
					
				</div>
				<div class="top-nav">
					<span class="menu"><img src="img/test/menu.png" alt=""></span>
					<ul class="nav1">
						<li class="hvr-sweep-to-bottom active"><a href="#" onclick="goSomeWhere(1)">首页<i><img src="img/test/nav-but1.png" alt=""/></i></a></li>
						<li class="hvr-sweep-to-bottom"><a href="#" onclick="goSomeWhere(2)">关于我们<i><img src="img/test/nav-but2.png" alt=""/></i></a></li>
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
		
		<div>
			<nav>
				<ul class="nav1">
					<li class="hvr-sweep-to-right"><a href="Search.jsp?username=<%=name %>" class = "menu">机票搜索</a></li>
					<li class="hvr-sweep-to-right"><a class = "menu" href="#" onclick="shoppingCart()">我的购物车</a></li>
					<li class = "hvr-sweep-to-right"><a class = "menu" href="QuestionR.jsp"  >常见问题</a></li>
				</ul>
			</nav>
		</div>
		
		<div class="container">
				<script src="js/responsiveslides.min.js"></script>
					 <script>
						// You can also use "$(window).load(function() {"
						$(function () {
						  // Slideshow 4
						  $("#slider3").responsiveSlides({
							auto: true,
							pager: true,
							nav: false,
							speed: 500,
							namespace: "callbacks",
							before: function () {
							  $('.events').append("<li>before event fired.</li>");
							},
							after: function () {
							  $('.events').append("<li>after event fired.</li>");
							}
						  });
					
						});
					  </script>
			<div  id="top" class="callbacks_container">
				<ul class="rslides" id="slider3">
					<li>
						<div class="banner-info">
								<h2> <span><a href="http://www.csair.com/"> 中国南方航空官网</a></span></h2>  
								<div class="line"> </div>
                            <p>中国南方航空股份有限公司（China Southern Airlines，简称南航），总部设在广州，是中国运输飞机最多、航线网络最发达、年客运量最大的航空公司。南航机队规模居亚洲第一，世界第四，是全球第一家同时运营空客A380和波音787的航空公司。是中国航班最多、航线网络最密集、年客运量最大的民用航空公司。</p>
						</div>
					</li>
					<li>
						<div class="banner-info">
								<h2> <span><a href="http://www.ceair.com/"> 中国东方航空官网</a></span></h2>  
								<div class="line"> </div> 
                            <p>中国东方航空股份有限公司（China Eastern Airlines）是一家总部位于中国上海的国有控股航空公司，在原中国东方航空集团公司的基础上，兼并中国西北航空公司，联合中国云南航空公司重组而成。是中国民航第一家在香港、纽约和上海三地上市的航空公司.</p>
						</div>
					</li>
					<li>
						<div class="banner-info">
								<h2> <span><a href="http://www.airchina.com.cn/"> 中国国际航空官网</a></span></h2>  
								<div class="line"> </div>
                            <p>中国国际航空股份有限公司（AIR CHINA）简称“国航”，于1988年在北京正式成立，是中国唯一载国旗飞行的民用航空公司。国航是中国航空集团公司控股的航空运输主业公司，与中国东方航空股份有限公司和中国南方航空股份有限公司合称中国三大航空公司。</p>
						</div>
					</li>
				</ul>
			</div>
			
		</div>
	</div>
	<!-- //banner -->
	<!-- banner-bottom -->
	<div class="banner-bottom">
		<!-- container -->
		<div class="container">
			<div class="banner-bottom-grids">
				<div class="col-md-7 banner-bottom-grid-text">
					<div class="jumbotron banner-bottom-left wow fadeInLeft animated" data-wow-delay="0.5s" style="visibility: visible; -webkit-animation-delay: 0.5s;	">
					  <h3>这里有一些关于我们网站功能及其相关的疑问</h3>
						<h5>同时附有简单的<span>回答</span></h5>
						<p>日后我们还会追加更多的功能。</p>
						<div class="see-button">
							<a class="btn btn-primary btn-lg see-button hvr-shutter-out-horizontal" href="Question.html" role="button">疑问</a>
						</div>
					</div>
				</div>
				<div class="col-md-5 banner-bottom-right wow fadeInRight animated" data-wow-delay="0.5s" style="visibility: visible; -webkit-animation-delay: 0.5s;">
					<img src="img/test/2.jpg" alt=""/>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
		<!-- //container -->
	</div>
	<!-- //banner-bottom -->
	<!-- specialty -->
	<div class="specialty">
		<!-- container -->
		<div class="container">
			<div class="col-md-5 specialty-info wow fadeInLeft animated" data-wow-delay="0.5s" style="visibility: visible; -webkit-animation-delay: 0.5s;">
				<h3>我们所能提供的服务</h3>
				<h5>这是一个能购买机票的网站（虽然功能不是那么完善）</h5>
				<p>同时我们也为有需要的客户提供了直接访问相应的官方网站。
					<span>如果有人问我们这个网站与携程的区别，我只能说我们不以盈利为目的，所以我们没有广告！！！！！！</span>
				</p>
				
			</div>
			<div class="col-md-7 specialty-grids">
				<div class="specialty-grids-top">
					<div class="col-md-6 service-box wow fadeInRight animated" data-wow-delay="0.4s" style="visibility: visible; -webkit-animation-delay: 0.4s;">
						<figure class="icon">
							<a href="Search.jsp?username=<%=name %>" ><img src="img/test/1.png" alt="" /></a>
						</figure>
						<h5>机票搜索</h5>
						<p>这里有中国几大航空公司的机票</p>
					</div>
					<div class="col-md-6 service-box wow fadeInLeft animated" data-wow-delay="0.4s" style="visibility: visible; -webkit-animation-delay: 0.4s;">
						<figure class="icon">
							<a href="javascript:scroll(0,0)"><img src="img/test/2.png" alt="" /></a>
						</figure>
						<h5>官网连接</h5>
						<p>在这里会提供几大航空公司的官网链接</p>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="specialty-grids-top">
					<div class="col-md-6 service-box wow fadeInRight animated" data-wow-delay="0.4s" style="visibility: visible; -webkit-animation-delay: 0.4s;">
						<figure class="icon">
							<a href="#" onclick="shoppingCart()"><img src="img/test/3.png" alt="" /></a>
						</figure>
						<h5>机票购物车</h5>
						<p>我们提供一个购物车系统，专门用于存放顾客想要购买的机票及其备选</p>
					</div>
					<div class="col-md-6 service-box wow fadeInLeft animated" data-wow-delay="0.4s" style="visibility: visible; -webkit-animation-delay: 0.4s;">
						<figure class="icon">
							<a href="QuestionR.jsp"><img src="img/test/4.png" alt="" /></a>
						</figure>
						<h5>疑问解答</h5>
						<p>我们网站提供对一些顾客的基本问题的解答</p>
					</div>
					<div class="clearfix"> </div>
				</div>
			</div>
			<div class="clearfix"> </div>
		</div>
		<!-- //container -->
	</div>
	<!-- //specialty -->
    
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