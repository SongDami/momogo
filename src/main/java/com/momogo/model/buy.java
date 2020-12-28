package com.momogo.model;

import lombok.Data;

@Data
public class buy {
    private int buyId;          // 주문번호
    private String buyAdd;      // 배송지
    private int totalPrice;     // 총 주문금액
    private String buyState;    // 주문상태(상품 준비중, 배송 준비중, 배송중, 배송완료)
    private String buyCreate;
    private String buyUpdate;
    private String buyDelete;
    
    /* 참조키 */
    private String member_memberId; // 회원 테이블 - 회원 아이디
    
}
