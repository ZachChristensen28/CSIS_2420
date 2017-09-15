$(function() {
  /**
   * Title slide toggle
   * @param  {String} title class of h tag
   * @param  {String} work  class of div
   */
  $.titleSlide = function(title, work) {
    var t = title + '>i';
    var w = work;

    $(w).slideToggle();
    if ($(t).hasClass('fa-minus-square')) {
      $(t).removeClass('fa-minus-square').addClass('fa-plus-square');
    } else {
      $(t).removeClass('fa-plus-square').addClass('fa-minus-square');
    }
  };

  /**
   * Week 1 slideToggle
   */
  $('.week1-title').on('click', function() {
    var title = '.week1-title';
    var work = '.week1-work';
    $.titleSlide(title, work);
  });

  /**
   * Week2 slideToggle
   */
  $('.week2-title').on('click', function() {
    var title = '.week2-title';
    var work = '.week2-work';
    $.titleSlide(title, work);
  });

  /**
   * Slide toggle function
   * @param {String}
   * @param {String}
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
