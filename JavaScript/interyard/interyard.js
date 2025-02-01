/**
 * const clickimg = document.getEleamentById("clickimg")
   const modal = document.getEleamentById("modal")
   const modalImg = document.getEleamentById("modalImg")

   // 이미지 클릭시 모달 열기
   clickimg.addEvventListener("click", function() {
     modalImg.src = this.src;
     modal.style.display = "flex";
   });

   // 모달 클릭 시 모달 닫기
   modal.addEventListener("click", function() {
     modal.style.display = "none";
   });
 */
