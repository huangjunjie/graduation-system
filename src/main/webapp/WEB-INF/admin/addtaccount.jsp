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
  <div class="panel-head"><strong><span class="icon-pencil-square-o"></span>个人信息</strong></div>
  <div class="body-content">
  <form method="post" class="form-x" action="aAddTAccount.action">
      <div class="form-group" >
        <div class="label">
          <label>工号：</label>
        </div>
        <div class="field">
          <input type="text" class="input input_length" name="tid"  />
          <div class="tips"></div>
        </div>
      </div>
       <div class="form-group" >
        <div class="label">
          <label>密码：</label>
        </div>
        <div class="field">
          <input type="text" class="input input_length" name="password"  />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>姓名：</label>
        </div>
        <div class="field">
          <input type="text" class="input input_length" name="name"   />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>所属教研室：</label>
        </div>
        <div class="field">
          <input type="text" class="input input_length" name="department" />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>教育程度：</label>
        </div>
        <div class="field">
          <input type="text" class="input input_length" name="education"  />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>职称：</label>
        </div>
        <div class="field">
          <input type="text" class="input input_length" name="profession" />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>性别：</label>
        </div>
        <div class="field">
          <input type="text" class="input input_length" name="sex" />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>邮箱：</label>
        </div>
        <div class="field">
          <input type="text" class="input input_length" name="email" />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>政治面貌：</label>
        </div>
        <div class="field">
          <input type="text" class="input input_length" name="apearance"  />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>备注：</label>
        </div>
        <div class="field">
          <textarea class="input input_length" name="remark" style="height:80px" ></textarea>
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label></label>
        </div>
        <div class="field">
          <button class="button bg-main icon-check-square-o" type="submit">提交</button>   
        </div>
      </div>  
      </form>    
  </div>
</div>
</body></html>