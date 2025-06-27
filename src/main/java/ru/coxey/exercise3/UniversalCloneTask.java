package ru.coxey.exercise3;

import ru.coxey.exercise3.model.TestModel;
import ru.coxey.exercise3.utils.CloneCreator;

public class UniversalCloneTask {

    public static void main(String[] args) {
        TestModel testModel = new TestModel("Ivan", 25);

        var clone = CloneCreator.createClone(testModel);

        clone.setName("Petya");
        clone.setAge(88);

        System.out.println("TestModel: " + testModel);
        System.out.println("Clone: " + clone);
    }
}
