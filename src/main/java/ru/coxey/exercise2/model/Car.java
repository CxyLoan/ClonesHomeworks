package ru.coxey.exercise2.model;

public class Car implements Cloneable {

    private String model;
    private int hp;

    public Car(String model, int hp) {
        this.model = model;
        this.hp = hp;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return (Car) super.clone();
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", hp=" + hp +
                '}';
    }
}
