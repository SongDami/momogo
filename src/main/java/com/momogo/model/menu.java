package com.momogo.model;

import lombok.Data;

@Data
public class menu {
    
    private String menu;        // 메뉴 이름
    private String menuClass;   // 메뉴 종류 (밥, 국, 반찬1, 반찬2, 디저트)

    private String menuCreate;  // 메뉴 생성일
    private String menuUpdate;  // 메뉴 수정일
    private String menuDelete;  // 메뉴 삭제일
    
    // 참조키
    private String mealplan_mealPlan;

}
