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
    <title>指导老师管理中心</title>  
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/images/favicon.ico">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/pintuer.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/teacher.css">
    <script src="${pageContext.request.contextPath}/js/jquery.js"></script>   
</head>
<body style="background-color:#f2f9fd;">
<div class="header bg-main">
  <div class="logo margin-big-left fadein-top">
    <h1><img src="images/y.jpg" class="radius-circle rotate-hover" height="50" alt="" />指导老师管理中心</h1>
  </div>
  <div class="head-l"><a class="button button-little bg-green"><span class="icon-home"></span> 前台首页</a> &nbsp;&nbsp;<a href="" class="button button-little bg-blue"><span class="icon-wrench"></span> 欢迎${TNAME}老师</a> &nbsp;&nbsp;<a class="button button-little bg-red" href="${pageContext.request.contextPath}/index-t.jsp"><span class="icon-power-off"></span> 退出登录</a> </div>
</div>
<div class="leftnav">
  <div class="leftnav-title"><strong><span class="icon-list"></span>菜单列表</strong></div>
  <h2><span class="icon-user"></span>用户管理</h2>
  <ul style="display:block">
    <li><a href="tGetTeacherInfo.action" target="right"><span class="icon-caret-right"></span>个人信息</a></li>
    <li><a href="tJumpUpdatePass.action" target="right"><span class="icon-caret-right"></span>修改密码</a></li>
  </ul>   
  <h2><span class="icon-pencil-square-o"></span>毕设选题管理</h2>
  <ul>
    <li><a href="tJumpAddThesisapply.action" target="right"><span class="icon-caret-right"></span>添加题目</a></li>
    <li><a href="tJumpGetThesisCheck.action" target="right"><span class="icon-caret-right"></span>题目管理</a></li>
    
    <li><a href="tJumpThesisApply.action" target="right"><span class="icon-caret-right"></span>甄别选题</a></li>
    <c:if test="${CHECKMAN eq 1}">
    <li><a href="tJumpThesisCheck.action" target="right"><span class="icon-caret-right"></span>题目审核</a></li>
    </c:if>
  </ul> 
  <h2><span class="icon-pencil-square-o"></span>任务书管理</h2>
  <ul>
  	<c:forEach items="${UIDLIST}" var="uid">
    <li><a href="tJumpGetTask.action?uid=${uid}" target="right"><span class="icon-caret-right"></span>${uid}</a></li>
    </c:forEach>
  </ul>   
  <h2><span class="icon-pencil-square-o"></span>开题报告管理</h2>
  <ul>
    <c:forEach items="${UIDLIST}" var="uid">
    <li><a href="list.html?uid=${uid}" target="right"><span class="icon-caret-right"></span>${uid}</a></li>
    </c:forEach>
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
  <li><a href="" target="right" class="icon-home"> 首页</a></li>
  <li><a href="" id="a_leader_txt"></a></li>
<div class="admin">
  <iframe scrolling="auto" rameborder="0" src="" name="right" width="100%" height="100%"></iframe>
</div>
</body>
</html>