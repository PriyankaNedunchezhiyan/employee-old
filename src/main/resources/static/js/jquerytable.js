$(document).ready(
		function() {
			$("#example").on(
					"click",
					".rowedit",
					function() {
						var $row = $(this).closest("tr");

						var objRid = $(this).attr("id");
						var id = $(this).closest('tr').find('.id').text();
						var employee_id = $(this).closest('tr').find('.employeeid').text();
						var firstname = $(this).closest('tr').find('.firstname').text();
						var lastname = $(this).closest('tr').find('.lastname').text();
						var date_of_joining = $(this).closest('tr').find('.date_of_joining').text();
						var designation = $(this).closest('tr').find('.designation').text();
						var mobile = $(this).closest('tr').find('.mobile').text();
						var personal_mail = $(this).closest('tr').find('.personal_mail').text();
						var company_mail = $(this).closest('tr').find('.company_mail').text();
						var address = $(this).closest('tr').find('.address').text();
						var dob = $(this).closest('tr').find('.dob').text();
						var status = $(this).closest('tr').find('.status').text();
						var empvalues = {
							"Id" : id,

							"EmployeeId" : employee_id,
							"FirstName" : firstname,
							"LastName" : lastname,
							"DateOfJoining" : date_of_joining,
							"Designation" : designation,
							"Mobile" : mobile,
							"PersonalMail" : personal_mail,
							"CompanyMail" : company_mail,
							"Address" : address,
							"Dob" : dob,
							"Status" : status
						}
						sessionStorage.setItem("employ", JSON
								.stringify(empvalues));
						window.location.href = "/editpopup";

					});

			$('#example').DataTable({
				"ajax" : {
					"url" : 'http://localhost:9999/admin_employeeapi',
					"type" : "GET",
					"datatype" : "JSON"
				},
				"columns" : [ {
					"data" : "id",
					className : 'id'
				}, {
					"data" : "employee_id",
					className : 'employeeid'
				}, {
					"data" : "firstname",
					className : 'firstname'
				}, {
					"data" : "lastname",
					className : 'lastname'
				}, {
					"data" : "date_of_joining",
					className : 'date_of_joining'
				}, {
					"data" : "designation",
					className : 'designation'
				}, {
					"data" : "mobile",
					className : 'mobile'
				}, {
					"data" : "personal_mail",
					className : 'personal_mail'
				}, {
					"data" : "company_mail",
					className : 'company_mail'
				},{
					"data" : "dob",
					className : 'dob'
				}, {
					"data" : "address",
					className : 'address'
				},  {
					"data" : "status",
					className : 'status'
				}, {
					"data" : "OrderLoc",
					render : function() {
						return '<i class="fa fa-pencil rowedit"  ></i>'
					}
				}

				]
			});

		});
