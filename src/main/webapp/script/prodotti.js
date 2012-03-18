$(document).ready(function() {
 	fancy();
 	$(".menu a").click(function() {
 		showCategory(this.rel);
 		return false;
 	});
 	
 	if (window.location.hash != null) {
 		showCategory(window.location.hash.substring(1));
 	}
});

function fancy() {
	$("#gallery li a").fancybox();
}


function showCategory(category) {
	
	var galleryEl = $("#gallery");

	var ghtml = "<ul style='position:absolute;left:" + -galleryEl.outerWidth() + "px;' >";
	$($(gallery[category])[0].items).each(function(index, value) {
		ghtml += "<li><a href='" + cpath + value.pathLarge + "'><img src='" + cpath + value.path + "'/></a></li>";
	});
	ghtml += "</ul>";

	
	var el = $('#gallery ul');
	
	galleryEl.prepend(ghtml);
	var newList = $('#gallery ul:first-child');
	
	newList.animate({left: 0}, function() {
		newList.css({position: 'static'})
		galleryEl.html(newList);
		fancy();
	});
	
	el.animate({marginLeft: el.outerWidth()});
	
	$(".menu a.selected").removeClass('selected');
	$(".menu a[rel=" + category + "]").addClass('selected');
	window.location.hash = category;
	
}