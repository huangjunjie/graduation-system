<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>ajax</title>

    <!-- Bootstrap -->
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
    <div class="container">
      <div class="row">
        <div class="col-xs-12 text-center">
          <button id="findinfo" class="btn btn-primary" data-toggle="modal" onclick="info_click()" >modal</button>
        </div>
      </div>
    </div>

    <div class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" id="mymodal">
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            <h4 class="modal-title">职工信息</h4>
          </div>
          <div class="modal-body">
            <table class="table table-hover">
              <tr>
                <th>标题</th>
                <th>信息</th>
              </tr>
              <tr>
                <td>职工号</td><td>2000</td>
              </tr>
              <tr>
                <td>老师姓名</td><td>张建东</td>
              </tr>
              <tr>
                <td>所属教研室</td><td>软件工程</td>
              </tr>
              <tr>
                <td>电话</td><td>1558011003</td>
              </tr>
              <tr>
                <td>Email</td><td>1157510753@qq.com</td>
              </tr>
            </table>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-primary" data-dismiss="modal">Close</button>
          </div>
        </div><!-- /.modal-content -->
      </div><!-- /.modal-dialog -->
    </div><!-- /.modal -->

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <script type="text/JavaScript">
      function info_click()
      {
    	  var params={};
    	  params.tid="50001";
          $.ajax({
                type:'POST',
                url : "${pageContext.request.contextPath}/json.action",
                contentType : "application/json",
                data : params,
                dataType : 'json',
                async : true,        // 异步
                success : function(data) {  
                	if(data.result=='参数不合法')
                	{
                		alert("成功");
                	}
                   }
                })
          $('#mymodal').modal('show');
      }
    </script>
  </body>
</html>