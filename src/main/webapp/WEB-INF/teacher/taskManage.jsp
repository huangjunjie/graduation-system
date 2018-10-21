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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/admin-o.css">
    <script src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <script src="${pageContext.request.contextPath}/js/pintuer.js"></script>  
</head>
<body>
  <div class="panel admin-panel">
    <div class="panel-head"><strong class="icon-reorder">任务书管理</strong></div>
    <div class="padding border-bottom">
      <ul class="search">
         <li>
          <a href="javascript:void(0)" class="button border-yellow icon-edit" onclick="add()">添加</a>
         </li>
      </ul>
    </div>
   
    <table class="table table-hover text-center">
      <tr>
        <th>任务书ID</th>       
        <th>最后修改时间</th>
        <th>状态</th>
        <th>操作</th>       
      </tr>
      <form id="formdel" action="aDeleteMSAccount.action" method="post" >
      <c:forEach items="${TaskList}" var="task" >   
      <tr>
        <td>${task.taskid}</td>
        <td>${task.lasttime}</td>
        <c:if test="${task.status eq 2}">
        <td>已发送</td>
        <td>
        <div class="button-group">
        <a class="button border-yellow" href="javascript:void(0)" onclick=""><span class="icon-edit"></span>发送</a> 
        <a class="button border-green" href="javascript:void(0)" onclick=""><span class="icon-trash-o"></span>删除</a>  
        </div>
        </td>
        </c:if>
        <c:if test="${task.status eq 1}">
        <td>暂存</td>
        <td>
        <div class="button-group">
        <a class="button border-yellow" href="javascript:void(0)" onclick="return info()"><span class="icon-edit"></span>发送</a> 
        <a class="button border-green" href="javascript:void(0)" onclick="return del(${task.id})"><span class="icon-trash-o"></span>删除</a>  
        </div>
        </td>
        </c:if>
      </tr>
      </c:forEach>
      </form>
    </table>
    
  </div>
<script type="text/javascript">

function del(data){
	if(confirm("您确定要删除吗?")){
		location.href="${pageContext.request.contextPath}/tDeleteTask.action?id="+data;
	}
}

function add()
{
	location.href="${pageContext.request.contextPath}/tJumpAddTask.action?uid=${uid}";
}
function info()
{
	alert("当前无法使用！！！");
}
</script>
</body></html>