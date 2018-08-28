$(function(){
	$('.sl').slick({
		dots:false,
		arrows: false,
		autoplay: true,
		asNavFor: '.sl2'
	});

	$('.sl2').slick({
		dots:false,
		centerMode: true,
  centerPadding: '60px',
  slidesToShow: 3,
  focusOnSelect: true,
  asNavFor: '.sl',
  arrows: false
	});

	$('.comments-slider').slick({
  slidesToShow: 3,
  slidesToScroll: 1,
  autoplay: true,
  autoplaySpeed: 4000,
  adaptiveHeight: true,
  focusOnSelect: true,
  centerMode: true,
  centerPadding: '0px',
  prevArrow: '<img src="../img/comments/arrow-left.png" class="arrow-img arrow-img_prev">',
  nextArrow: '<img src="../img/comments/arrow-right.png" class="arrow-img arrow-img_next">',
  responsive: [
    {
      breakpoint: 1024,
      settings: {
        arrows: false,
        slidesToShow: 2
      }
    },
    {
      breakpoint: 780,
      settings: {
        arrows: false,
        slidesToShow: 1
      }
    }
  ]
});

  var mobile_nav = $('.mobile-nav')
  var menu = $('.header-mobile-nav') 
  var menu_link =$('.header-mobile-nav a')

  mobile_nav.click(function(){
    $('html,body').animate({
      scrollTop: 0
    }, 3000);
    mobile_nav.toggleClass('mobile-nav_active');
    menu.toggleClass('header-mobile-nav_active');
  });
  menu_link.click(function(){
    mobile_nav.toggleClass('mobile-nav_active');
    menu.toggleClass('header-mobile-nav_active');
  });



  $('.com').on('click',function(e){
    $('html,body').stop().animate({scrollTop: $('#comments').offset().top}, 3000);
    e.preventDefault();
  });
  $('.ab').on('click',function(e){
    $('html,body').stop().animate({scrollTop: $('#main').offset().top}, 3000);
    e.preventDefault();
  });
  $('.fea').on('click',function(e){
    $('html,body').stop().animate({scrollTop: $('#features').offset().top}, 3000);
    e.preventDefault();
  });
  $('.pro').on('click',function(e){
    $('html,body').stop().animate({scrollTop: $('#products').offset().top}, 3000);
    e.preventDefault();
  });
  $('.off').on('click',function(e){
    $('html,body').stop().animate({scrollTop: $('#offer').offset().top}, 3000);
    e.preventDefault();
  });
  $('.mai').on('click',function(e){
    $('html,body').stop().animate({scrollTop: $('#mainSlider').offset().top}, 3000);
    e.preventDefault();
  });

  $('.cli').on('click',function(e){
    $('html,body').stop().animate({scrollTop: $('#clients').offset().top}, 3000);
    e.preventDefault();
  });
})