$(document).ready(function(){
	$('#approve').click(function(){
		
		$.ajax({
			
			url:'http://localhost:9999/leaveapproveapi',
	

			data:{
				id: $('#id').val(),
				
				employee_id : $('#employeeid').val(),
				
				firstname : $('#firstname').val(),

				lastname : $('#lastname').val(),

				mail : $('#mail').val(),

				from_date : $('#fromdate').val(),

				to_date : $('#todate').val(),

				total_days : $('#totaldays').val(),

				allotted_from_date : $('#allottedfromdate').val(),

				allotted_to_date : $('#allottedtodate').val(),
				
				allotted_days : $('#allotteddays').val(),

				leavetype : $('#leavetype').val(),

				leave_description : $('#description').val(),

				cc : $('#cc').val(),
				
				applieddate:$("#applieddate").val()

				
				
			},
			type:"GET",
			ssuccess : function(data){
				
				if(data){
					/*window.location.href = "/leavemanagement";*/
				}
			},
			error : function(data){
				window.location.replace("/pages-leavemanagement");

			}
		
			
			
			
		});
		
		
		
		
	});
	
	
	
	
	
});
