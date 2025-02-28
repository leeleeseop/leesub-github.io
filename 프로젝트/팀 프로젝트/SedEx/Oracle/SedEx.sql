-- 1.테이블삭제
DROP TABLE cart CASCADE CONSTRAINTS;

-- 2.시퀀스 삭제
DROP SEQUENCE cart_seq;

-- 3.장바구니 테이블 생성
create table cart(
    cartCode number primary key,
    --  fk : Foriegn Key(참조키) - goods.no에 데이터가 없으면 입력 못함 null은 입력 가능.
    no number references goods(no),
    quantity number DEFAULT 0,
    --  fk : Foriegn Key(참조키) - member.memberNo에 데이터가 없으면 입력 못함 null은 입력 가능.
    memberNo number REFERENCES member(memberNo) not null,
    sum number  DEFAULT 0
);

-- 4.장바구니 시퀀스 생성
create sequence cart_seq;

-- 5.장바구니 생플 데이터
insert into cart(cartcode, no, quantity, memberNo)
VALUES (cart_seq.nextval, 1, 3, 1); 

insert into cart(cartcode, no, quantity, memberNo)
VALUES(cart_seq.nextval, 3, 1, 1); 
