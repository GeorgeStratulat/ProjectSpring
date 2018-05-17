$( document ).ready(function() {
	
	var listTasks = [];

	/**
	 * Using JQuery for hiding some elements in view when bootstrap app
	 */
	// Hide task table when starting
	// we just show it if having any adding-task
	$('#taskTable').hide();
	$('#postTasksBtn').hide();
	
	// Task-Form submit
    $("#taskForm").submit(function(event) {
		// Prevent the form from submitting via the browser.
		event.preventDefault();
		
		// get data from submit form
		var formTask = {
    			taskName : $("#taskName").val(),
    			startTime : new Date($("#startTime").val()),
    			endTime : new Date($("#endTime").val())
    	}
		
		// store task
		listTasks.push(formTask);
		
		// re-render task table by append new task to table
		console.log(formTask);
		var taskRow = '<tr>' +
							'<td>' + listTasks.length + '</td>' +
							'<td>' + formTask.taskName + '</td>' +
							'<td>' + timeFormat(formTask.startTime) + '</td>' +
							'<td>' + timeFormat(formTask.endTime) + '</td>' +
					        '<td class="text-center">' +
					        	'<input type="hidden" value=' + (listTasks.length - 1) + '>' +
					        	'<a>' +
					  				'<span class="glyphicon glyphicon-remove"></span>' +
								'</a>' +
					        '</td>' +
						  '</tr>';

		$('#taskTable tbody').append(taskRow);

		// just how task table and POST button
		$('#taskTable').show();
		$('#postTasksBtn').show();
		
		// Reset FormData after Posting
    	resetData();
	});
    
	// Do DELETE a Task via JQUERY AJAX
	$(document).on("click","a",function() {
		var taskId = $(this).parent().find('input').val();
		$(this).closest("tr").remove()
	});
	
	// POST REQUEST
	$('#postTasksBtn').click(function(){
		ajaxPost();
	});
	
	// GET REQUEST
	$("#getAllTasksBtnId").click(function(event){
		event.preventDefault();
		ajaxGet();
	});

	// DO POST
    function ajaxPost(){
    	$.ajax({
			type : "POST",
			contentType : "application/json",
			accept: 'text/plain',
			url : window.location + "api/logtime/save",
			data : JSON.stringify(listTasks),
			dataType: 'text',
			success : function(result) {
				// clear task body
				$('#taskTable tbody').empty();
				$('#taskTable').hide();
				
				// re-set task table list
				listTasks = [];
				
				// fill successfully message on view
				$("#postResultDiv").html("<p style='background-color:#7FA7B0; color:white; padding:20px 20px 20px 20px'>" + 
											result +
										  "</p>");
			},
			error : function(e) {
				alert("Error!")
				console.log("ERROR: ", e);
			}
		});
    }
    
    // DO GET
 	function ajaxGet(){
 		$.ajax({
 			type : "GET",
 			url : window.location + "api/logtime/all",
 			success: function(result){
 					$('#resultGetAllTaskDiv ul').empty();
 					
 					$.each(result, function(i, task){
 						var strTask = "task: " + task.taskName + 
 						", startTime: " + timeFormat(new Date(task.startTime)) +
 						", endTime: " + timeFormat(new Date(task.endTime));
 						
 						$('#resultGetAllTaskDiv .list-group').append("<li>" + strTask + "</li>");
 			        });
 					
 					// just re-css for result-div
 					$('#resultGetAllTaskDiv').css({'background-color':'#D16953', 'color':'white', 'padding':'20px 20px 5px 30px'});
 					
 					// just hide POST button
 					if($('#taskTable').is(":hidden")){
 						$('#postTasksBtn').hide();	
 					}
 			},
 			error : function(e) {
 				$("#getResultDiv").html("<strong>Error</strong>");
 				console.log("ERROR: ", e);
 			}
 		});
 	}
 	
	/**
	 * format string to display date in view
	 */
	function timeFormat(date){
		if(date instanceof Date){
			var isoDate = date.getFullYear() + '-' + (date.getMonth() + 1) + '-' + date.getDate();
			var time = date.toLocaleString('en-US', { hour: 'numeric',minute:'numeric', hour12: true });
			return isoDate + ' @ ' + time;	
		}else{
			return "";
		}
	}
    
    function resetData(){
    	$("#taskName").val("");
    	$("#startTime").val("");
    	$("#endTime").val("");
    }
})