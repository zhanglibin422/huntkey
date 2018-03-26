package com.demo.reflection;

public class Student {

    private String name;
    private int age;

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

    private void sleep() {
        System.out.println("˯---");
    }

    private void test(String s) {
        System.out.println(s);
    }

}
