/**
 * 
 */
$(document).ready(
		function(){
			$.ajax('http://localhost:8080/FitnessTracker/placeItems.json',{//?
				type:'GET',
				dataType: 'json',
				success: function(result){
					console.log(result);
				var elements = $.map(result, function(place, index){
					var listItem = $('<li></li>');
					listItem.append(place.name+ " : "+place.address);
					return listItem;
																});
				$('#main').empty();
				$('#main').html(elements);
								},
				error: function(){console.log("encountered error");}				
			, contentType: 'application/json'
			
			}); 
			$('form').on('submit',  function(event){
			event.preventDefault();
				var form = $(this);
				$.ajax('http://localhost:8080/FitnessTracker/place.html',{
					type:'POST',
					data: form.serialize(),
					success: function(result){
						console.log("ajax post");
						var data = $('#submitted').find('p').data('address');
						$('#submitted').html(data);
						console.log(data);
					}
				})
			});
		});