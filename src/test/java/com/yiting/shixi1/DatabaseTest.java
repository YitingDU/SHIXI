package com.yiting.shixi1;

import com.yiting.shixi1.entity.UserInfo;
import com.yiting.shixi1.repository.UserInfoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class DatabaseTest {
    @Autowired
    private UserInfoRepository userInfoRepository;

    @Test
    public void testFindAll() {
        List<UserInfo> userInfos = userInfoRepository.findAll();
        System.out.println(userInfos);
        for (UserInfo user : userInfos) {
            System.out.println("ID: " + user.getId());
            System.out.println("Name: " + user.getNickName());
            System.out.println("Email: " + user.getEmail());
            System.out.println("gender: " + user.getGender());
            System.out.println("--------------------");
        }
    }
}
