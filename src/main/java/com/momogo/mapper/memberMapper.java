package com.momogo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.momogo.model.member;

@Mapper
public interface memberMapper {
    public int insert(member params);

}
