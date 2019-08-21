$(document).ready(function() {
	/* empDetails = JSON.parse(sessionStorage.getItem("employ")); */
	$('#submit').click(function() {

		$.ajax({

			url: 'http://localhost:9999/popupapi',

			data : {
				
				id:$('#id').val(), 
					
				employee_id : $('#empid').val(),

				firstname : $('#firstname').val(),

				lastname : $('#lastname').val(),

				designation : $('#designation').val(),

				date_of_joining : $('#date').val(),

				mobile : $('#mobile').val(),

				company_mail : $('#companymail').val(),

				personal_mail : $('#personalmail').val(),
				
				dob : $('#dob').val(),

				address : $('#address').val(),
				
				status : $('#status').val()
			},

			type : "POST",
			success : function(data) {
				if (data) {
					
					
				}
			},
			error : function(data) {
				
				window.location.replace("/pages-master-setting");
			}

		});

	});
});
