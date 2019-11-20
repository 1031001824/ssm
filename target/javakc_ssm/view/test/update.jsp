<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>数据字典添加页面</title>
		<%@ include file="../../common/jsp/header.jsp"%>
		<link href="${path }/static/css/plugins/file-input/fileinput.min.css" rel="stylesheet">
	</head>
	<body>
		<div class="wrapper wrapper-content animated fadeInRight">
			<div>
				<div class="col-sm-4"><input type="button" value="返回上一页" class="btn btn-success" onclick="javascript:history.back();"/></div>
			</div>
			<div class="ibox float-e-margins">
				<form action="${path}/test/update.do" method="post" class="form-horizontal" role="form">
                    <input type="hidden" value="${entity.testid}" name="testid" id="testid">
                    <fieldset>
                        <legend>数据字典基本信息</legend>
                       <div class="form-group">
                          <label class="col-sm-2 control-label" for="testname">名称</label>
                          <div class="col-sm-4">
                             <input class="form-control" type="text" name="testname" value="${entity.testname}" placeholder="王八"/>
                          </div>
                          <label class="col-sm-2 control-label" for="testsex">性别</label>
                          <div class="col-sm-4">
                             <zhg:select codeTp="sex" name="testsex" cls="form-control" def="true" value="${entity.testsex}">

                             </zhg:select>
                          </div>
                       </div>
                       <div class="form-group">
                          <label class="col-sm-2 control-label" for="ds_username">时间</label>
                          <div class="col-sm-8">

                             <input class="form-control" type="date" name="testdate" value="<fmt:formatDate value="${entity.testdate}" pattern="yyyy-MM-dd"></fmt:formatDate>"/>
                          </div>
                       </div>
                    </fieldset>     

                    <fieldset>
                        <div class="form-group">
                        	<label class="col-sm-2 control-label" for="ds_host"></label>
                           	<div class="col-sm-4">
                              	<input type="submit" value="提交" class="btn btn-primary"/>
                           	</div>
                           	<label class="col-sm-2 control-label" for="ds_host"></label>
                           	<div class="col-sm-4">
                              	<input type="reset" value="重置" class="btn btn-danger" id="resetForm"/>
                           	</div>
                        </div>
                    </fieldset>
                </form>
			</div>
		</div>
	</body>
	<script type="text/javascript" src="${path }/static/js/plugins/file-input/fileinput.min.js"></script>
	<script type="text/javascript" src="./js/dictionary.js"></script>
</html>