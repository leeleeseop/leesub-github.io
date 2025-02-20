-- 검색하는 항목에 인덱스를 만들면 속도가 빨라집니다. (select 속도)
-- 연락처로 검색을 많이해서 인덱스
/* 범위 주석 */
select /*+index(member idx_member_tel)*/ id, name, tel
from member
where tel = '010-1111-2222';

-- 속도 향상을 위한 인덱스 생성
create index idx_member_tel
on member(tel asc);

select /*+index(board sys_c007131) */
    no, title
from board;

select
    no, title
from board
order by no asc;

create index idx_board_no_desc
on board(no desc);

select no, title, writer, writeDate, hit
from(
    select /*+index(board idx_board_no_desc) */
        rownum rnum, no, title, writer, writeDate, hit
    from board
)
where rnum between 1 and 10;