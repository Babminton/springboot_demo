package com.sise.springboot_demo.model;

/*@program: springboot_demo
 *@description: 用户实体
 *@author: zeng
 *@create: 2019-07-31 11:45
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;
/**
 * 将配置文件中配置的每一个属性的值，映射到这个组件中
 * @ConfigurationProperties：
 * 告诉SpringBoot将本类中的所有属性和配置文件中相关的配置进行绑定；
 *      prefix = "person"：配置文件中哪个下面的所有属性进行一一映射
 *
 * 只有这个组件是容器中的组件，才能容器提供的@ConfigurationProperties功能；
 *
 */

/**
 * @PropertySource：加载指定的配置文件；
 */

@Component
//@Validated
//@ConfigurationProperties(prefix = "person")
@PropertySource(value = {"classpath:application.properties"})
public class Person {
    /**
     * @value 也是一种获取配置文件值的方式，相当于
     * <bean class="Person">
     * <property name="lastName" value="字面量/${key}从环境变量、配置文件中获取值/#{SpEL}">
     * </property>
     * </bean>
     */

    /**
     * @Email
     * username必须是邮箱格式
     * @Validated
     * @ConfigurationProperties(prefix = "person")  //默认从全局配置文件中获取值；
     *
     * 特别的@Value不支持数据校验
     */
   // @Value("${person.last-name}")
  //  @Email
    private String username;
 //   @Value("#{11*2}")
    private Integer age;
    private boolean boss;
    private Date birthday;
    private Dog dog;

    private Map<String,Object> maps;
    private List<Object> lists;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isBoss() {
        return boss;
    }

    public void setBoss(boolean boss) {
        this.boss = boss;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }


    @Override
    public String toString() {
        return "Person{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birthday=" + birthday +
                ", dog=" + dog +
                ", maps=" + maps +
                ", lists=" + lists +
                '}';
    }




}
