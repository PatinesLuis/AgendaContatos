/**
 * Confirmação de exclusão de um contato
 */

function confirmar(idcon){
	let resposta = confirm("confirma a exclusão desse contato?")
	
	if(resposta ==true){
		//alert(idcon)
		window.location.href = "delete?idcon=" + idcon // window location serve para fazer um redirecionamento, saia desse documento e va para outro local
	}
}