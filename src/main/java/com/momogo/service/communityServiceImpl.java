package com.momogo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.momogo.mapper.communityMapper;
import com.momogo.model.community;

@Service
public class communityServiceImpl implements communityService {
	
	@Autowired communityMapper communityMapper;

	@Override
	public boolean registerCommunity(community params) {
		// TODO Auto-generated method stub
		return false;
	}

}
