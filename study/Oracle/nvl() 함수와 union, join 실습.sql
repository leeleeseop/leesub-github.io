elect null + 1 from dual;

​

-- null인 경우는 0으로 처리해 주세요. -> nvl

select nvl(null, 0) + 1 from dual;


-- 게시판

select 'board' catagory, no, title, writeDate

from board;

-- 공지사항

select 'notice' catagory, no, title, updateDate writeDate

from notice;

select catagory, no, title, writeDate

from(

    select 'board' catagory, no, title, writeDate

    from board

    union

    select 'notice' catagory, no, title, updateDate writeDate

    from notice

)

order by writeDate desc

;


-- 회원 정보보기 - 아이디, 이름, 연락처, 등급번호, 등급명

select m.id, m.name, m.tel, m.gradeNo, g.gradeName

from grade g, member m

-- where g.gradeNo = m.gradeNo -- inner join : null이면 데이터가 안나온다.

-- where g.gradeNo = m.gradeNo(+) -- outter join : null인 경우 null로 표시 - 데이터 나온다.

where (id = 'test') and (g.gradeNo = m.gradeNo) -- 일반 조건과 조인 조건이 있으며 일반 조건을 앞에 둔다.

;
