package edu.exception.pack3.ex.model;

// 장바구니 모델

import java.time.LocalDateTime;

public class Cart {

    // 필드
    private String userId;
    private LocalDateTime createTime;

    // 생성자 메서드
    public Cart(String userId) {
        this.userId = userId;
        // 장바구니 생성된 시간은 사용자가 아닌 개발자가 현재 시간으로 설정하도록 한다.
        this.createTime = LocalDateTime.now();
    }

    // getter / setter
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public LocalDateTime getCreateTime() {
        return createTime;
    }
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
}
