<head>
<link href="http://k2cloud.net/vraptor/common/css/validation.css"
	rel="stylesheet" type="text/css" media="all">
<script src="http://k2cloud.net/vraptor/common/js/jquery-1.4.4.min.js"
	type="text/javascript"></script>
<script
	src="http://k2cloud.net/vraptor/common/js/jquery.vraptor.validate.js"
	type="text/javascript"></script>
</head>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div id="errors">
	<ul>
		<c:forEach var="error" items="${errors.iterator}">
			<li><fmt:message key="${error.key}" /></li>
		</c:forEach>
	</ul>
</div>
<div>
	${msg}
	<form action="<c:url value="/documento/salvar"/>" method="post">
		<table>
			<tr>
				<td>ID:</td>
				<td><input type="text" name="documento.id" readonly
					value="${documento.id}" /></td>
			</tr>
			<tr>
				<td>N�mero:</td>
				<td><input type="text" name="documento.numero"
					value="${documento.numero}" /></td>
			</tr>
			<tr>
				<td>Assunto:</td>
				<td><input type="text" name="documento.assunto"
					value="${documento.assunto}" /></td>
			</tr>
			<tr>
				<td>Interessado:</td>
				<td><input type="text" name="documento.interessado"
					value="${documento.interessado}" /></td>
			</tr>
			<tr>
				<td>SPU:</td>
				<td><input type="text" name="documento.spu"
					value="${documento.spu}" /></td>
			</tr>
			<tr>
				<td>Observa��o:</td>
				<td><input type="text" name="documento.observacao"
					value="${documento.observacao}" /></td>
			</tr>
			<tr>
				<td>Processo:</td>
				<td><select name="documento.processo">
						<option value="true"
							<c:if test="${documento.processo eq true}">
								selected  
	    			        </c:if>>SIM</option>
						<option value="false">N�O</option>
				</select></td>
			</tr>
			<tr>
				<td>Data:</td>
				<td><input type="text" name="documento.data"
					value="${documento.data}" /></td>
			</tr>
		</table>
		<input type="submit" value="Salvar" />
	</form>
</div>
