var nomeElement = document.getElementById('nomeId').value;
var senhaElement = document.getElementById('senhaId').value;

$("#cadastro").click(function(){
	var emailElement = document.getElementById('emailId').value;
	$.post("cadastrar", {
		nome: nomeElement,
		email: emailElement,
		senha: senhaElement
	});
});

$("#login").click(function(){
	$.post("logar", {
		nome: nomeElement,
		senha: senhaElement
	});
});