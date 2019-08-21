$(document).ready(function() {

	var empDetails = null;

	empDetails = JSON.parse(sessionStorage.getItem("employ"));
	$('#id').val(empDetails.Id);
	$('#employeeid').val(empDetails.EmployeeId);
	$('#firstname').val(empDetails.FirstName);
	$('#lastname').val(empDetails.LastName);
	$('#mail').val(empDetails.Mail);
	$('#fromdate').val(empDetails.FromDate);
	$('#todate').val(empDetails.ToDate);
	$('#totaldays').val(empDetails.TotalDays);
	$('#allottedfromdate').val(empDetails.AllottedFromDate);
	$('#allottedtodate').val(empDetails.AllottedTodate);
	$('#allotteddays').val(empDetails.AllottedDays);
	$('#leavetype').val(empDetails.LeaveType);
	$('#description').val(empDetails.LeaveDescription);
	$('#cc').val(empDetails.CC);
	$('#applieddate').val(empDetails.AppliedDate);

});