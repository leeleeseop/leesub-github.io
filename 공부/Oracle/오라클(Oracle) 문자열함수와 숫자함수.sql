-- 문자형 함수

select * from board;

-- 대문자.

select UPPER(title) from board;

-- 소문자

select lower('TEST') from dual;

​

-- 문자열의 길이

select title, length(title) from board where no < 30;

-- DISTINCT : 중복된 데이터를 배제시킨다.

select DISTINCT writer from board;


-- 한글의 길이 : length(writer)

update board set writer = '이이섭' where no = 83;

commit;

​

select * from board where no =83;

​

-- 일반 게시판 83(한글 작성자를 가진 데이터)번 글의 번호, 제목, 작성자, 작성자의 길이

-- 작성자의 길이를 알아 낼 때 1)length(writer) 2)lengthb(writer)

select no, title, writer, length(writer) langth,lengthb(writer) lengthb from board where no = 83;

​

select '[' || '     java   ' || ']' from dual;

-- trim(문자열) - 문자열의 앞뒤 공백을 지움.

select '[' || trim('     ja va   ') || ']' from dual;

-- ltrim(문자열) - 문자열의 앞 공백을 지움. (left trim)

select '[' || ltrim('     ja va   ') || ']' from dual;

-- rtrim(문자열) - 문자열의 뒤 공백을 지움. (right trim)

select '[' || rtrim('     ja va   ') || ']' from dual;

​

-- 시퀀스를 사용하지 않고 데이터 입력하는 번호 구하기

select max(no) + 1 nextNo from board;

-- sub 쿼리를 이용해서 일반 게시판 데이터 추가하기(insert)

insert into board(no, title, content, writer, pw)

values((select max(no) + 1 nextNo from board)

, 'kiost', '무인 주문', '이이섭', '1111');

commit;

​

-- 80번 삭제

delete from board where no =80;

update board set no = no - 1 where no > 80;

commit;

​

select * from board order by no desc;

​

-- 숫자 함수

-- round(실수) - 소수점 기준, round(실수, 자릿수) - 소수점 이하 자릿수 까지 표시 반올림

select 1234.567 num, round(1234.567) round from dual;

-- trunc(실수) - 소수점 기준, floor(실수) - 소숫점 기준 실수 값을 넘지 않는 정수 최대값 = 소수점제거: trunc

-- ceil(실수) - 올림

select 1234.567 num, trunc(1234.567, 2) trunc,

    floor(1234.567) floor,

    ceil(1234.567) ceil from dual;
