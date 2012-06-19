$(document).ready(function() {
	$("#formDocumento").validate({
		rules : {
			// valida o assunto
			"documento.assunto" : {
				required : true
			}
		},
		// Define as mensagens de erro para cada regra
		messages : {
			"documento.assunto" : {
				required : "O campo Assunto é obrigatório..."
			}
		}
	});
});
