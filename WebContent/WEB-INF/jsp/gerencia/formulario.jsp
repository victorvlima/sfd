<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div>
	<form id="formGerencia" action="<c:url value="/gerencia/salvar"/>"
		method="post">
		<table>
			<tr>
				<td>ID:</td>
				<td><input id="gerencia.id" type="text" name="gerencia.id"
					readonly value="${gerencia.id}" /></td>
			</tr>
			<tr>
				<td>Descrição:</td>
				<td><input type="text" name="gerencia.descricao"
					value="${gerencia.descricao}" /></td>
			</tr>
			<tr>
				<td>Sigla:</td>
				<td><input id="gerencia.sigla" type="text"
					name="gerencia.sigla" value="${gerencia.sigla}" /></td>
			</tr>
			<tr>
				<td>Diretoria:</td>
				<td><select name="gerencia.diretoria">
						<c:forEach var="diretoria" items="${diretorias}">
							<option value="${diretoria.id}">${diretoria.sigla}</option>
						</c:forEach>
				</select></td>
<%-- 
				<td><input id="gerencia.diretoria" type="text"
					name="gerencia.diretoria" value="${gerencia.diretoria}" /></td>
 --%>
			</tr>
		</table>
		<input type="submit" value="Salvar" />
	</form>
</div>
