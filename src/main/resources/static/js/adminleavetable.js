$(document).ready(
			function() {
				$("#leavemanage").on(
						"click",
						".rowedit",
						function() {
							var $row = $(this).closest("tr");

							 
							var id = $(this).closest('tr').find('.id').text();
							var employee_id = $(this).closest('tr').find('.employeeid').text();
							var firstname = $(this).closest('tr').find('.firstname').text();
							var lastname = $(this).closest('tr').find('.lastname').text();
							var mail = $(this).closest('tr').find('.mail').text();
							var from_date = $(this).closest('tr').find('.fromdate').text();
							var to_date = $(this).closest('tr').find('.todate').text();
							var total_days = $(this).closest('tr').find('.totaldays').text();
							var allotted_from_date = $(this).closest('tr').find('.allottedfromdate').text();
							var allotted_to_date = $(this).closest('tr').find('.allottedtodate').text();
							var allotted_days = $(this).closest('tr').find('.allotteddays').text();
							var leavetype = $(this).closest('tr').find('.leavetype').text();
							var leave_description = $(this).closest('tr').find('.leavedescription').text();
							var cc = $(this).closest('tr').find('.cc').text();
				            var applieddate = $(this).closest('tr').find('.applieddate').text();
							
							var empvalues={
									
									"Id":id,
									"EmployeeId" : employee_id,
									"FirstName" : firstname,
									"LastName" : lastname,
									"Mail" : mail,
									"FromDate" : from_date,
									"ToDate" : to_date,
									"TotalDays" : total_days,
									"AllottedFromDate" : allotted_from_date,
									"AllottedTodate" : allotted_to_date,
									"AllottedDays" : allotted_days,
									"LeaveType" : leavetype,
									"LeaveDescription" : leave_description,
									"CC" : cc,
				                    "AppliedDate": applieddate,
									
							
							}
							sessionStorage.setItem("employ", JSON
									.stringify(empvalues));
							window.location.href = "/leavepopup";

						});
				
				
				
				
				

				$('#leavemanage').DataTable({
					"ajax" : {
						"url" : 'http://localhost:9999/leavemanagementapi',
						"type" : "GET",
						"datatype" : "JSON"
					},
					"columns":[
						
						{
							"data":"id",
							className:'id'
						},
						
						{
							"data":"employee_id",
								className:'employeeid'
						},
						{
							"data" : "firstname",
								className:'firstname'
						}, 
						{
							"data" : "lastname",
								className:'lastname'
						},
						
						 {
							"data" : "mail",
								className:'mail'
						},
						{
							"data" : "from_date",
								className:'fromdate'
						}, 
						{
							"data" : "to_date",
								className:'todate'
						},
						{
							"data" : "total_days",
								className:'totaldays'
						},
						{
							"data" : "allotted_from_date",
								className:'allottedfromdate'
						}, 
						{
							"data" : "allotted_to_date",
								className:'allottedtodate'
						}, 
						{
							"data" : "allotted_days",
								className:'allotteddays'
						},
						{
							"data" : "leavetype",
								className:'leavetype'
						}, 
						{
							"data" : "leave_description",
								className:'leavedescription'
						}, 
						{
							"data" : "cc",
								className:'cc'
						},
						{
							"data" : "applieddate",
								className:'applieddate'
						},
						 
				
						{
							"data" : "OrderLoc",
							render : function() {
								return '<i class="fa fa-th-list rowedit"  aria-hidden="true" ></i>'
							}
						}
						
					]
				});
			
			});






