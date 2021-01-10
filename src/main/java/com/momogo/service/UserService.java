package com.momogo.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.momogo.model.UserInfo;
import com.momogo.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService implements UserDetailsService {

	private final UserRepository userRepository;
	
	/**
	 * Spring Security 필수 메서드 구현
	 * 
	 * @param email
	 * @return userDetails
	 * @throws UsernameNotFoundException
	 */
	@Override
	public UserInfo loadUserByUsername(String email) throws UsernameNotFoundException {
		return userRepository.findByEmail(email).orElseThrow(() -> new UsernameNotFoundException(email));
	}
}
