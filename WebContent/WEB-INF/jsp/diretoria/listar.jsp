<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div>
	<table border="1">
		<thead>
			<tr>
				<td width="50">ID</td>
				<td width="300">Descrição</td>
				<td width="100">Sigla</td>
				<td width="75">Editar</td>
				<td width="75">Excluir</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${diretorias}" var="diretoria">
				<tr>
					<td>${diretoria.id}</td>
					<td>${diretoria.descricao}</td>
					<td>${diretoria.sigla}</td>
					<td><a href="<c:url value="/diretoria/editar/${diretoria.id}"/>">Editar</a>
					</td>
					<td><a href="<c:url value="/diretoria/excluir/${diretoria.id}"/>">Excluir</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>