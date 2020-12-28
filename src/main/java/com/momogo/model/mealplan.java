package com.momogo.model;

import lombok.Data;

@Data
public class mealplan {
    private String mealPlan;    // 식단 종류(일반, 라이트, 비건, 헬스)
    private int mealPrice;      // 식단별 가격

}
