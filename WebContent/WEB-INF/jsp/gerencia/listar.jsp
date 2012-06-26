<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div>
	<table border="1">
		<thead>
			<tr>
				<td width="5" align="center">ID</td>
				<td width="300" align="center">Descrição</td>
				<td width="100" align="center">Sigla</td>
				<td width="100" align="center">Diretoria</td>
				<td width="10" align="center">Editar</td>
				<td width="10" align="center">Excluir</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="gerencia" items="${gerencias}">
				<tr>
					<td align="center">${gerencia.id}</td>
					<td>${gerencia.descricao}</td>
					<td>${gerencia.sigla}</td>
					<td>${gerencia.diretoria.sigla}</td>
					<td align="center"><a
						href="<c:url value="/gerencia/editar/${gerencia.id}"/>"><img
							src="<c:url value="/img/grid/editar.png"/>" /></a></td>
					<td align="center"><a
						href="<c:url value="/gerencia/excluir/${gerencia.id}"/>"><img
							src="<c:url value="/img/grid/excluir.png"/>" /></a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>