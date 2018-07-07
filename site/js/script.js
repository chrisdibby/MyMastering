/*$(document).ready(function(){       
   var scroll_start = 0;
   var startchange = $('#content');
   var offset = startchange.offset();
   $(document).scroll(function() { 
      scroll_start = $(this).scrollTop();
      if(scroll_start > offset.top) {
          $('#navbar').css('background-color', 'rgba(255, 255, 255, .75)'), $('#navbar').css('box-shadow', '0 3px 23px 7px rgba(255, 255, 255, .75)'), $('#navbar').css('transition', 'all 0.5s ease-in-out');
       } else {
          $('#navbar').css('background-color', 'transparent'), $('#navbar').css('box-shadow', 'none'), $('#navbar').css('transition', 'all 0.3s ease-in-out');
       }
   });
});
*/
    var backgr = document.querySelector("#backgr");
 
    function setTranslate(xPos, yPos, el) {
        el.style.transform = "translate3d(" + xPos + ", " + yPos + "px, 0)";
    }
     
    window.addEventListener("DOMContentLoaded", scrollLoop, false);
 
    var xScrollPosition;
    var yScrollPosition;
 
    function scrollLoop() {
        xScrollPosition = window.scrollX;
        yScrollPosition = window.scrollY;
 
        setTranslate(0, yScrollPosition * -0.2, backgr);
 
        requestAnimationFrame(scrollLoop);
    }