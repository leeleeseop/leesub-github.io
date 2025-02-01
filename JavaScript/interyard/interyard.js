<script type="text/javascript">
  document.addEventListener("DOMContentLoaded", function () {
    const images = document.querySelectorAll(".zoomable");
    const modal = document.getElementById("imageModal");
    const modalImg = document.getElementById("modalImg");

    images.forEach(img => {
      img.addEventListener("dblclick", function () {
        modalImg.src = this.src;
        modal.classList.add("active");
      });
    });

    modal.addEventListener("click", function () {
      modal.classList.remove("active");
    });
  });
</script>
