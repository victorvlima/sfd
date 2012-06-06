<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
		<link type="text/css" rel="stylesheet" href="css/geral.css"/>
		<title>Sistema de Fluxo de Documentos</title>
	</head>
	<body id="corpo">
		<div id="geral"> <!-- 0 -->
			
    	  	<div id="topo" align="center"><%@ include file="/layout/topo.jsp" %></div> <!-- 1 -->
    	  	<div id="menu" align="center"><%@ include file="/layout/menu.jsp" %></div> <!-- 2 -->
      		
      		<div id="conteudo">
				<div id="esquerda"> <!-- 3 -->
					<div id="info"><%@ include file="/layout/info.jsp" %></div> <!-- 7 -->
				</div>
	
	      		<div id="sub-conteudo" align="center">
	      			<sitemesh:write property='body'/>
	      		</div> <!-- 4 -->
	      		
				<div id="direita"> <!-- 5 -->
					<div id="top-filme"><%@ include file="/layout/topFilme.jsp" %></div> <!-- 8 -->
					<div id="top-usuario"><%@ include file="/layout/topUsuario.jsp" %></div> <!-- 9 -->
				</div>
			</div>
			
	      	<div id="rodape" align="center"><%@ include file="/layout/rodape.jsp" %></div> <!-- 6 -->
    	</div>
	</body>
</html>