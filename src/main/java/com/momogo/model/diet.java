package com.momogo.model;

import lombok.Data;

@Data

/* 식단 테이블 */
public class diet {
    private int dietId;     // 식단 아이디
    private String normal;  // 일반 식단
    private String lite;    // 라이트 식단
    private String vegan;   // 비건 식단
    private String health;  // 헬스 식단

}
