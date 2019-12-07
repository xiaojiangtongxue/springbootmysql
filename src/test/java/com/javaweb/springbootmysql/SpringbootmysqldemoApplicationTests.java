package com.javaweb.springbootmysql;

import com.javaweb.springbootmysql.entity.User;
import com.javaweb.springbootmysql.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootmysqldemoApplicationTests {

    @Autowired
    private UserRepository repository;

    @Test
    public void test() {
        User u = repository.getOne(1L);
        Assert.assertEquals("成功的测试用例", "张三", u.getName());
    }

}
