function showCategoryOnHash() {
	var category = window.location.hash == '' ? 'complementi-accessori' : window.location.hash.substring(1);
	showCategory(category);
}


$(function(){
  $(window).hashchange( function(){
	  showCategoryOnHash();
  })
});


$(document).ready(function() {
 	fancy();
 	$(".menu a").click(function() {
 		window.location.hash = this.rel;
 		return false;
 	});
 	showCategoryOnHash();
});

function fancy() {
	$("#gallery li a").fancybox();
}


function showCategory(category) {
	var galleryEl = $("#gallery");

	var ghtml = "<ul class='replacing' style='position:absolute;left:" + -galleryEl.outerWidth() + "px;' >";
	$($(gallery[category])[0].items).each(function(index, value) {
		ghtml += "<li><a href='" + cpath + value.pathLarge + "'><img src='" + cpath + value.path + "'/></a></li>";
	});
	ghtml += "</ul>";

	
	var el = $('#gallery ul');
	
	galleryEl.prepend(ghtml);
	var newList = $('#gallery ul:first-child');
	
	newList.animate({left: 0}, function() {
		newList.css({position: 'static'})
		newList.removeClass('replacing');
		galleryEl.html(newList);
		fancy();
	});
	
	el.animate({marginLeft: el.outerWidth()});
	
	$(".menu a.selected").removeClass('selected');
	$(".menu a[rel=" + category + "]").addClass('selected');
	
	if (window.location.hash != '') {
		window.location.hash = category;
	}
	
}