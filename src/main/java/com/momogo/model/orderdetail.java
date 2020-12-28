package com.momogo.model;

import lombok.Data;

@Data
public class orderdetail {
    private int orderDetailId;      // 주문상세 ID
    private int orderDetailCount;   // 주문 갯수
    private String orderDetailDate; // 배송 날짜
    
    /* 참조키 */
    private String mealplan_mealPlan;
    private int buy_buyId;

}
