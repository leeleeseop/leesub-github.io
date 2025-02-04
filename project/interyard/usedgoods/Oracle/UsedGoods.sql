DROP TABLE usedgoods CASCADE CONSTRAINTS PURGE;
DROP SEQUENCE usedgoods_seq;


-- 중고상품 테이블
CREATE TABLE usedgoods(
	ugno          NUMBER NOT NULL ,
	title         VARCHAR2(300) NOT NULL ,
	content       VARCHAR2(300) NOT NULL ,
	price         NUMBER NOT NULL ,
	image         VARCHAR2(100) NOT NULL ,
	writeDate     DATE DEFAULT sysdate NULL ,
	ugstatus      VARCHAR2(20) DEFAULT '판매중' NULL CHECK (ugstatus in('판매중', '판매완료')),
	id            VARCHAR2(30) NOT NULL ,
 PRIMARY KEY (ugno),
 FOREIGN KEY (id) REFERENCES member(id) ON DELETE SET NULL
);

CREATE SEQUENCE usedgoods_seq;

INSERT INTO usedgoods (ugno, title, content, price, writeDate, ugstatus, image, id)
VALUES (usedgoods_seq.NEXTVAL, '갤럭시24', '갤럭시S24 256GB', 950000, '2024-07-19', '판매중', '/upload/image/갤럭시24.jpg', 'test');
