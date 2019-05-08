package com.xjy.SpringBootDemo;

import com.xjy.SpringBootDemo.Dao.StudentDao;
import com.xjy.SpringBootDemo.Entity.Student;
import com.xjy.SpringBootDemo.Service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoApplicationTests {
    Logger logger = LoggerFactory.getLogger(SpringBootDemoApplicationTests.class);

	@Autowired
	Student student;

	@Autowired
	ApplicationContext applicationContext ; //spring ioc 容器

	@Test
    public void contextLoads() {
    }

    @Test
    public void testStudentEntity() {
        System.out.println(student);
    }

	@Test
	public void testStudentService(){
		StudentService studentService =(StudentService)applicationContext.getBean("studentService");
		System.out.println("---+--"+studentService+"---+--");

	}

    @Test
    public void testStuService(){
        StudentService studentService =(StudentService)applicationContext.getBean("stuService");
        System.out.println("---++--"+studentService+"---++--");

    }

    @Test
    public void testLog(){
        logger.trace("trace...");
        logger.debug("debug...");
        logger.info("info...");
        logger.warn("warn...");
        logger.error("error...");
    }

}
