--일반 게시판 테이블 구조(스키마) : DDL
--객체 제거
Drop table board cascade constraints;
drop sequence board_seq;

--객체 생성
--컬럼 타입
create table board(
--number : 숫자, number(4) -> 숫자 4자리, number(8,2) 숫자 8자리이면서 2자리
--primary key : null 안됨. 중복이되면 안됨
no number PRIMARY key,

--varchar(길이) 최대 2000자인 가변 길이. varchar2(길이) - 최대 4000자인 가변길이
--char(길이) - 딱 길이만큼의 데이터. char(4) - 반드시 4바이트의 길이인 데이터
--not null - null 을 입력하면 안된다는 제약조건
title VARCHAR2(300) not null,
content varchar2(2000) not null,
writer varchar2(30) not null,

--원래는 암호화시켜야 하지만 지금은 생략한다.
pw varchar2(20) not null,

--date - 날짜를 저장하는 타입 : 길이가 정해져 있다. 날짜와 시간 정보를 가지게 된다.
--default : 기본값 - 값을 넣지 않으면 들어가는 값. sysdate : 현재날짜와 시간
writeDate date default sysdate,
hit number default 0
);

--글번호 - 순서번호 만들어 주는 객체 : 시퀀스
create sequence board_seq;

--[샘플 데이터 입력]--
insert into board(no, title, content, writer, pw)
values(board_seq.nextval, '자바', '자바입니다.', '이이섭', '1111');
commit;
