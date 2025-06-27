package ru.coxey.exercise2.model;

public class Person implements Cloneable {

    private String name;
    private int age;
    private Car car;

    public Person(String name, int age, Car car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }

    // Конструктор копирования
    public Person(Person person) {
        this.name = person.name;
        this.age = person.age;
        var car = person.getCar();
        this.car = new Car(car.getModel(), car.getHp());
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

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public Person clone() throws CloneNotSupportedException {
        return new Person(this.name, this.age, this.car.clone());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                '}';
    }
}
