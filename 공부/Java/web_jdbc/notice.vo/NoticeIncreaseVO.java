package com.webjjang.notice.vo;

public class NoticeIncreaseVO {

    // private variables
    private Long no;
    private Long hit;

    // setter, getter
    public Long getNo() {
        return no;
    }

    public void setNo(Long no) {
        this.no = no;
    }

    public Long getHit() {
        return hit;
    }

    public void setHit(Long hit) {
        this.hit = hit;
    }

    // toString for data verification
    @Override
    public String toString() {
        return "BoardUpdateVO [no=" + no + ", hit=" + hit + "]";
    }
}
