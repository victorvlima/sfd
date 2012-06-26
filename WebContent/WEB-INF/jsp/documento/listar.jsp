<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div>
	<table border="1">
		<thead>
			<tr>
				<td width="5" align="center">ID</td>
				<td width="50">Número</td>
				<td width="300">Assunto</td>
				<td width="10">Data</td>
				<td width="10" align="center">Processo</td>
				<td width="10" align="center">Editar</td>
				<td width="10" align="center">Excluir</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${documentos}" var="documento">
				<tr>
					<td align="center">${documento.id}</td>
					<td>${documento.numero}</td>
					<td>${documento.assunto}</td>
					<td align="center"><fmt:formatDate pattern="dd/MM/yyyy" value="${documento.data}" /></td>
					<td align="center">${documento.processo}</td>
					<td align="center"><a
						href="<c:url value="/documento/editar/${documento.id}"/>"><img
							src="<c:url value="/img/grid/editar.png"/>" /></a></td>
					<td align="center"><a
						href="<c:url value="/documento/excluir/${documento.id}"/>"><img
							src="<c:url value="/img/grid/excluir.png"/>" /></a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>