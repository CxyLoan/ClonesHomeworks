package ru.coxey.exercise4.model;

import java.io.Serializable;

public class TestClass implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private int age;

    public TestClass(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "TestClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
