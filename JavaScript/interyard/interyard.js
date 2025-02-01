<script type="text/javascript">
document.addEventListener("DOMContentLoaded", function () {
    const images = document.querySelectorAll(".zoomable");
    const modal = document.getElementById("imageModal");
    const modalImg = document.getElementById("modalImg");

    images.forEach(img => {
        img.addEventListener("dblclick", function () {
            modalImg.src = this.src;
            modal.style.display = "flex"; // 변경: 모달을 보이게 함
        });
    });

    // 모달 클릭 시 닫기
    modal.addEventListener("click", function () {
        modal.style.display = "none"; // 변경: 모달을 숨김
    });
});
</script>
