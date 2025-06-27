package ru.coxey.exercise3.model;

import ru.coxey.exercise3.clone.CloneableClass;

public class TestModel implements CloneableClass<TestModel> {
    private String name;
    private int age;

    public TestModel(String name, int age) {
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
        return "TestModel{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public TestModel getClone() {
        return new TestModel(this.getName(), this.getAge());
    }
}
