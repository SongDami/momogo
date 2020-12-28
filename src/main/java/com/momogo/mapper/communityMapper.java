package com.momogo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.momogo.model.community;

@Mapper
public interface communityMapper {
	// 게시글 등록
    public int insertCommunity(community params);
    // 게시글 select
    public community selectCommunity(Long idx);
    // 게시글 수정
    public int updateCommunity(community params);
    // 게시글 삭제
    public int deleteCommunity(Long idx);
    // 게시글 List select
    public List<community> selectCommunityList();
    // total count
    public int selectCommunityTotalCount();
}
