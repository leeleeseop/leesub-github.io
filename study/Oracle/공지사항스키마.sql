--공지사항 스키마
--1. 제거
drop table notice cascade CONSTRAINTS purge;
drop sequence notice_seq;

--2. 생성
create table notice(
no number primary key,
title varchar2(300) not null,
content varchar2(2000) not null,
        startDate date default sysdate,
endDate date default '9999-12-30',
writeDate date default sysdate,
updateDate date default sysdate
);
create sequence notice_seq;

--3. 샘플데이터
--3-1) 현재 공지

insert into notice(no, title, content, startDate, endDate)
        values(notice_seq.nextval, '키오스크과정 진행', '키오스크과정 진행', '2024-04-11', '2024-09-27');

--3-2)지난공지
insert into notice(no, title, content, startDate, endDate)
values(notice_seq.nextval, '키오스크과정 개강', '키오스크과정 개강', '2024-04-11', '2024-04-17');

--3-3)예약공지
insert into notice(no, title, content, startDate, endDate)
values(notice_seq.nextval, '키오스크과정 수료', '키오스크과정 수료예정', '2024-09-21', '2024-09-27');
commit;

select * from notice;

