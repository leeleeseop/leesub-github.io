document.addEventListener("DOMContentLoaded", function() {
  var images = document.querySelectorAll("img");

  images.forEach(function(image) {
    image.addEventListener("dblclick", function() {
      image.classList.toggle("enlarged");
    });
  });
});
