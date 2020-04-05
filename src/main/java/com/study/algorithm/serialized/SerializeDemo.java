package com.study.algorithm.serialized;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
    public static void main(String[] args) {
        Student student = new Student();

        student.name = "lihong";
        student.age = 12;
        student.address = "xi'an";
        student.school = "jiaotong";
        student.sex = "man";

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("D:\\git\\student.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(student);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.printf("Serialized data is saved in /tmp/employee.ser");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
