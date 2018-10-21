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
      <th width="15%">课题类型</th>
      <th width="20%">课题来源</th>
      <th width="10%">申请状态</th>
      <th width="15%">操作</th>
    </tr>
	<c:forEach items="${ThesisInfo}" var="thesis" begin="0" step="1">
    <tr>
      <td>${thesis.thesischeck.thid}</td>     
      <td>${thesis.thesischeck.thtitle}</td>     
      <td>${thesis.thesischeck.thclass}</td>
      <td>${thesis.thesischeck.thfrom}</td>
      <c:if test="${thesis.thesisapply.apply eq 1}">
      <td>未处理</td>
      <td>
      	<div class="button-group">
      		<a class="button border-red" href="javascript:void(0)" onclick="del(${thesis.thesischeck.thid})"><span  class="icon-trash-o"></span>删除</a>
      	</div>
      </td>
      </c:if>
      <c:if test="${thesis.thesisapply.apply eq 0}">
      <td>已拒绝</td>
      <td>
      	<div class="button-group">
      		<a class="button border-red" href="javascript:void(0)" onclick="del(${thesis.thesischeck.thid})"><span  class="icon-trash-o"></span>删除</a>
      	</div>
      </td>
      </c:if>
      <c:if test="${thesis.thesisapply.apply eq 2}">
      <td>同意</td>
      <td>
      	<div class="button-group">
      		<a class="button border-red" href="javascript:void(0)" onclick="info()"><span  class="icon-trash-o"></span>删除</a>
      	</div>
      </td>
      </c:if>
    </tr>
    </c:forEach>
  </table>
</div>
<script type="text/javascript">
function del(thid){
	if(confirm("您确定要删除吗?")){
	alert(thid);
	location.href="${pageContext.request.contextPath}/delthesisapply.action?thid="+thid;
	}
}
function info(){
	alert("已经选定无法删除。如有疑问，请联系管理员！！！");
}
</script>
</body></html>