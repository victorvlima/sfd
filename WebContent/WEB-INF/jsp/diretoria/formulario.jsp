<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div>
	<form id="formDiretoria" action="<c:url value="/diretoria/salvar"/>"
		method="post">
		<table>
			<tr>
				<td>ID:</td>
				<td><input id="diretoria.id" type="text" name="diretoria.id"
					readonly value="${diretoria.id}" /></td>
			</tr>
			<tr>
				<td>Descrição:</td>
				<td><input type="text" name="diretoria.descricao"
					value="${diretoria.descricao}" /></td>
			</tr>
			<tr>
				<td>Sigla:</td>
				<td><input id="diretoria.sigla" type="text"
					name="diretoria.sigla" value="${diretoria.sigla}" /></td>
			</tr>
		</table>
		<input type="submit" value="Salvar" />
	</form>
</div>
