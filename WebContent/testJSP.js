/**
 * 
 */

function isNumeric(number, idField) {
	if (isNaN(number)) {
		campo = document.getElementById(idField);

		campo.value = '';
		campo.focus();

		var nome = campo.title;

		alert('Número inválido, o campo ' + nome
				+ ' deve ser numérico,\nno formato americano.'
				+ '\nUtilize (.) ponto no lugar da (,) virgula.');
		return false;
	} else {
		return true;
	}
}

function resizeIframe(obj) {
	obj.style.height = 0;
	var bodySize = obj.contentWindow.document.body.scrollHeight;
	bodySize += 50;
	obj.style.height = bodySize + 'px';
}

function validateForm(formId) {
	/**
	 * Valida qualquer formulário com campos do tipo 'text', 'password' ou
	 * 'select'. Não estão implementadas validações para 'checkbok' e 'radio'.
	 * Para tornar um campo obrigatório adicione a string 'req' como prefixo da
	 * propriedade 'name'.
	 */

	/** variables */
	var fieldName = '';
	var fieldValue = '';
	var fieldTitle = '';
	var str = '';
	var state = true;
	var form = document.getElementById(formId);

	for (i = 0; i < form.elements.length; i++) {

		fieldName = form.elements[i].name;
		if (fieldName.substring(3, 0) == 'req') {

			fieldValue = form.elements[i].value;
			fieldTitle = form.elements[i].title;

			if (fieldValue == '' || fieldValue == null) {
				str += 'O campo ';
				str += fieldTitle;
				str += ' deve ser preenchido!\n';
				state = false;
			}
		}
	}
	if (!state) {
		alert(str);
	}
	return state;
}

function goBack() {
	window.history.back();
}