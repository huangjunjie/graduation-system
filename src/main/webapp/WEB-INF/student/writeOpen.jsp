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
  <div class="panel-head"><strong><span class="icon-pencil-square-o"></span>添加题目</strong></div>
  <div class="body-content">
    <form method="post" class="form-x" action="writeOpendo.action">
      <div class="form-group">
        <div class="label">
          <label>开题报告ID：</label>
        </div>
        <div class="field" >
          <input type="text" class="input " value="自动编号" size="50"  disabled="true" />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>论文标题：</label>
        </div>
        <div class="field">
          <input type="text" class="input" name="tid" value="${Thtitle}"  disabled="true" />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>工号：</label>
        </div>
        <div class="field">
          <input type="text" class="input" name="tid" value="${TID}"  disabled="true" />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>学号：</label>
        </div>
        <div class="field">
          <input type="text" class="input" name="uid" value="${UID}" />
          <div class="tips"></div>
        </div>
      </div>
	  <div class="form-group">
        <div class="label">
          <label>内容A：</label>
        </div>
        <div class="field">
          <textarea name="contenta" class="input" style="height:80px; border:1px solid #ddd;"></textarea>
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>内容B：</label>
        </div>
        <div class="field">
          <textarea name="contentb" class="input" style="height:80px; border:1px solid #ddd;"></textarea>
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>内容C：</label>
        </div>
        <div class="field">
          <textarea name="contentc" class="input" style="height:80px; border:1px solid #ddd;"></textarea>
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>内容D：</label>
        </div>
        <div class="field">
          <textarea name="contentd" class="input" style="height:80px; border:1px solid #ddd;"></textarea>
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>内容E：</label>
        </div>
        <div class="field">
          <textarea name="contente" class="input" style="height:80px; border:1px solid #ddd;"></textarea>
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>内容F：</label>
        </div>
        <div class="field">
          <textarea name="contentf" class="input" style="height:80px; border:1px solid #ddd;"></textarea>
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>备注：</label>
        </div>
        <div class="field">
          <textarea name="remark" class="input" style="height:80px; border:1px solid #ddd;"></textarea>
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label></label>
        </div>
        <div class="field">
          <input type="hidden" name="status" id="status"/>
          <button class="button bg-main icon-check-square-o" onclick="add(2)" style="float:left;"> 提交</button>
          <button class="button bg-yellow icon-check-square-o" onclick="add(1)" style="float:left; margin-left:20px;width:107px;"> 暂存</button>
        </div>
      </div>  
    </form>
  </div>
</div>
</body>
<script type="text/javascript">
	function add(data){
	$("#status").val(data);
	$("form").submit();
	}
</script>
</html>