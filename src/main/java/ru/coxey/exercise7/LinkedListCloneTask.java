package ru.coxey.exercise7;

import ru.coxey.exercise7.model.LinkedListTestClone;

import java.util.LinkedList;

public class LinkedListCloneTask {

    public static void main(String[] args) {
        LinkedListTestClone test = new LinkedListTestClone();

        var clone = new LinkedListTestClone(test);

        clone.setList(new LinkedList<>());
        var list = clone.getList();
        list.add("clone");

        System.out.println("Test: " + test.getList());
        System.out.println("Clone: " + clone.getList());
    }
}
