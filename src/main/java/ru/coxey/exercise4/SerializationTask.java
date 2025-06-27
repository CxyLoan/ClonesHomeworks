package ru.coxey.exercise4;

import ru.coxey.exercise4.model.TestClass;

import java.io.*;

public class SerializationTask {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        var testClass = new TestClass("Test", 25);

        FileOutputStream outputStream = new FileOutputStream("test.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        objectOutputStream.writeObject(testClass);
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("test.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        var copyTestClass = (TestClass) objectInputStream.readObject();
        copyTestClass.setName("CopyTestClass");
        copyTestClass.setAge(18);

        System.out.println("Объект, который сериализуем: " + testClass);
        System.out.println("Объект, который десериализовали и поменяли поля: " + copyTestClass);
    }
}
