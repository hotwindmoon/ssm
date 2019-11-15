package com.test.ceshi;

import com.alibaba.fastjson.JSON;
import com.test.pojo.User;
import com.test.service.IUserService;
import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class Test {

    private static Logger logger = Logger.getLogger(Test.class);

    @Resource
    private IUserService userService = null;

    @org.junit.Test
    public void test() {
        for (int i = 1; i <= 3; i++) {
            User user = userService.getUserById(i);
            System.out.println("userId:" + user.getId());
            System.out.println("userName:" + user.getUsername());
            System.out.println("password:" + user.getPassword());
            logger.info(JSON.toJSON(user));

        }
    }
}
