<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div>
	<table border="1">
		<thead>
			<tr>
				<td width="50">ID</td>
				<td width="50">Número</td>
				<td width="300">Assunto</td>
				<td width="10">Data</td>
				<td width="10">Processo</td>
				<td width="75">Editar</td>
				<td width="75">Excluir</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${documentos}" var="documento">
				<tr>
					<td>${documento.id}</td>
					<td>${documento.numero}</td>
					<td>${documento.assunto}</td>
					<td><fmt:formatDate pattern="dd/MM/yyyy" value="${documento.data}" /></td>
					<td>${documento.processo}</td>
					<td><a href="<c:url value="documento/editar/${documento.id}"/>">Editar</a>
					</td>
					<td><a href="<c:url value="documento/excluir/${documento.id}"/>">Excluir</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>