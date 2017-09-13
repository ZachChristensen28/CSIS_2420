$(function() {
  $('.week1-title').on('click', function() {
    $('.week1-work').slideToggle();
    if ($('.week1-title>i').hasClass('fa-minus-square')) {
      $('.week1-title>i').removeClass('fa-minus-square').addClass('fa-plus-square');
    } else {
      $('.week1-title>i').removeClass('fa-plus-square').addClass('fa-minus-square');
    }
  });
  /*
   *
   * Slide toggle function
   * @param String
   * @param String
   *
   */
  $.slideThisShit = function(newId, newClass) {
    var c = 'p.' + newClass + '>i';
    var id = "#" + newId;
    $(id).slideToggle();
    if ($(c).hasClass('fa-minus-circle')) {
      $(c).removeClass('fa-minus-circle').addClass('fa-plus-circle');
    } else {
      $(c).removeClass('fa-plus-circle').addClass('fa-minus-circle');
    }
  };

  $('p.week1ex1').on('click', function() {
    var id = 'week1';
    var c = 'week1ex1';
    $.slideThisShit(id, c);

  });

  $('p.week1ex2').on('click', function() {
    var id = 'week1ex2-work';
    var c = 'week1ex2';
    $.slideThisShit(id, c);

  });

  $('p.week1ex3').on('click', function() {
    var id = 'week1ex3-work';
    var c = 'week1ex3';
    $.slideThisShit(id, c);

  });
});
