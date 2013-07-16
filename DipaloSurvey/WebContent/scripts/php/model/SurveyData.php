<?php 

	class SurveyData {
		
		
		private $canAffordPrivateTuition;
		private $districtName;
		private $examType;
		private $hasComputerAccess;
		private $hasAccessToLibraryFacilities;
		private $haveAccessToMathematicsResources;
		private $haveSmartphone;
		private $province;
		private $schoolHasComputerFacilities;
		private $schoolName;
		private $schoolType;
		private $takeMathAsSubj;
		private $comment;
		private $hasAccessToInternet;
		
		/* default constructor */
		public function __construct(){
		}
		
		public function setCanAffordPrivateTuition($value){
			$this->canAffordPrivateTuition = $value;
		}
		
		public function getCanAffordPrivateTuition(){
			return $this->canAffordPrivateTuition;
		}
		
		public function setDistrictName($value){
			$this->districtName = $value;
		}
		
		public function getDistrictName(){
			return $this->districtName;
		}
		
		public function setExamType($value) {
			$this->examType = $value;
		}
		
		public function getExamType(){
			return $this->examType;
		}
		
		public function setHasComputerAccess($value){
			$this->hasComputerAccess = $value;
		}
		
		public function getHasComputerAccess(){
			return $this->hasComputerAccess;
		}
		
		public function setHasAccessToLibraryFacilities($value){
			$this->hasAccessToLibraryFacilities = $value;
		}
		
		public function getHasAccessToLibraryFacilities(){
			return $this->hasAccessToLibraryFacilities;
		}
		
		public function setHaveAccessToMathematicsResources($value) {
			$this->haveAccessToMathematicsResources = $value;
		}
		
		public function getHaveAccessToMathematicsResources(){
			return $this->haveAccessToMathematicsResources;
		}
		
		public function setHaveSmartphone($value) {
			$this->haveSmartphone = $value;
		}
		
		public function getHaveSmartphone(){
			return $this->haveSmartphone;
		}
		
		public function setProvince($value) {
			$this->province = $value;
		}
		
		public function getProvince(){
			return $this->province;
		}
		
		public function setSchoolHasComputerFacilities($value){
			$this->schoolHasComputerFacilities = $value;
		}
		
		public function getSchoolHasComputerFacilities(){
			return $this->schoolHasComputerFacilities;
		}
		
		public function setSchoolName($value){
			$this->schoolName = $value;
		}
		
		public function getSchoolName(){
			return $this->schoolName;
		}
		
		public function setSchoolType($value){
			$this->schoolType = $value;
		}
		
		public function getSchoolType(){
			return $this->schoolType;
		}
		
		public function setTakeMathAsSubj($value){
			$this->takeMathAsSubj = $value;
		}
		
		public function getTakeMathAsSubj(){
			return $this->takeMathAsSubj;
		}
		
		public function setComment($value){
			$this->comment = $value;
		}
		
		public function getComment(){
			return $this->comment;
		}
		
		public function setHasAccessToInternet($value){
			$this->hasAccessToInternet = $value;
		}
		
		public function getHasAccessToInternet(){
			return $this->hasAccessToInternet;
		}
		
	}
?>
