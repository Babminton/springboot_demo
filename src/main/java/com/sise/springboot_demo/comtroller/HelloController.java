package com.sise.springboot_demo.comtroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*@program: springboot-01-helloworld
 *@description: 控制层
 *@author: zeng
 *@create: 2019-07-30 18:43
 */

/**
 * @ Controller
 * @ ResponseBody : 这个类
 */
@RestController
public class HelloController {


    @RequestMapping("hello")
    public String hello(){
           return "Hello World!springboot_demo 2019";
    }
}
