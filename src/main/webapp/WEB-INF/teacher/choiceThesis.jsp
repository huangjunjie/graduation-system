<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<title></title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/pintuer.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/admin.css">
<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/js/pintuer.js"></script>
</head>
<body>
<div class="panel admin-panel">
  <div class="panel-head"><strong class="icon-reorder"> 内容列表</strong></div>
  <table class="table table-hover text-center">
    <tr>
      <th width="10%">课题编号</th>
      <th width="20%">课题名</th>
      <th width="15%">申请人名</th>
      <th width="20%">申请人班级</th>
      <th width="10%">申请人电话</th>
      <th width="15%">操作</th>
    </tr>
	<c:forEach items="${ThesisapplyVoList}" var="thesis">
    <tr>
      <td>${thesis.thid}</td>     
      <td>${thesis.thtitle}</td>     
      <td>${thesis.name}</td>
      <td>${thesis.classes}</td>
      <td>${thesis.tel}</td>
      <td>
      	<div class="button-group">
      		<a class="button border-yellow" href="javascript:void(0)" onclick="agree(${thesis.thid},${thesis.uid})"><span  class="icon-edit"></span>同意</a>
      		<a class="button border-red" href="javascript:void(0)" onclick="disagree(${thesis.thid},${thesis.uid})"><span  class="icon-edit"></span>不同意</a>
      	</div>
      </td>
    </tr>
    </c:forEach>
  </table>
</div>
<script type="text/javascript">
	function agree(thid,uid)
	{
		location.href="${pageContext.request.contextPath}/tagreeThesisApply.action?thid="+thid+"&uid="+uid;
	}	
	function disagree(thid,uid)
	{
		location.href="${pageContext.request.contextPath}/tdisagreeThesisApply.action?thid="+thid+"&uid="+uid;
	}
</script>
</body></html>