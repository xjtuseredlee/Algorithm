package com.study.algorithm.serialized;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {
    public static void main(String[] args) {

        Student student = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\git\\student.ser");
            ObjectInputStream  objectInputStream = new ObjectInputStream(fileInputStream);
            try {
                student = (Student) objectInputStream.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.address);
        System.out.println(student.school);
        System.out.println(student.sex);

    }
}
