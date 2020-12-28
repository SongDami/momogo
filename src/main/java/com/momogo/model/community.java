package com.momogo.model;

import lombok.Data;

@Data
public class community {
    
    private int comId;          // 글 아이디
    private String comTitle;    // 글 제목
    private String comContent;  // 글 본문
    private String comCreate;
    private String comUpdate;
    private String comDelete;
    
    /* 참조키 */
    private String member_memberId;

}
