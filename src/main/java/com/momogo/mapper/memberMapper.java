package com.momogo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.momogo.model.member;

@Mapper
public interface memberMapper {
    // 회원 가입
    public int insertMember(member params);
    // 회원 select
    public member selectMember(Long idx);
    // 회원 수정
    public int updateMember(member params);
    // 회원 탈퇴
    public int deleteMember(Long idx);
    // 회원 List select
    public List<member> selectMemberList();
    // total count
    public int selectMemberTotalCount();

}
