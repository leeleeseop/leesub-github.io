-- << 회원관리 스키마 >> --
-- 1. 객체 제거
DROP TABLE member CASCADE CONSTRAINTS;
DROP TABLE grade CASCADE CONSTRAINTS;


-- 2. 객체 생성
create table grade(
gradeNo number(2) primary key,
gradeName varchar2(21) not null
);

CREATE TABLE member(
  -- primary key(PK): not null + unique(유일한, 중복되지 않음)(UK)
  id VARCHAR2(20) PRIMARY KEY,
  pw VARCHAR2(20) NOT NULL,
  name VARCHAR2(30) NOT NULL,
  -- varchar2 - 가변길이 데이터, char - 고정 길이 : char(6) - '유' ->'유   '
  -- check 제약조건 (CK) - 데이터를 입력할 때 입력 가능한 데이터 체크해준다.
  -- not null(NN) : 데이터가 반드시 존재해야만 한다.
  gender CHAR(6) CHECK (gender = '남자' or gender = '여자') NOT NULL,
  birth DATE NOT NULL,
  tel VARCHAR2(13),
  email VARCHAR2(50) NOT NULL,
  regDate DATE DEFAULT sysdate,
  conDate DATE DEFAULT sysdate,
  --status CHAR(6)  DEFAULT '정상' CHECK(status = '정상' or status = '강퇴' or status = '탈퇴' or status = '휴면'),
  status CHAR(6)  DEFAULT '정상' CHECK(status in('정상', '강퇴', '탈퇴', '휴면')),
  -- 1:일반회원, 9:관리자 -> grade 테이블 참조
  -- references : 참조키(=외래키) - Foriegn Key(FK) : 참조하고 있는 데이터 + null 사용 가능
  gradeNo number(2)  DEFAULT 1 REFERENCES grade(gradeNo),
  newMsgCnt number default 0,
  photo varchar2(100)
);

-- 3. 샘플 데이터 - 일반사용자, 관리자

insert into grade
values(1, '일반회원');
insert into grade
values(9, '관리자');


-- 일반사용자 - 회원가입
INSERT INTO member(id, pw, name, gender, birth, tel, email)
VALUES('test', '1111', '홍길동', '남자', '1990-01-01', '010-1111-2222', 'hong@naver.com');

INSERT INTO member(id, pw, name, gender, birth, tel, email)
VALUES('fest', '2222', '콩순이', '여자', '1987-01-01', '010-141-2282', 'kong@naver.com');

-- 관리자 - 별도 DB 입력 - 항상 정상 이여야 한다.
INSERT INTO member(id, pw, name, gender, birth, tel, email, gradeNo)
VALUES('admin', '1111', '관리자', '남자', '1990-01-01', '010-1111-2222', 'admin@naver.com',9);
COMMIT;
