$(document).ready(function() {
	/* empDetails = JSON.parse(sessionStorage.getItem("employ")); */
	$('#btnsave').click(function() {

		$.ajax({

			url: 'http://localhost:9999/addapi',

			data : {
				
					
				employee_id : $('#emp_id').val(),

				firstname : $('#first_name').val(),

				lastname : $('#last_name').val(),

				designation : $('#designation').val(),

				date_of_joining : $('#dateofjoin').val(),

				mobile : $('#mobile_no').val(),

				company_mail : $('#company_mail').val(),

				personal_mail : $('#personal_mail').val(),

				dob:$('#dob').val(),

				address : $('#address').val(),
			
				status : $('#status').val()
			},

			type : "GET",
			success : function(data) {
				if (data) {
					/*window.location.replace("/admin_employee");*/
					
				}
			},
			error : function(data) {
				window.location.replace("/pages-master-setting");
		
			}

		});
		
	});
});
