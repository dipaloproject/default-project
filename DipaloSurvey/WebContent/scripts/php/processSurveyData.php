<?php 
	require_once __DIR__ . '/model/SurveyData.php';
	
	$YES = "yes";
	$NO = "no";
	
	$surveyData = null;
		
	if (isset($_POST['submitSurvey'])) {
	
		$client_ip_address = $_SERVER['REMOTE_ADDR'];
		$client_proxy_address = $_SERVER['HTTP_X_FORWARDED_FOR'];
	
		$surveyData = new SurveyData();
		
		if (isset($_POST['affordPrivateTutor'])){
		
			if ($_POST['affordPrivateTutor'] == $YES)
				$surveyData->setCanAffordPrivateTuition(true);
			else $surveyData->setCanAffordPrivateTuition(false);
		}
		
		if (isset($_POST['districtName'])){
			
			$name = $_POST['districtName'];
			$surveyData->setDistrictName(trim($name));
		}
		
		if (isset($_POST['examType'])) {
			$type = $_POST['examType'];
			$surveyData->setExamType(trim($type));
		}
		
		if (isset($_POST['hasAccessToComputer'])) {
			if ($_POST['hasAccessToComputer'] == $YES)
				$surveyData->setHasComputerAccess(true);
			else $surveyData->setHasComputerAccess(false);
		}
		
		if (isset($_POST['hasAccessToLibraryFacilities'])) {
			if ($_POST['hasAccessToLibraryFacilities'] == $YES)
				$surveyData->setHasAccessToLibraryFacilities(true);
			else $surveyData->setHasAccessToLibraryFacilities(false);
		}
		
		if (isset($_POST['haveAccessToMathematicsResources'])) {
			if ($_POST['haveAccessToMathematicsResources'] == $YES)
				$surveyData->setHaveAccessToMathematicsResources(true);	
			else $surveyData->setHaveAccessToMathematicsResources(false);
			
		}
		
		if (isset($_POST['haveSmartphone'])) {
			if ($_POST['haveSmartphone'] == $YES)
				$surveyData->setHaveSmartphone(true);	
			else $surveyData->setHaveSmartphone(false);
		}
		
		if (isset($_POST['province'])) {
			$province = $_POST['province'];
			$surveyData->setProvince(trim($province));
		}
		
		if (isset($_POST['schoolHasComputerFacilities'])){
			if ($_POST['schoolHasComputerFacilities'] == $YES)
				$surveyData->setSchoolHasComputerFacilities(true);	
			else $surveyData->setSchoolHasComputerFacilities(false);
		}
		
		if (isset($_POST['schoolName'])) {
			$schoolname = $_POST['schoolName'];
			$surveyData->setSchoolName(trim($schoolname));
		}
		
		if (isset($_POST['schoolType'])) {
			$schooltype = $_POST['schoolType'];
			$surveyData->setSchoolType(trim($schooltype));
		}
		
		if (isset($_POST['takeMathAsSubj'])) {
			if ($_POST['takeMathAsSubj'] == $YES)
				$surveyData->setTakeMathAsSubj(true);	
			else $surveyData->setTakeMathAsSubj(false);
		}
		
		if (isset($_POST['whatDoYouDo'])) {
			$comment = $_POST['whatDoYouDo'];
			$surveyData->setComment(trim($comment));
		}
		
		if (isset($_POST['hasAccessToInternet'])){
			if ($_POST['hasAccessToInternet'] == $YES)
				$surveyData->setHasAccessToInternet(true);	
			else $surveyData->setHasAccessToInternet(false);
		}
		
		echo "Thank You for completing the survey. Your participation is highly appreciated.";
	}
	
?>
