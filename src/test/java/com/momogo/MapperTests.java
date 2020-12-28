package com.momogo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.momogo.model.member;
import com.momogo.mapper.memberMapper;



@SpringBootTest
class MapperTests {

    @Autowired
    private memberMapper memberMapper;

    @Test
    public void testOfInsert() {
        member params = new member();
        params.setMemberId("ㅁ니아럼ㄴ");
        params.setMemberPw("12345");
        params.setMemberName("김박");
        params.setMemberEmail("sdf@email.com");
        params.setMemberNick("킥킥이");
        params.setMemberPhone("01012345678");
        params.setMemberAdd("ww");
        
        

        int result = memberMapper.insertMember(params);
        System.out.println("**결과**"+result);

    }

}
