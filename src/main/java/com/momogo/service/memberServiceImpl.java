package com.momogo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.momogo.mapper.memberMapper;
import com.momogo.model.member;

@Service
public class memberServiceImpl implements memberService{
    
    @Autowired
    private memberMapper memberMapper;  
    
    @Override
    public boolean registerMember(member params) {
        int queryResult = 0;
        
        return false;
        

        
    }

}
