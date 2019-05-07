package com.xjy.SpringBootDemo.Config;

import com.xjy.SpringBootDemo.Dao.StudentDao;
import com.xjy.SpringBootDemo.Service.StudentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public StudentService stuService(){ //等价于spring.xml里bean里的id studentService
        StudentService stuService = new StudentService(); //等价于spring.xml里bean里的 class com.xjy.SpringBootDemo.Service.StudentService
        stuService.setStudentDao(new StudentDao());
        //等价于spring.xml里bean里的  <property name="studentDao" ref="studentDao"></property>
        // 和 class="com.xjy.SpringBootDemo.Dao.StudentDao"
        return stuService;
    }
}
