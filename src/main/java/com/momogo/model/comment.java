package com.momogo.model;

import lombok.Data;

@Data
public class comment {
    private int commentId;          // 댓글 아이디
    private String commentContent;  // 댓글 내용
    private String commentCreate;
    private String commentUpdate;
    private String commentDelete;
    
    /* 참조키 */
    private int community_comId;    
    private String member_memberId;

}
