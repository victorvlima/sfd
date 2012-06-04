<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Sistema de Fluxo de Documentos - WEB</title>
		<link type="text/css" rel="stylesheet" href="<c:url value='css/geral.css'/>"/>
	    <link type="image/x-icon" rel="shortcut icon" href="img/layout/favicon.ico"/>
		<sitemesh:write property='head'/>
	</head>
	<body id="corpo">
		<div id="geral"> <!-- 0 -->
		 	
			<div id="topo"><%@ include file="/layout/topo.jsp" %></div> <!-- 1 -->
			<div id="menu"><%@ include file="/layout/menu.jsp" %></div> <!-- 2 -->
			
			<div id="conteudo">
				<div id="esquerda"> <!-- 3 -->
					<div id="info"><%@ include file="/layout/info.jsp" %></div> <!-- 7 -->
				</div>
				
				<div id="sub-conteudo"><sitemesh:write property='body'/></div> <!-- 4 -->
					 
				<div id="direita"> <!-- 5 -->
					<div id="top-filme"><%@ include file="/layout/topFilme.jsp" %></div> <!-- 8 -->
					<div id="top-usuario"><%@ include file="/layout/topUsuario.jsp" %></div> <!-- 9 -->
				</div>
			</div>
				
			<div id="rodape"><%@ include file="/layout/rodape.jsp" %></div> <!-- 6 -->
		</div>
	</body>
</html>