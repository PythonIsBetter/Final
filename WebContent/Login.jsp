<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆</title>
<link rel="stylesheet" type="text/css" href="css/Login.css" />
<link href="css/test/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link rel="stylesheet" href="css/test/style.css" type="text/css" media="all" />
</head>

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
   </script>

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
						<li class="hvr-sweep-to-bottom"><a href="index.html">返回首页<i><img src="img/test/nav-but1.png" alt=""/></i></a></li>
						<li class="hvr-sweep-to-bottom"><a href="about.html">关于我们<i><img src="img/test/nav-but2.png" alt=""/></i></a></li>
						<li class="hvr-sweep-to-bottom"><a href="Question.html">疑问<i><img src="img/test/nav-but4.png" alt=""/></i></a></li>
						<li class="hvr-sweep-to-bottom active"><a href="Login.jsp">登录<i><img src="img/test/nav-but3.png" alt=""/></i></a></li>
						<li class="hvr-sweep-to-bottom"><a href="Register.jsp">注册<i><img src="img/test/nav-but3.png" alt=""/></i></a></li>
						</ul>
			    </div>
			    
<header>
<br>
<form style="text-align:center" method="post" action="LoginServlet">
<span class="input input--manami">
<input 
class="input__field input__field--manami" 
type="text" 
placeholder="用户名" 
id="name"
name="name" 
oninput="document.getElementById('username').innerHTML=this.value;" 
onpropertychange="document.getElementById('username').innerHTML=this.value;"
/>
<label class="input__label input__label--manami" for="input-32">
用户名<span class="input__label-content input__label-content--manami" id="username"></span></label>
</span>

<br>

<span  class="input input--manami">
<input 
class="input__field input__field--manami" 
type="password" 
placeholder="密码" 
id="password"
name="password" 
/>
<label class="input__label input__label--manami" for="input-32">
密码<span class="input__label-content input__label-content--manami" id="userpassword"></span></label>
</span>
</br></br>
<input class="button" type="submit" value="登陆" style="text-align:center"  onclick="check()">
</br></br></br></br></br></br>
<script type="text/javascript">
		immediately();
</script>
</form>
		 
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
					<li><a href="index.html">首页</a></li>
                    <li><a href="about.html">关于我们</a></li>
					<li><a href="Question.html">疑问</a></li>
					<li><a href="mail.html">联系我们</a></li>
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