<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Question" %>
<%
//問題番号
int count = (int)session.getAttribute("count");
Question[] q10 = (Question[]) session.getAttribute("question");
String result = (String) session.getAttribute("result");
String userAns = (String) session.getAttribute("userAns");
String userSelect = (String) session.getAttribute("userSelect");

//Questionから値を取り出し
String cate = q10[count].getCate();
int ans = q10[count].getAns();
String comment = q10[count].getComment();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/answer.css" type="text/css"/>
<title>よん太君の4択（仮）</title>
</head>
<body>
<div id="q-count"><p><%= count %>/10問目</p></div>
<div id="q-cate"><p>カテゴリ：<%= cate %></p></div>

<div class="answer">
	<div id="ans1"><p><%= result %></p></div>
	<div id="ans2"><p><%= ans %></p></div>
	<div id="ans3"><p>（あなたの解答：<%= userAns %>　<%= userSelect %>）</p></div>
</div>

<div class="coout">
	<div class="coin">
		<div id="come1"><h3>解説</h3></div>
		<div id="come2"><p><%= comment %></p></div>
	</div>
</div>

	<div id="im2">
		<img src="photo/4takunh.png" alt="よん太君（仮）"  width="280"  height="300">
		<p>よん太君</p>
	</div>
<div>
	<p><a href="Yontakun/ResultServlet">次へ</a></p>
</div>

</body>
</html>
