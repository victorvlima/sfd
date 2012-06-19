<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div>
	${msg}
	<form id="formDocumento" action="<c:url value="/documento/salvar"/>"
		method="post">
		<table>
			<tr>
				<td><label for="documento.id">ID:</label></td>
				<td><input id="documento.id" type="text" name="documento.id"
					readonly value="${documento.id}" /></td>
			</tr>
			<tr>
				<td>Número:</td>
				<td><input type="text" name="documento.numero"
					value="${documento.numero}" /></td>
			</tr>
			<tr>
				<td><label for="documento.assunto">Assunto:</label></td>
				<td><input id="documento.assunto" type="text"
					name="documento.assunto" value="${documento.assunto}" /></td>
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
				<td>Observação:</td>
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
						<option value="false">NÃO</option>
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
