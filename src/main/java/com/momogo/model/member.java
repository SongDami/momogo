package com.momogo.model;

import lombok.Data;

@Data
public class member {

    private String memberId;     // 회원 아이디(PK)
    private String memberPw;    // 회원 비밀번호
    private String memberName;   // 회원 이름
    private String memberEmail;  // 회원 이메일
    private String memberNick;   // 회원 닉네임
    private String memberPhone;  // 회원 전화번호
    private String memberAdd;    // 회원 주소
    private String memberCreate; // 회원 생성일
    private String memberUpdate; // 회원 수정일
    private String memberDelete; // 회원 삭제일

}
