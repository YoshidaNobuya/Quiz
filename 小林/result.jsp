<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Question" %>
<%
Question[] q10 = (Question[]) session.getAttribute("question");
int seikai = (int) session.getAttribute("seikai");

String cate = q10[0].getCate();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/result.css" type="text/css"/>
<title>よん太君の4択（仮）</title>
</head>
<body>
<div id="q-cate"><p>カテゴリ：<%= cate %></p></div>

<div class="total">
	<div id="t1"><h2>～最終結果～</h2></div>
	<div id="t2"><p>10問中　<%= seikai %>問正解！</p></div>
<% if(seikai >= 7) { %>
	<div id="t3"><p>合格！</p></div>
<% } else { %>
	<div id="t3"><p>不合格...</p></div>
<% } %>
</div>

<div class="tcome">
	<div class="tcoin">
		<div id="tcome1"><p>コメント</p></div>
		<div id="tcome2"><p>～よん太君からのありがたいお言葉～</p></div>
	</div>
	<div id="im3"><img src="4takunh.png" alt="よん太君（仮）"  width="280"  height="300">
	<p>よん太君<p>
	</div>
</div>

<div id="topb">
	<p><a href="Yontakun/index.html">TOPへ</a></p>
</div>

</body>
</html>