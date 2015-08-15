<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="c.tld" prefix="c" %>
<%@ taglib uri="fmt.tld" prefix="fmt" %>
<%@ taglib uri="fn.tld" prefix="fn" %>
<%@ taglib uri="sql.tld" prefix="sql" %>
<%@ taglib uri="x.tld" prefix="x" %>


<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
<head>    
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatibale" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1.0">
    <title>安生美，优质健康服务</title>
    <link rel="stylesheet" type="text/css"  href="<%=path %>/resource/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="<%=path %>/resource/css/style.css">
    <link rel="stylesheet" type="text/css" href="<%=path %>/resource/css/main.css">
    <link rel="shortcut icon" href="<%=path %>/resource/images/title.jpg" type="image/x-icron" />
    <script type="text/javascript" src="<%=path %>/resource/jquery/jquery-1.11.0.min.js"></script>
</head>
<body>
	<header id="header">
        <div class="header-right">
            <a href="javascript:void(0);">网站首页</a>&nbsp;&nbsp;|&nbsp;
            <a href="javascript:void(0);">在线调查</a>&nbsp;&nbsp;|&nbsp;
            <a href="javascript:void(0);">网站收藏</a>
        </div>
        <div class="header-top">
        	<img src="<%=path %>/resource/images/Logo.gif">
        </div>
        
        <!--        -->
        <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
            <ol class="carousel-indicators">
                <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                <li data-target="#carousel-example-generic" data-slide-to="1" ></li>
                <li data-target="#carousel-example-generic" data-slide-to="2" ></li>
                <li data-target="#carousel-example-generic" data-slide-to="3" ></li>
            </ol>
            <div class="carousel-inner" role="listbox">
                <div class="item active"> <img  src="<%=path %>/resource/images/1.png" alt="0 slide" > </div>
                <div class="item"> <img src="<%=path %>/resource/images/2.png" alt="1 slide" >    </div>
                <div class="item"> <img src="<%=path %>/resource/images/3.png" alt="2 slide" >    </div>
                <div class="item"> <img src="<%=path %>/resource/images/4.png" alt="3 slide" ></div>
            </div>
            <a class="left carousel-control" href="#carousel-example-generic" data-slide="prev">‹</a>
            <a class="right carousel-control" href="#carousel-example-generic" data-slide="next">›</a> 
        </div>
    </header>
    <!--  导航栏  -->
    <nav class="navbar navbar-inverse" role="navigation" id="menu-nav">
        <div class="container">
            <ul class="nav navbar-nav nav-left">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">关于安生美<span class="caret"></span></a>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href="#">公司介绍</a></li>
                        <li><a href="#">公司团队</a></li>
                        <li><a href="#">环境及设备</a></li>
                        <li><a href="#">认识健检</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">新闻动态<span class="caret"></span></a>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href="#">安生美动态</a></li>
                        <li><a href="#">行业动态</a></li>
                        <li><a href="#">活动讯息</a></li>
                        <li><a href="#">城市新闻</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">产品与服务<span class="caret"></span></a>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href="#">健康体检</a></li>
                        <li><a href="#">会员产品</a></li>
                        <li><a href="#">健康管理服务</a></li>
                        <li><a href="#">营养品</a></li>
                        <li><a href="#">在线预约</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">健康资讯<span class="caret"></span></a>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href="#">健康资讯</a></li>
                        <li><a href="#">健检回答</a></li>
                        <li><a href="#">专家博客</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">会员空间<span class="caret"></span></a>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href="#">体检报告</a></li>
                        <li><a href="#">健康促进书</a></li>
                        <li><a href="#">会员留言</a></li>
                        <li><a href="#">会员上传</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">员工专区<span class="caret"></span></a>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href="#">企业邮箱入口</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">联系我们<span class="caret"></span></a>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href="#">公司联系方式</a></li>
                        <li><a href="#">服务反馈</a></li>
                        <li><a href="#">招纳贤才</a></li>
                    </ul>
                </li>
            </ul>
            <ul class="nav navbar-nav navbar-right nav-right">
                <li><a href="#" data-toggle="modal" data-target="#login-modal" id="login-btn">登录</a></li>
                <li><a href="#" data-toggle="modal" data-target="#register-modal" id="register-btn">注册</a></li>
            </ul>   
        </div>
    </nav>
<section class="main">
        <div class="container-fluid">
            <!-- 登录框 -->
            <div id="login-modal" class="modal fade" role="dialog" aria-labelledby="modal-label" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button class="close" type="button" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">关闭</span></button>
                            <h4 class="modal-title" id="modal-label">登录</h4>
                        </div>
                        <div class="modal-body">
                            <form:form commandName="account" action="operation" method="post" cssClass="form">
                                <div class="form-group">
                                    <label for="account">账号</label>
                                	<form:input path="account" id="account" cssClass="form-control" placeholder="请输入用户名" value="${user.username}"/>
                                </div>
                               
                                <div class="form-group">
                                    <button type="submit" class="btn btn-success btn-lg btn-block">登录</button>
                                </div>
                                <div class="form-group">
                            		<span style="color:red;">
                            			<c:if test="${warning == '1'}">你输入的用户名或密码错误</c:if>
                            		</span>
                            	</div>
                            </form:form>
                        </div>
                    </div>
                </div>
            </div>
         
            <!-- end -->
            <div class="row">
            	<div class="col-md-10 health-title">
            		<h4>Expert Blog / 专家博客</h4>
            	</div>
            	<div class="col-md-2 rservation-title">
            		<h4><a href="#">在线预约</a></h4>
            	</div>
            </div>
			<div class="row row-logo">
				<img src="<%=path %>/resource/images/News_1_1s.jpg" alt="">
			</div>
			<div class="row row-logo row-blog">
				<img src="<%=path %>/resource/images/HI_3_2.jpg" alt="">
			</div>
			<div class="row">
				<div class="col-md-4">
					<img src="<%=path %>/resource/images/HI_3_3.jpg" alt="">
				</div>
				<div class="col-md-4">
					<img src="<%=path %>/resource/images/HI_3_4.jpg" alt="">
				</div>
				<div class="col-md-4">
					<img src="<%=path %>/resource/images/HI_3_5.jpg" alt="">
				</div>
			</div>
        </div>
    </section>  
</body>
<font >
    <div id="End" align="center"><a href="javascript:scrollTo(0,0);"><img src="<%=path %>/resource/images/top.gif" width="51" height="12" border="0"></a></div>
    <div align="right" style="margin:10px auto;width:920px;">© 2009-2011 成都安生美健康体检医院有限公司版权所有 Web Powered By A.U LabTM 2009
    <br>
      地址：成都市高新区高新国际广场D座三层<br>
      电话：028-82829292 82829393<br>
      传真：028-82828908
    </div>
</font>
<script type="text/javascript" src="<%=path %>/resource/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="<%=path %>/resource/js/index.js"></script>
<script type="text/javascript" src="<%=path %>/resource/js/nav.js"></script>
<c:if test="${!empty warning}">
<script type="text/javascript">
	var $loginBtn = $("#login-btn");
    $loginBtn.click();
</script>                            	
</c:if>

<c:if test="${!empty rgwarning}">
<script type="text/javascript">
	var $loginBtn = $("#register-btn");
    $loginBtn.click();
</script>
                            	
</c:if>
</html>