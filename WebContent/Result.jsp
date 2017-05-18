<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<title>查找结果</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Truck Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template,Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- bootstarp-css -->
<link href="css/test/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/Result.css" rel="stylesheet" type="text/css" media="all" />
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
<%
String departure = (String)request.getAttribute("departure"); 
String year = (String)request.getAttribute("year"); 
String destination = (String)request.getAttribute("destination"); 
String month = (String)request.getAttribute("month"); 
String day = (String)request.getAttribute("day"); 
String name=request.getParameter("username");

response.setContentType("text/html;charset=UTF-8");
request.setCharacterEncoding("UTF-8");
%>

<script language="javascript">
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
function goBuy() 
{
	var location= "Buy.jsp";
	window.location.href = location;
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
					<a href="index.html"><img src="img/test/logo.png" alt="" /></a>
				</div>
				<div class="top-nav">
					<span class="menu"><img src="img/test/menu.png" alt=""></span>
					<ul class="nav1">
						<li class="hvr-sweep-to-bottom"><a href="#" onclick="goSomeWhere(1)">首页<i><img src="img/test/nav-but1.png" alt=""/></i></a></li>
						<li class="hvr-sweep-to-bottom"><a href="#" onclick="goSomeWhere(2)">关于我们<i><img src="img/test/nav-but2.png" alt=""/></i></a></li>
						<li class="hvr-sweep-to-bottom"><a href="#" onclick="goSomeWhere(3)">疑问<i><img src="img/test/nav-but4.png" alt=""/></i></a></li>
						<li class="hvr-sweep-to-bottom"><a href="#" onclick="JavaScript:window.history.go(-1);">重新搜索<i><img src="img/test/nav-but4.png" alt=""/></i></a></li>
						<li class="hvr-sweep-to-bottom"><a href="index.html">退出登录<i><img src="img/test/nav-but3.png" alt=""/></i></a></li>
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
	<!--blog -->
<div class="blog">
	<div class="container">
			
<header>
<h1>出发城市：<%=departure %>
&nbsp;&nbsp;&nbsp;&nbsp;
到达城市：<%=destination %>
&nbsp;&nbsp;&nbsp;&nbsp;
出发时间：<%=year +" 年 "+month+" 月 "+day+" 日"%>
</h1>

</header>

<%
   List <Map<String, Object>> list = (List<Map<String, Object>>) request.getAttribute("lists");//对servlet中的数据的接收
   if (list == null || list.size() < 1) {//判断数据库中有没有数据
       out.print("数据库中没有数据");
   } else {
%>
<%
    List<Map<Object, Object>> flightList = new ArrayList<Map<Object, Object>>();//存放数据库中的数据
    Map<Object, Object> m = new HashMap<Object, Object>();
    %>
 <%
for (int i = 0; i < list.size(); i++)
{//对接收的数据进行遍历打印
%>
<div class="main">
<span class="font1"><%=list.get(i).get("company")%>&nbsp;&nbsp;<%=list.get(i).get("flightnumber")%><span class="font6"><%=list.get(i).get("leavetime")%>&nbsp;—————&nbsp;<%=list.get(i).get("arrivetime")%></span></span>
<br>
<span class="font2"><%=list.get(i).get("departure")%><span class="font3"><%=list.get(i).get("destination")%></span></span>
  <br>
<span class="font4"><%=list.get(i).get("jixing")%></span>

<form method="post" action="shoppingCartServlet">

<input type="hidden" name="company" value="<%=list.get(i).get("company")%>">
<input type="hidden" name="flightnumber" value="<%=list.get(i).get("flightnumber")%>">
<input type="hidden" name="leavetime" value="<%=list.get(i).get("leavetime")%>">
<input type="hidden" name="arrivetime" value="<%=list.get(i).get("arrivetime")%>">
<input type="hidden" name="departure" value="<%=list.get(i).get("departure")%>">
<input type="hidden" name="destination" value="<%=list.get(i).get("destination")%>">
<input type="hidden" name="jixing" value="<%=list.get(i).get("jixing")%>">
<input type="hidden" name="price" value="<%=list.get(i).get("price")%>">
<input type="hidden" name="name" value="<%=name%>">
<input type="hidden" name="year" value="<%=year%>">
<input type="hidden" name="month" value="<%=month%>">
<input type="hidden" name="day" value="<%=day%>">
<input type="hidden" name="departurecity" value="<%=departure%>">
<input type="hidden" name="destinationcity" value="<%=destination%>">

<ul style="position: absolute; top:23px;left:900px;" class="one">
<li class="one"><a href="#">￥<%=list.get(i).get("price")%>起</a>
<ul class="one">
<li class="one"><input type="submit" value="加入购物车"></li>
</form>
<li class="one"><input type="button" value=" 立即购买" onclick="goBuy()"></li>
 </ul>
  </li>
  </ul>
  </div>  
    <div class="blank"></div>
    
    <%
        }  }
    %>
			</div>
			</div>
	<!-- //blog -->
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