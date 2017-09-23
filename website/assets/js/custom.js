$(function() {
  /**
   * Title slide toggle
   */
  $('h2').on('click', function() {
    var title = $(this).children();
    var work = $(this).next();

    $(work).slideToggle();
    if ($(title).hasClass('fa-minus-square')) {
      $(title).removeClass('fa-minus-square').addClass('fa-plus-square');
    } else {
      $(title).removeClass('fa-plus-square').addClass('fa-minus-square');
    }
  });
  /**
   * Weekly work slide toggle
   */
  $('p').on('click', function() {
    var className = $(this).children();
    var slide = $(this).next();

    $(slide).slideToggle();
    if ($(className).hasClass('fa-minus-circle')) {
      $(className).removeClass('fa-minus-circle').addClass('fa-plus-circle');
    } else {
      $(className).removeClass('fa-plus-circle').addClass('fa-minus-circle');
    }
  });
});
