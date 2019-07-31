package com.sise.springboot_demo;

import com.sise.springboot_demo.model.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * springboot的单元测试
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootDemoApplicationTests {

    @Autowired
    private Person person;

    @Test
    public void contextLoads() {

        System.out.println(person);

    }



}
