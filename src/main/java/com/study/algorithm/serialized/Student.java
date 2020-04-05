package com.study.algorithm.serialized;

import java.io.Serializable;

public class Student implements Serializable {

    public String name;
    public String sex;
    public transient int age; // transient为短暂的，不会被序列化
    public String school;
    public String address;

    public String getName() {
        return name;
    }

    public Student(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public Student() {
    }

    public int getAge() {
        return age;
    }

    public String getSchool() {
        return school;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
