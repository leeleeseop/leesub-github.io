-- 1. 테이블 삭제
DROP TABLE reply CASCADE CONSTRAINTS PURGE;

--2. 시퀀스 삭제
DROP SEQUENCE reply_seq;

-- 3. 댓글 테이블
CREATE TABLE reply(
	rno           NUMBER NOT NULL ,
	ugno          NUMBER NULL ,
	content       VARCHAR2(500) not NULL ,
	writeDate     DATE DEFAULT sysdate NULL ,
	id            VARCHAR2(30) NULL ,
 PRIMARY KEY (rno),
 FOREIGN KEY (ugno) REFERENCES usedgoods(ugno) ON DELETE SET NULL,
 FOREIGN KEY (id)   REFERENCES member(id) ON DELETE SET NULL
);

-- 4. 시퀀스 생성
CREATE SEQUENCE reply_seq;

--5. 댓글 샘플데이터
insert into reply(rno, ugno, content, id)
values(reply_seq.nextval, 149, '답장부탁드립니다', 'test1');
