<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE>
<html lang="zh-cn">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<title></title>
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/pintuer.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/admin.css">
<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/js/pintuer.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<style type="text/css">
	.table td{vertical-align: middle; !important}
</style>
</head>
<body>
<!-- 项目Modal -->
    <div class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" id="mymodal">
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-label="Close"></button>
            <h4 class="modal-title">职工信息</h4>
          </div>
          <div class="modal-body">
            <table class="table table-hover">
              <tr>
                <th>标题</th>
                <th>信息</th>
              </tr>
              <tr>
                <td>职工号</td><td id="Mtid"></td>
              </tr>
              <tr>
                <td>老师姓名</td><td id="Mname"></td>
              </tr>
              <tr>
                <td>所属教研室</td><td id="Mdepart"></td>
              </tr>
              <tr>
                <td>Email</td><td id="Memail"></td>
              </tr>
            </table>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-primary" data-dismiss="modal">Close</button>
          </div>
        </div><!-- /.modal-content -->
      </div><!-- /.modal-dialog -->
    </div><!-- /.modal -->



<!-- 项目主页 -->
<div class="panel admin-panel">
  <div class="panel-head"><strong class="icon-reorder">内容列表</strong></div>
  <table class="table table-hover text-center" style="font-size:14px !important">
    <tr>
      <th width="10%">课题ID</th>
      <th width="20%">课题名</th>
      <th width="15%">课题类型</th>
      <th width="20%">课题来源</th>
      <th width="10%">审核状态</th>
      <th width="15%">操作</th>
    </tr>
    
    
   	<c:forEach items="${Thesischecklist}" var="thesis" begin="0" step="1">
    <tr>

      <c:if test="${thesis.getCheckd() eq 0}">
      <td>${thesis.getThid()}</td>     
      <td>${thesis.getThtitle()}</td>     
      <td>${thesis.getThclass()}</td>
      <td>${thesis.getThtitle()}</td>
      <td>未审核</td>
      <td>
      <div class="button-group">
      <a class="button border-main" href="javascript:void(0)" onclick="return disagree()"><span class="icon-edit"></span>选课</a>
      <a class="button border-yellow" href="javascript:void(0)"  onclick="info_click(${thesis.getTid()})"><span class="icon-adjust"></span>详情</a>
      </div>
      </td>
      </c:if>
      <c:if test="${thesis.getCheckd() eq 1}">
      <td>${thesis.getThid()}</td>     
      <td>${thesis.getThtitle()}</td>     
      <td>${thesis.getThclass()}</td>
      <td>${thesis.getThtitle()}</td>
	  <td>已通过</td>
      <td>
      <div class="button-group">
      <a class="button border-main" href="javascript:void(0)" onclick="return find(${thesis.getTid()},${thesis.getThid()})"><span class="icon-edit"></span>选课</a>
      <a class="button border-yellow" href="javascript:void(0)"  onclick="info_click(${thesis.getTid()})"><span class="icon-adjust"></span>详情</a>
      </div>
      </td>
	  </c:if>
    </tr>
    </c:forEach>
  </table>
</div>
<script type="text/javascript">

	function find(id,mid){
	if(confirm("是否确定选择选课,课题号为"+mid)){
		location.href="add.action?tid="+id+"&thid="+mid;
	}
}
	function disagree()
	{
		alert("选题未审核，无法选题");
	}
	//ajax
      function info_click(tid)
      {
    	  var params={};
    	  params.tid=tid;
          $.ajax({
                type:'POST',
                url : "${pageContext.request.contextPath}/json.action",
                contentType : "application/json",
                data : params,
                dataType : 'json',
                async : true,        // 异步
                success : function(data) { 
                		$("#Mtid").html(data.tid);
                		$("#Mname").html(data.name);
                		$("#Mdepart").html(data.deparment);
                		$("#Memail").html(data.email);
                   }
                })
          $('#mymodal').modal('show');
      }
</script>
</body></html>