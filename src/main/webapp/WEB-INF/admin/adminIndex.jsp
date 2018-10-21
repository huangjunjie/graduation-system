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
    <title>教务老师管理中心</title>  
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/pintuer.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/admin-o.css">
    <script src="${pageContext.request.contextPath}/js/jquery.js"></script>   
</head>
<body style="background-color:#f2f9fd;">
<div class="header bg-main">
  <div class="logo margin-big-left fadein-top">
    <h1><img src="images/y.jpg" class="radius-circle rotate-hover" height="50" alt="" />教务老师管理中心</h1>
  </div>
  <div class="head-l"><a class="button button-little bg-green"><span class="icon-home"></span> 前台首页</a> &nbsp;&nbsp;<a class="button button-little bg-blue"><span class="icon-wrench"></span> 欢迎！！${adminid}老师</a> &nbsp;&nbsp;<a class="button button-little bg-red" href="${pageContext.request.contextPath}/index-a.jsp"><span class="icon-power-off"></span> 退出登录</a> </div>
</div>
<div class="leftnav">
  <div class="leftnav-title"><strong><span class="icon-list"></span>菜单列表</strong></div>
  <h2><span class="icon-user"></span>学生信息管理</h2>
  <ul style="display:block">
    <li><a href="aGetAllSAccount.action" target="right"><span class="icon-caret-right"></span>账号管理</a></li>
    <li><a href="aGetAllSInfo.action" target="right"><span class="icon-caret-right"></span>信息管理</a></li>
  </ul>   
  <h2><span class="icon-user"></span>老师信息管理</h2>
  <ul>
    <li><a href="aGetAllTAccount.action" target="right"><span class="icon-caret-right"></span>账号管理</a></li>
    <li><a href="aGetAllTInfo.action" target="right"><span class="icon-caret-right"></span>信息管理</a></li>
  </ul>
  <h2><span class="icon-pencil-square-o"></span>批量题目审核</h2>
  <ul>
    <li><a href="BatCheck.html" target="right"><span class="icon-caret-right"></span>批量题目审核</a></li>
  </ul> 
  <h2><span class="icon-pencil-square-o"></span>批量信息服务</h2>
  <ul>
    <li><a href="list.html" target="right"><span class="icon-caret-right"></span>导入</a></li>
    <li><a href="add.html" target="right"><span class="icon-caret-right"></span>导出</a></li>
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
  <li><a href="#" target="right" class="icon-home"> 首页</a></li>
  <li><a href="" id="a_leader_txt"></a></li>
</ul>
<div class="admin">
  <iframe scrolling="auto" rameborder="0" src="" name="right" width="100%" height="100%"></iframe>
</div>
</body>
</html>