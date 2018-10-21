<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/login.css" rel="stylesheet">
<title>登录</title>
</head>
<body>
<div class="container">
    <div class="row clearfix" id="prepage">
		<div class="col-md-12 column" >
		</div>
	</div>
	<div class="row clearfix" id="banner">
		<div class="col-md-11 column col-md-offset-1" >
			<img alt="180" src="images/banner-a.jpg" class="img-rounded " width="85%"/>
		</div>
	</div>
	<div class="row clearfix" id="content">
    	<div class="col-md-5 col-md-offset-1">
        	<blockquote>
				<p>
					管理就是把复杂的问题简单化，混乱的事情规划化。
				</p> <small>杰克·韦尔奇</small>
			</blockquote>
            <div class="jumbotron">
				<h2>
					毕业设计选课系统
				</h2>
				<p>
					 <a class="btn btn-primary btn-large" href="#">Learn more</a>
				</p>
			</div>
        </div>
		<div class="col-md-4 column table-bordered div-rounded" >
			<form role="form" id="input_info" action="aLoginCheck.action" method="post">
				<div class="form-group">
					 <label for="UID">工号</label><input type="text" class="form-control" id="adminid" name="adminid"/>
				</div>
				<div class="form-group">
					 <label for="PASSWORD">密码</label><input type="password" class="form-control" id="adminpassword" name="adminpassword"/>
				</div>
				<div class="checkbox">
					 <label><input type="checkbox" />记住密码</label>
				</div> <button type="submit" class="btn btn-default">提交</button>
			</form>
		</div>
	</div>
    <div class="col-md-11 column text-info text-center" id="bottom">
    	<div>
        <p>
			Copyright  湖南理工学院 2010-2015 . All Rights Reserved.
              &湘ICP备05003891号  湘教QS3-200505-000078 湘公网安备 43060202000045号
         </p>
         <p class="col-md-12">
         校址：湖南省岳阳市学院路　邮编：414006 电话：0730-8640001 投稿邮箱：hnistxcb@163.com
         </p>
        </div>
	</div>
</div>
</body>
</html>