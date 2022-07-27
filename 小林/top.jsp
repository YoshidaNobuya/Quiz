<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/top.css" type="text/css"/>
<title>4択クイズ</title>
</head>
<body>
<h1 >ようこそ4択クイズへ</h1>
<div id="ru-ru">
	<h2>ルール説明</h2>
	<p>・ルールを記載…<br>例）・最初に問題カテゴリを選んでください。<br></p>
</div>
<div id="buttonblock">
<div id="startbutton"><p><a href="Yontakun/ShowQuestion?cate=1">Java</a></p></div>
<div id="startbutton"><p><a href="Yontakun/ShowQuestion?cate=2">ドキュメントと管理ツール</a></p></div>
<div id="startbutton"><p><a href="Yontakun/ShowQuestion?cate=3">VBA</a></p></div>
</div>
<div id="buttonblock">
<div id="startbutton"><p><a href="Yontakun/ShowQuestion?cate=4">データベース</a></p></div>
<div id="startbutton"><p><a href="Yontakun/ShowQuestion?cate=5">Webプログラミング</a></p></div>
<div id="startbutton"><p><a href="Yontakun/ShowQuestion?cate=6">サーバーサイドJava</a></p></div>
</div>
<div id="buttonblock">
<div id="startbutton"><p><a href="Yontakun/ShowQuestion?cate=7">???</a></p></div>
</div>
</body>
</html>