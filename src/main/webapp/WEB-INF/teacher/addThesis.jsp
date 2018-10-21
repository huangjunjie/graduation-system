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
    <form method="post" class="form-x" action="tAddThesisapply.action">
      <div class="form-group">
        <div class="label">
          <label>课题ID：</label>
        </div>
        <div class="field" >
          <input type="text" class="input " value="自动编号" size="50"  disabled="true" />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>教师编号：</label>
        </div>
        <div class="field">
          <input type="text" class="input" value="${TID}"  disabled="true" />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>课题名称：</label>
        </div>
        <div class="field">
          <input type="text" class="input" name="thtitle" />
          <div class="tips"></div>
        </div>
      </div>

      <div class="form-group">
          <div class="label">
            <label>课题类型：</label>
          </div>
          <div class="field">
            <select name="thclass" class="input w50">
              <option value="">请选择类型</option>
              <option value="工程设计">工程设计</option>
              <option value="综合实验">综合实验</option>
              <option value="专题研究">专题研究</option>
              <option value="专题论文">专题论文</option>
              <option value="其他">其他</option>
            </select>
            <div class="tips"></div>
          </div>
      </div>
      <div class="form-group">
          <div class="label">
            <label>课题来源：</label>
          </div>
          <div class="field">
            <select name="thfrom" class="input w50">
              <option value="">请选择类型</option>
              <option value="导师课题">导师课题</option>
              <option value="系部拟定">系部拟定</option>
              <option value="学生自拟">学生自拟</option>
              <option value="其他">其他</option>
            </select>
            <div class="tips"></div>
          </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label></label>
        </div>
        <div class="field">
          <button class="button bg-main icon-check-square-o" onclick="add()" style="float:left;"> 提交</button>
        </div>
      </div>  
    </form>
  </div>
</div>
</body>
<script type="text/javascript">
	function add(){
	$("form").submit();
	}
</script>
</html>