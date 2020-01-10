<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h3>
	Ajax 간단한 문자열 전송 예  
</h3>
<p><input type="text" id="indata"></p>
<p><button onclick="goAjax()">전송</button>
<p><button onclick="goAjaxRest()">REST전송</button>
<p>일반 Controller 사용 : <span id="outdata"></p>
<p>RestController 사용 : <span id="outdatarest"></p>
</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript">
function goAjax(){
	var indata = $('#indata').val();
	console.log(indata);
	var objdata = {"data":indata};
	console.log(objdata);
	
	$.ajax({
		url: "dataproc",
		type: "get",
		data: objdata,
		success: function(data){
			console.log(data);
			$('#outdata').html(data);
		},
		error: function(error){
			console.log(error);
		}
	});
}

function goAjaxRest(){
	var indata = $('#indata').val();
	console.log(indata);
	var objdata = {"data":indata};
	console.log(objdata);
	
	$.ajax({
		url: "dataprocrest",
		type: "get",
		data: objdata,
		success: function(data){
			console.log(data);
			$('#outdatarest').html(data);
		},
		error: function(error){
			console.log(error);
		}
	});
}
</script>
</html>
