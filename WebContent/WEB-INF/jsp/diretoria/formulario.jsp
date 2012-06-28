<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div>
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
					value="${diretoria.descricao}" /></td>
			</tr>
			<tr>
				<td>Sigla:</td>
				<td><input type="text" name="diretoria.sigla"
					value="${diretoria.sigla}" /></td>
			</tr>
		</table>
		
		<input type="submit" id="salvar">
<!-- 		<button type="submit" id="salvar">Salvar</button>
		<button type="reset" id="reset">Limpar</button>
 -->		
		
		<a href="#">GOOGLES</a>
	</form>
</div>

<script type="text/javascript"
	src="<c:url value="/js/jquery/jquery.js"/>"></script>
<script type="text/javascript"
	src="<c:url value="/js/jquery/jquery.maskedinput-1.1.4.pack.js"/>"></script>
<script type="text/javascript"
	src="<c:url value="/js/jquery/jquery.ui.datepicker-pt-BR.js"/>"></script>
<script type="text/javascript"
	src="<c:url value="/js/jquery/jquery-validate.min.js"/>"></script>
<script type="text/javascript"
	src="<c:url value="/js/jquery/jquery-1.2.6.min.js"/>"></script>

<script type="text/javascript">
	$(document).ready(function() {
		$('#formDiretoria').validate({
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
			errorElement : "input",
			errorPlacement : function(error, element) {
				error.insertBefore(element);
			},
			messages : {
				"diretoria.descricao" : {
					required : "Informe a Descrição da Diretoria.",
					minlength : "Descrição deve conter mais que 5 caracteres."
				},
				"diretoria.sigla" : {
					required : "Informe a Sigla da Diretoria.",
					minlength : "Descrição deve conter mais que 3 caracteres."
				}
			}
		});

		$("#reset").click(function() {
			$("#salvar").hide('slow');
		}, function() {
			$("#salvar").show('fast');
		});

	});
</script>
