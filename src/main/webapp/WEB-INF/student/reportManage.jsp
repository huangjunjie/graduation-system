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
<title></title>
<link rel="stylesheet" href="css/pintuer.css">
<link rel="stylesheet" href="css/admin.css">
<script src="js/jquery.js"></script>
<script src="js/pintuer.js"></script>
</head>
<body>
<div class="panel admin-panel">
  <div class="panel-head"><strong class="icon-reorder"> 任务书列表</strong></div>
  <table class="table table-hover text-center">
    <tr>
      <th width="15%">编号</th>
      <th width="15%">开题报告ID</th>
      <th width="15%">课题名</th>
      <th width="15%">最后操作时间</th>
      <th width="10%">状态</th>
      <th width="30%">操作</th>
    </tr>
    <c:forEach items="${Openreportlist}" var="openreport">
    <tr>
      <td>${openreport.id}</td>     
      <td>${openreport.orid}</td>     
      <td>${Thtitle}</td>
      <td>${openreport.lasttime}</td>
      <td>${openreport.status}</td>
      <c:if test="${openreport.status eq 0}">   
      <td><div class="button-group">
      <a class="button border-main" href="javascript:void(0)" onclick="updateOrid(${openreport.id})"><span class="icon-edit"></span> 修改</a>
      <a class="button border-green" href="javascript:void(0)" onclick="sendOrid(${openreport.id})"><span class="icon-eject"></span> 发送</a>
      <a class="button border-yellow" href="javascript:void(0)" onclick="BrowseOrid(${openreport.id})"><span class="icon-file-picture-o"></span>预览</a>
      </div></td>
      </c:if>
      <c:if test="${openreport.status eq 1}">
      <td><div class="button-group">
      <a class="button border-main" href="javascript:void(0)" onclick="updateOrid(${openreport.id})"><span class="icon-edit"></span> 修改</a>
      <a class="button border-green" href="javascript:void(0)" onclick="sendOrid(${openreport.id})"><span class="icon-eject"></span> 发送</a>
      <a class="button border-yellow" href="javascript:void(0)" onclick="BrowseOrid(${openreport.id})"><span class="icon-file-picture-o"></span>预览</a>
      </div></td>
      </c:if>
      <c:if test="${openreport.status eq 2}">
      <td><div class="button-group">
      <a class="button border-main" href="javascript:void(0)" onclick="showmessage()"><span class="icon-edit"></span> 修改</a>
      <a class="button border-green" href="javascript:void(0)" onclick="showmessage()"><span class="icon-eject"></span> 发送</a>
      <a class="button border-yellow" href="javascript:void(0)" onclick="BrowseOrid(${openreport.id})"><span class="icon-file-picture-o"></span>预览</a>
      </div></td>
      </c:if>
    </tr>
    </c:forEach>
  </table>
</div>
<script type="text/javascript">
	function showmessage()
	{
		alert("无法使用");
	}
	function updateOrid(data){
		location.href="updatereport.action?id="+data;
	}
	function sendOrid(data){
		location.href="sendreport.action?id="+data;
	}
	function BrowseOrid(data){
		location.href="browsereport.action?id="+data;
	}
</script>
</body></html>