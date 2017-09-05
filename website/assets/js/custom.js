$(function (){
    $('.week1-title').on('click', function(){
        $('.week1-work').slideToggle();
         if($('.week1-title>i').hasClass('fa-minus-square')){
            $('.week1-title>i').removeClass('fa-minus-square').addClass('fa-plus-square');
        } else {
            $('.week1-title>i').removeClass('fa-plus-square').addClass('fa-minus-square');
        }
    });
    $('p.week1ex1').on('click', function(){
        $('#week1').slideToggle();
        if($('p.week1ex1>i').hasClass('fa-minus-circle')){
            $('p.week1ex1>i').removeClass('fa-minus-circle').addClass('fa-plus-circle');
        } else {
            $('p.week1ex1>i').removeClass('fa-plus-circle').addClass('fa-minus-circle');
        }
        
    });
    $('p.week1ex2').on('click', function(){
        $('#week1ex2-work').slideToggle();
        if($('p.week1ex2>i').hasClass('fa-minus-circle')){
            $('p.week1ex2>i').removeClass('fa-minus-circle').addClass('fa-plus-circle');
        } else {
            $('p.week1ex2>i').removeClass('fa-plus-circle').addClass('fa-minus-circle');
        }
        
    });
});