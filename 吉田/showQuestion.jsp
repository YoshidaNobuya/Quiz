<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.Question"%>
<%
//セッションスコープからインスタンスを取得
int count = (int) session.getAttribute("count");
Question[] q10 = (Question[]) session.getAttribute("q10");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="quiz.css" type="text/css" />
<title>よん太君の4択（仮）</title>
</head>
<body>
	<div id="q-count">
		<p><%=(count+1)%>/10問目
		</p>
	</div>
	<div id="q-cate">
		<p>
			カテゴリ：<%=q10[count].getCategory()%></p>
	</div>

	<div id="q-satement">
		<p><%=q10[count].getQ() %></p>
	</div>

	<div class="anserCheck">
	<%-- 選択によってリクエストパラメータa,b,c,dを仕込んでいる --%>
		<p>
		<div id="choice1"><a href="Yontakun/src/servlet/AnserServlet?userAns=a"><%=q10[count].getSelect0() %></a></div>
		</p>
		<p>
		<div id="choice2"><a href="Yontakun/src/servlet/AnserServlet?userAns=b"><%=q10[count].getSelect1() %></a></div>
		</p>
		<p>
		<div id="choice3"><a href="Yontakun/src/servlet/AnserServlet?userAns=c"><%=q10[count].getSelect2() %></a></div>
		</p>
		<p>
		<div id="choice4"><a href="Yontakun/src/servlet/AnserServlet?userAns=d"><%=q10[count].getSelect3() %></a></div>
		</p>
	</div>

</body>
</html>