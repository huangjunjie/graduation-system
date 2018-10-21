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
    <title>个人信息</title>  
    <link rel="stylesheet" href="css/pintuer.css">
    <link rel="stylesheet" href="css/admin.css">
    <script src="js/jquery.js"></script>
    <script src="js/pintuer.js"></script>  
</head>
<body>
<div class="panel admin-panel">
  <div class="panel-head"><strong><span class="icon-pencil-square-o"></span>任务书详情</strong></div>
  <div class="body-content">
    <form method="post" class="form-x" action="">
      <div class="form-group">
        <div class="label">
          <label>任务书编号：</label>
        </div>
        <div class="field" >
          <input type="text" class="input " name="stitle" value="${task.taskid}" size="50"  disabled="true" />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>教师编号：</label>
        </div>
        <div class="field">
          <input type="text" class="input" name="stitle" value="${task.tid}"  disabled="true" />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>内容A：</label>
        </div>
        <div class="field">
          <textarea class="input" name="skeywords" style="height:80px" disabled="true">${task.contenta}</textarea>
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>内容B：</label>
        </div>
        <div class="field">
          <textarea class="input" name="skeywords" style="height:80px" disabled="true" >${task.contentb}</textarea>
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>内容C：</label>
        </div>
        <div class="field">
          <textarea class="input" name="skeywords" style="height:80px" disabled="true" >${task.contentc}</textarea>
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>内容D：</label>
        </div>
        <div class="field">
          <textarea class="input" name="skeywords" style="height:80px" disabled="true" >${task.contentd}</textarea>
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label"> 
          <label>备注：</label>
        </div>
        <div class="field">
          <textarea class="input" name="skeywords" style="height:80px" disabled="true" >${task.remark}</textarea>
          <div class="tips"></div>
        </div>
      </div>
    </form>
  </div>
</div>
</body></html>