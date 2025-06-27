package ru.coxey.exercise3.utils;

import ru.coxey.exercise3.clone.CloneableClass;

public class CloneCreator {

    private CloneCreator() {}

    public static <T extends CloneableClass<T>> T createClone(T obj) {
        return obj.getClone();
    }
}
