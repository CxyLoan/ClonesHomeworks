package ru.coxey.exercise5.model;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public class Employee {
    private String name;
    private int age;
    private static Long version = 0L;
    private static Map<Long, Employee> cashClones = new ConcurrentHashMap<>();

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Employee getClone() {
        if (cashClones.containsValue(this)) {
            for (var entry : cashClones.entrySet()) {
                if (entry.getValue().equals(this)) {
                    return entry.getValue();
                }
            }
        }
        var employee = new Employee(this.getName(), this.getAge());
        cashClones.put(version, employee);
        version++;
        return employee;
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
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
