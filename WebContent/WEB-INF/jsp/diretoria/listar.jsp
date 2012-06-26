<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div>
	<table border="1">
		<thead>
			<tr>
				<td width="5" align="center">ID</td>
				<td width="300" align="center">Descrição</td>
				<td width="100" align="center">Sigla</td>
				<td width="10" align="center">Editar</td>
				<td width="10" align="center">Excluir</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${diretorias}" var="diretoria">
				<tr>
					<td align="center">${diretoria.id}</td>
					<td>${diretoria.descricao}</td>
					<td>${diretoria.sigla}</td>
					<td align="center"><a
						href="<c:url value="/diretoria/editar/${diretoria.id}"/>"><img
							src="<c:url value="/img/grid/editar.png"/>" /></a></td>
					<td align="center"><a
						href="<c:url value="/diretoria/excluir/${diretoria.id}"/>"><img
							src="<c:url value="/img/grid/excluir.png"/>" /></a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>