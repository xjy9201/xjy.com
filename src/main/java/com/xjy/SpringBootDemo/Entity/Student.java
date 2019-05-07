package com.xjy.SpringBootDemo.Entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Component //把此javabean Student类放到spring容器
@ConfigurationProperties(prefix = "student") //识别的就是yml里的student
@Validated //开启校验
public class Student {
    private String name;
//    @Value("55")
    private int age;
    private boolean isAdult;
    private String[] hobbies;
    private Map<String,String> address;
    private List<String> skills;
    @Email
    private String email;
    private Pet pet;

    public Student() {
    }

    public Student(String name, boolean isAdult, String[] hobbies, Map<String, String> address, List<String> skills, String email, Pet pet) {
        this.name = name;
        this.isAdult = isAdult;
        this.hobbies = hobbies;
        this.address = address;
        this.skills = skills;
        this.email = email;
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public Map<String, String> getAddress() {
        return address;
    }

    public void setAddress(Map<String, String> address) {
        this.address = address;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isAdult=" + isAdult +
                ", hobbies=" + Arrays.toString(hobbies) +
                ", address=" + address +
                ", skills=" + skills +
                ", email='" + email + '\'' +
                ", pet=" + pet +
                '}';
    }
}
