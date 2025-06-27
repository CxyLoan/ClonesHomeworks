package ru.coxey.exercise6;

import ru.coxey.exercise6.model.Human;

public class VersionCloneTask {

    public static void main(String[] args) {
        Human human1 = Human.createInstance("Human1", 25);

        var human2 = human1.getClone();
        human2.setName("Human2");
        human2.setAge(50);

        var human3 = Human.getHumanByVersion(0L);
        var human4 = Human.getHumanByVersion(1L);

        System.out.println("Достали human1: " + human3);
        System.out.println("Достали human2: " + human4);
//        var human5 = Human.getHumanByVersion(2L); // ТУТ NPE
    }
}
