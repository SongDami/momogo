package com.momogo.configuration;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.momogo.service.communityService;
import com.momogo.service.memberService;

@EnableWebSecurity
@RequiredArgsConstructor
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	private final memberService memberService;
	private final communityService communityService;
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Override
	public void configure(WebSecurity web) {
		web.ignoring().antMatchers("/css/**", "/js/**", "/img/**");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
//		http
//			.authorizeRequests()
//				.antMatchers("/login.do", "/join.do").permitAll()	//누구나 접근 허용
//				.antMatchers("/").hasRole("USER") 			// USER, ADMIN만 접근 가능
//				.antMatchers("/admin").hasRole("ADMIN")	 	// ADMIN만 접근 가능
//				.anyRequest().authenticated()				// 나머치 요청들은 권한의 종류에 상관 없이 권한이 있어야 접근 가능
//			
//			.and()
//				.formLogin()
//					.loginPage("/login.do")					// 로그인 페이지 링크
//					.defaultSuccessUrl("/main.do")					// 로그인 성공 후 리다이렉트 주소
//			.and()
//				.logout()
//					.logoutSuccessUrl("/login.do")				// 로그아웃 성공시 리다이렉트 주소
//					.invalidateHttpSession(true)			// 세션 날리기
//		;
	}
	
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.userDetailsService(userService).passwordEncoder(passwordEncoder());
	}
}
