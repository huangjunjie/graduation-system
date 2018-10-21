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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/pintuer.css"> 
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/admin.css">  
    <script src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <script src="${pageContext.request.contextPath}/js/pintuer.js"></script>  
    <style type="text/css">
    	   .label{ float: left;width: 10%;text-align: right;padding: 7px 7px 7px 0;text-align:center
             white-space: nowrap;text-overflow: ellipsis; overflow: hidden;
             font-size:14px;}
           .input_length{width: 80%}
    </style>
</head>
<body>
<div class="panel admin-panel">
  <div class="panel-head"><strong><span class="icon-pencil-square-o"></span>选题报表</strong></div>
  <div class="body-content">
      <div class="form-group" >
        <div class="label">
          <label>课题编号：</label>
        </div>
        <div class="field">
          <input type="text" class="input input_length" name="stitle" value="${ThesisInfo.thesischeck.thid}"  disabled="true" />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>课题名：</label>
        </div>
        <div class="field">
          <input type="text" class="input input_length" name="stitle" value="${ThesisInfo.thesischeck.thtitle}"  disabled="true" />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>课题类型：</label>
        </div>
        <div class="field">
          <input type="text" class="input input_length" name="stitle" value="${ThesisInfo.thesischeck.thclass}"  disabled="true" />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>课题来源：</label>
        </div>
        <div class="field">
          <input type="text" class="input input_length" name="stitle" value="${ThesisInfo.thesischeck.thfrom}"  disabled="true" />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>教师号：</label>
        </div>
        <div class="field">
          <input type="text" class="input input_length" name="stitle" value="${Teacherinfo.tid}"  disabled="true" />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>老师姓名：</label>
        </div>
        <div class="field">
          <input type="text" class="input input_length" name="stitle" value="${Teacherinfo.name}"  disabled="true" />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>所属教研室：</label>
        </div>
        <div class="field">
          <input type="text" class="input input_length" name="stitle" value="${Teacherinfo.department}"  disabled="true" />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>Email：</label>
        </div>
        <div class="field">
          <input type="text" class="input input_length" name="stitle" value="${Teacherinfo.email}"  disabled="true" />
          <div class="tips"></div>
        </div>
      </div>
  </div>
</div>
</body>
</html>