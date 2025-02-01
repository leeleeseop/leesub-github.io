<script type="text/javascript">
  document.addEventListener("DOMContentLoaded", function () {
      const images = document.querySelectorAll(".zoomable");
      const modal = document.getElementById("imageModal");
      const modalImg = document.getElementById("modalImg");
    images.forEach(img => {
      img.addEventListener("dbclick", function () {
        modalImag.src = this.src;
        modal.classList.add("active");
      });
    });
    modal.addEventListener("click", function () {
      modal.classList.remove("active");
    });
  });
</script>
