package ru.coxey.exercise7.model;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTestClone {
    private List<String> list;

    public LinkedListTestClone() {}

    {
        this.list = new LinkedList<>();
        list.add("fafa");
        list.add("gaga");
    }

    //Конструктор копирования
    public LinkedListTestClone(LinkedListTestClone original) {
        this.list = new LinkedList<>(original.getList());
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
