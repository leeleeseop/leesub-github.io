document.addEventListener("DOMContentLoaded", function () {
    console.log("DOMContentLoaded triggered"); // 디버그 로그

    const images = document.querySelectorAll(".zoomable");
    console.log("Found images: ", images.length);

    const modal = document.getElementById("imageModal");
    const modalImg = document.getElementById("modalImg");

    images.forEach(img => {
        img.addEventListener("dblclick", function () {
            console.log("Image double-clicked:", this.src); // 디버그 로그
            modalImg.src = this.src;
            modal.style.display = "flex";
        });
    });

    // 모달 클릭 시 닫기
    modal.addEventListener("click", function () {
        modal.style.display = "none";
    });
});
