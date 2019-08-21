$(document).ready(function() {
	
	
	/*
	var leftTable=$('table.display').clone(); 
	var rightTable=$('table.display').clone(); 
	var newTable= $('div').append('<table><tr><td>')
	    .append(leftTable).append('</td><td>')
	    .append(rightTable).append('</td></tr></table>')
	    .html(); 
	return newTable;*/
	
	
	$('#attendance').DataTable({
		"ajax" : {
			"url" : 'http://localhost:9999/attendnceapi',
			"type" : "GET",
			"datatype" : "JSON"
		},
		"columns" :
			[ 
				
		{
			"data" : "employee_id"

		}, {
			"data" : "first_name"

		}, {
			"data" : "last_name"

		}, {
			"data" : "check_in_time"

		}, {
			"data" : "check_out_time"

		}, {
			"data" : "totalhours"

		},
		{
			"data" : "extrahours"

		}

		]
	});

});



