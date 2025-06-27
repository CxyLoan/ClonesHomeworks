package ru.coxey.exercise6.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Human {
    private String name;
    private int age;
    private static Long version = 0L;
    private static final Map<Long, Human> clones = new HashMap<>();

    private Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Human createInstance(String name, int age) {
        var human = new Human(name, age);
        clones.put(version, human);
        version++;
        return human;
    }

    public Human getClone() {
        var human = new Human(this.getName(), this.getAge());
        clones.put(version, human);
        version++;
        return human;
    }

    public static Human getHumanByVersion(Long version) {
        var human = clones.get(version);
        if (Objects.isNull(human)) {
            throw new NullPointerException("Человека с версией: " + version + " не существует");
        }
        return human;
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

    public Long getVersion() {
        return version;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
