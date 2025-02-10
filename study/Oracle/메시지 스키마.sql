drop table message cascade CONSTRAINTS purge;

drop sequence message_seq;

create table message(
    no NUMBER primary key,
    content varchar2(2000) not null,
    senderID VARCHAR2(20) references member(id) not null,
    sendDate date DEFAULT sysdate,
    accepterID varchar2(20) references member (id) not null,
    acceptDate date,
    allUser number(1) default 0
);
create sequence message_seq;

insert into message(no, content, senderID, accepterid)
values(message_seq.nextval, '감사합니다', 'test', 'admin');

insert into message(no, content, senderID, accepterid)
values(message_seq.nextval, '눈물의 여왕 감사합니다', 'admin', 'test');
commit;
SELECT * from message;
