<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div>
	<table border="1">
		<thead>
			<tr>
				<td width="50">ID</td>
				<td width="300">Descrição</td>
				<td width="100">Sigla</td>
				<td width="100">Diretoria</td>
				<td width="75">Editar</td>
				<td width="75">Excluir</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="gerencia" items="${gerencias}">
				<tr>
					<td>${gerencia.id}</td>
					<td>${gerencia.descricao}</td>
					<td>${gerencia.sigla}</td>
					<td>${gerencia.diretoria}</td>
					<td><a href="<c:url value="/gerencia/editar/${gerencia.id}"/>">Editar</a>
					</td>
					<td><a href="<c:url value="/gerencia/excluir/${gerencia.id}"/>">Excluir</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>