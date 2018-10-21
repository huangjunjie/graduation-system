
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title>学生毕业设计管理中心</title>  
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/images/favicon.ico">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/pintuer.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/admin.css">
    <script src="${pageContext.request.contextPath}/js/jquery.js"></script>   
</head>
<body style="background-color:#f2f9fd;">
<div class="header bg-main">
  <div class="logo margin-big-left fadein-top">
    <h1><img src="${pageContext.request.contextPath}/images/y.jpg" class="radius-circle rotate-hover" height="50" alt="" />学生毕业设计管理中心</h1>
  </div>
  <div class="head-l"><a class="button button-little bg-green"  href="#"><span class="icon-home"></span>学生首页</a> &nbsp;&nbsp;<a href=""  class="button button-little bg-blue">欢迎！${StudentinfoE.name}</a> &nbsp;&nbsp;<a class="button button-little bg-red" href="${pageContext.request.contextPath}/index-s.jsp"><span class="icon-power-off"></span>退出登录</a> </div>
</div>
<div class="leftnav">
  <div class="leftnav-title"><strong><span class="icon-list"></span>菜单列表</strong></div>
  <h2><span class="icon-user"></span>用户管理</h2>
  <ul style="display:block">
    <li><a href="personInfo.action" target="right"><span class="icon-caret-right"></span>个人信息</a></li>
    <li><a href="updatePass.action" target="right"><span class="icon-caret-right"></span>修改密码</a></li>
  </ul>   
  <h2><span class="icon-pencil-square-o"></span>选题管理</h2>
  <ul>
    <li><a href="Bank.action" target="right"><span class="icon-caret-right"></span>毕设题库</a></li>
    <li><a href="operation.action" target="right"><span class="icon-caret-right"></span>选题操作</a></li>
    <li><a href="thesisInfo.action" target="right"><span class="icon-caret-right"></span>选题报表</a></li>   
  </ul>  
  <h2><span class="icon-pencil-square-o"></span>开题管理</h2>
  <ul>
    <li><a href="receiveTask.action" target="right"><span class="icon-caret-right"></span>接受任务</a></li>
    <li><a href="writeOpen.action" target="right"><span class="icon-caret-right"></span>撰写报告</a></li>
    <li><a href="reportManage.action" target="right"><span class="icon-caret-right"></span>报告管理</a></li>    
  </ul>  
</div>
<script type="text/javascript">
$(function(){
  $(".leftnav h2").click(function(){
	  $(this).next().slideToggle(200);	
	  $(this).toggleClass("on"); 
  })
  $(".leftnav ul li a").click(function(){
	    $("#a_leader_txt").text($(this).text());
  		$(".leftnav ul li a").removeClass("on");
		$(this).addClass("on");
  })
});
</script>
<ul class="bread">
  <li><a href="" target="" class="icon-home"> 首页</a></li>
  <li><a href="##" id="a_leader_txt"></a></li>
</ul>
<div class="admin">
  <iframe scrolling="auto" rameborder="0" src="" name="right" width="100%" height="100%"></iframe>
</div>
</body>
</html>