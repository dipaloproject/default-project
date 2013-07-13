var MESSAGE_BOX_ID = "messageBox";
var MESSAGE_BOX_TITLE_ID = "messageBoxTitle";
var MESSAGE_BOX_TEXT_ID = "messageBoxText";

var hasErrors = false;

function initialise(){
	var form = document.getElementById("surveyForm");
	
	//set the optional fields
	form.whatDoYouDo.optional = true;
	form.districtName.optional = true;
	
}

//Opens the custom message box
function showMessageBox(title, message) {
	var messageBox = document.getElementById(MESSAGE_BOX_ID);
	if (messageBox == null) return;
	
	var titleElement = document.getElementById(MESSAGE_BOX_TITLE_ID);
	if (titleElement != null)
		titleElement.innerHTML = title;
	
	var textElement = document.getElementById(MESSAGE_BOX_TEXT_ID);
	if (textElement != null)
		textElement.innerHTML = message;
	
	messageBox.style.visibility = "visible";
}

//closes the custom message box
function closeMessageBox(){
	var messageBox = document.getElementById(MESSAGE_BOX_ID);
	if (messageBox == null) return;
	
	var titleElement = document.getElementById(MESSAGE_BOX_TITLE_ID);
	if (titleElement != null)
		titleElement.innerHTML = "";
	
	var textElement = document.getElementById(MESSAGE_BOX_TEXT_ID);
	if (textElement != null)
		textElement.innerHTML = "";
	
	messageBox.style.visibility = "hidden";
}

//verifies if all the mandatory fields are filled out before submission
function verifyFormData(form) {
	
	if (hasErrors) hasErrors = false;
	
	if (form == null) return false;
	
	var elements = form.elements;
	if (elements.length == 0) return false;
	
	for (var i = 0; i < elements.length; i++){
		var element = elements[i];
		
		//  checking text boxes 
		if (element.tagName == "INPUT" && element.type && element.type == "text" && !element.optional) {
			
			if (element.value == null || element.value.trim() == ""){
				
				hasErrors = true;
				var error = document.getElementById(element.name);
				error.style.display = "block";
			}
			
			else {
				var error = document.getElementById(element.name);
				error.style.display = "none";
			}
		}
		
		//  checking radio buttons
		if (element.tagName == "INPUT" && element.type && element.type == "radio" && !element.optional) {
			
			var elementName = element.name;
			var radioGroup = document.getElementsByName(elementName);
			
			if (radioGroup[0].checked == false && radioGroup[1].checked == false) {
				
				hasErrors = true;
				var error = document.getElementById(elementName);
				error.style.display = "block";
			}
			
			else {
				var error = document.getElementById(elementName);
				if (error != null)
					error.style.display = "none";
			}
		}
		
	//   checking text areas
		if (element.tagName == "TEXTAREA" && !element.optional) {
			if (element.value == null || element.value.trim() == ""){
				
				hasErrors = true;
				var error = document.getElementById(element.name);
				if (error != null)
					error.style.display = "block";
			}
			
			else {
				var error = document.getElementById(element.name);
				if (error != null)
					error.style.display = "none";
			}
		}
		
		//  checking the drop down or select
		if (element.tagName == "SELECT" && !element.optional) {
			if (element.value == null || element.value.trim() == ""){
				
				hasErrors = true;
				var error = document.getElementById(element.name);
				if (error != null)
					error.style.display = "block";
			}
			
			else {
				var error = document.getElementById(element.name);
				if (error != null)
					error.style.display = "none";
			}
		}
	}
	
	
	
	if (hasErrors == true){
		var title = "Fix Errors Before Continuing";
		var message = "Oops, looks like you did not fill out the required fields, please go back to " +
		              "the survey and fill them up.";
		showMessageBox(title, message);
		return false;
	}
	
	else return true;
}

function clearForm() {
	
	var form = document.getElementById("surveyForm");
	var elements = form.elements;
	if (elements.length > 0) {
		
		for (var i = 0; i < elements.length; i++){
			
			var element = elements[i];
			
			if (element.tagName == "INPUT" && element.type == "text")
				element.value = "";
			
			if (element.tagName == "INPUT" && element.type == "radio")
				element.checked = false;
			
			if (element.tagName == "TEXTAREA") 
				element.value = "";
		}
		
		var title = "CLEARANCE DONE";
		var message = "All your survey data has been cleared.";
		showMessageBox(title, message);
	}
}