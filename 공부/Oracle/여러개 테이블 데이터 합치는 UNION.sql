-- 여러개 테이블을 한꺼번에 데이터 가져오기
-- board, image에서 데이터 가져오기 - 글번호, 제목, 작성자, 또는 아이디, 작성일
select no, item, title, writer, writeDate
from(
    select no, '게시판' item, title, writer, writeDate
    from board
    union all
        select no, '이미지' item, title, id writer, writeDate
    from image
)
order by writeDate desc
;
