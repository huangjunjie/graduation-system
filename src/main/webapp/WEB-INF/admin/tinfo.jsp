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
    <div class="panel-head"><strong class="icon-reorder"> 学生账户</strong></div>
    <div class="padding border-bottom">
      <ul class="search">
        <li>
        <input type="text" placeholder="请输入学号" name="keywords" class="input" style="width:250px; line-height:17px;display:inline-block" value="${old}"/>
          <a href="javascript:void(0)" class="button border-main icon-search" onclick="changesearch()" > 搜索</a>
        </li>
      </ul>
    </div>
   
    <table class="table table-hover text-center">
      <tr>
        <th>工号</th>       
        <th>姓名</th>
        <th>性别</th>
        <th>职称</th>
        <th>邮箱</th>
        <th>操作</th>     
      </tr>
      <form id="formdel" action="aDeleteMSAccount.action" method="post" >
      <c:forEach items="${TeacherinfoList}" var="teacher" >   
      <tr>
        <td>${teacher.tid}</td>
        <td>${teacher.name}</td>
        <td>${teacher.sex}</td>
        <td>${teacher.profession}</td>
        <td>${teacher.email}</td>
        <td>
        <div class="button-group">
        <a class="button border-red" href="javascript:void(0)" onclick="del(${student.uid})"><span class="icon-trash-o"></span> 删除</a>  
        </div>
        </td>
      </tr>
      </c:forEach>
      </form>
    </table>
    
  </div>
<script type="text/javascript">

function del(data){
	if(confirm("您确定要删除吗?")){
		location.href="${pageContext.request.contextPath}/aDeleteTinfo.action?uid="+data;
	}
}

$("#checkall").click(function(){ 
  $("input[name='uid']").each(function(){
	  if (this.checked) {
		  this.checked = false;
	  }
	  else {
		  this.checked = true;
	  }
  });
})

function DelSelect(){
	var Checkbox=false;
	var str=[];
	var n = 0;
	var input= $("input[type=checkbox]");
	for(var ic=0;ic<input.length;ic++)
	{
		if(input[ic].checked)
		{
			Checkbox=true;
			str[n] = $(input[ic]).attr("sid");
			n++;
		}
	}
	if (Checkbox){
		var t=confirm("您确认要删除选中的内容吗？");
		if (t==false) 
		{
			return false;
		}
		else
		{
			$("#formdel").submit();
		}
	}
	else{
		alert("请选择您要删除的内容!");
		return false;
	} 
}

function changesearch()
{
	location.href="${pageContext.request.contextPath}/aGetDerpSAccount.action?uid="+$(".input").val();
}

function changeup(data)
{
	location.href="${pageContext.request.contextPath}/aJumpUpdateSAccount.action?uid="+data;
}
</script>
</body></html>