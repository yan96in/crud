//event 
$('#myModal').on('show.bs.modal', function(e) {
	if (!data)
		return e.preventDefault() // stops modal from being shown
})
// chain programmatic api
$('.btn.danger').button('toggle').addClass('fat');
// modal
$('#myModal').modal();
$('#myModal').modal({
	keyboard : false
}) // initialized with no keyboard
$('#myModal').modal('show') // initializes and invokes show immediately
// asynchronous functions and transitions
$('#myCollapse').on('shown.bs.collapse', function(e) {
	// Action to execute once the collapsible area is expanded
})
//
$('#myCarousel').on('slid.bs.carousel', function(e) {
	$('#myCarousel').carousel('2') // Will slide to the slide 2 as soon as the
	// transition to slide 1 is finished
})

$('#myCarousel').carousel('1') // Will start sliding to the slide 1 and returns
// to the caller
$('#myCarousel').carousel('2') // !! Will be ignored, as the transition to the
// slide 1 is not finished !!
// change the default settings
$.fn.modal.Constructor.Default.keyboard = false // changes default for the modal
// plugin's `keyboard` option to
// false
// handle namespace collision
var bootstrapButton = $.fn.button.noConflict() // return $.fn.button to
												// previously assigned value
$.fn.bootstrapBtn = bootstrapButton // give $().bootstrapBtn the Bootstrap
									// functionality
// get the bootstrap version numbers
$.fn.tooltip.Constructor.VERSION // => "4.0.0"
//

