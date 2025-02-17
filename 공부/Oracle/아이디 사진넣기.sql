-- 아이디 사진 넣기

update message set acceptDate = sysdate where no = 2;
commit;

update member set photo = '/upload/member/KakaoTalk_20240703_120456115_01.jpg' where id = 'aaa1';
commit;
