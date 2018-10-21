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
      <div class="form-group" >
        <div class="label">
          <label>学号：</label>
        </div>
        <div class="field">
          <input type="text" class="input input_length" name="stitle" value="${Studentinfo.uid}"  disabled="true" />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>姓名：</label>
        </div>
        <div class="field">
          <input type="text" class="input input_length" name="stitle" value="${Studentinfo.name}"  disabled="true" />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>性别：</label>
        </div>
        <div class="field">
          <input type="text" class="input input_length" name="stitle" value="${Studentinfo.sex}"  disabled="true" />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>籍贯：</label>
        </div>
        <div class="field">
          <input type="text" class="input input_length" name="stitle" value="${Studentinfo.destination}"  disabled="true" />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>身份证号：</label>
        </div>
        <div class="field">
          <input type="text" class="input input_length" name="stitle" value="${Studentinfo.idcard}"  disabled="true" />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>电话：</label>
        </div>
        <div class="field">
          <input type="text" class="input input_length" name="stitle" value="${Studentinfo.tel}"  disabled="true" />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>E-mail：</label>
        </div>
        <div class="field">
          <input type="text" class="input input_length" name="stitle" value="${Studentinfo.email}"  disabled="true" />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>班级：</label>
        </div>
        <div class="field">
          <input type="text" class="input input_length" name="stitle" value="${Studentinfo.classes}"  disabled="true" />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>民族：</label>
        </div>
        <div class="field">
          <input type="text" class="input input_length" name="stitle" value="${Studentinfo.nation}"  disabled="true" />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>备注：</label>
        </div>
        <div class="field">
          <textarea class="input input_length" name="skeywords" value="${Studentinfo.remark}" style="height:80px" disabled="true"></textarea>
          <div class="tips"></div>
        </div>
      </div>
  </div>
</div>
</body></html>