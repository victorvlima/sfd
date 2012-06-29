<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
<script type="text/javascript">
	$(document).ready(function() {
		$("#hide").click(function() {
			$("#p1").hide('slow');
		});
		$("#show").click(function() {
			$("#p1").show('fast');
		});

		$("#formDiretoria").validate({
			rules : {
				"diretoria.descricao" : {
					required : true,
					minlength : 5
				},
				"diretoria.sigla" : {
					required : true,
					minlength : 3
				}
			},
			messages : {
				"diretoria.descricao" : {
					required : "Informe a Descrição da Diretoria.",
					minlength : "Descrição deve conter no mínimo 5 caracteres."
				},
				"diretoria.sigla" : {
					required : "Informe a Sigla da Diretoria.",
					minlength : "Descrição deve conter no mínimo 3 caracteres."
				}
			}
		});
	});
</script>
</head>
<body>
	<div id="divFormDiretoria">
		<form id="formDiretoria" action="<c:url value="/diretoria/salvar"/>"
			method="post">
			<table>
				<tr>
					<td>ID:</td>
					<td><input type="text" name="diretoria.id" readonly
						value="${diretoria.id}" /></td>
				</tr>
				<tr>
					<td>Descrição:</td>
					<td><input type="text" name="diretoria.descricao"
						id="diretoria.descricao" value="${diretoria.descricao}" /></td>
				</tr>
				<tr>
					<td>Sigla:</td>
					<td><input type="text" name="diretoria.sigla"
						value="${diretoria.sigla}" /></td>
				</tr>
			</table>
			<table>
				<tr>
					<td><input type="submit" id="submit" value="Salvar" /></td>
					<td><input type="reset" id="reset" value="Limpar" /></td>
					<td><a href="#" id="hide">HIDE</a></td>
					<td><a href="#" id="show">SHOW</a></td>
					<td><p id="p1">P1 - GOOGLES</p>
						<p id="p2">P2 - GOOGLES</p></td>
				</tr>
			</table>
		</form>
	</div>
</body>
