$(document).ready(function() {

	var empDetails = null;

	empDetails = JSON.parse(sessionStorage.getItem("employ"));
	$('#id').val(empDetails.Id);
	$('#empid').val(empDetails.EmployeeId);
	
	$('#firstname').val(empDetails.FirstName);
	$('#lastname').val(empDetails.LastName);
	$('#date').val(empDetails.DateOfJoining);
	$('#designation').val(empDetails.Designation);
	$('#mobile').val(empDetails.Mobile);
	$('#personalmail').val(empDetails.PersonalMail);
	$('#companymail').val(empDetails.CompanyMail);
	$('#dob').val(empDetails.Dob);
	$('#address').val(empDetails.Address);
	$('#status').val(empDetails.Status);

});
