package org.example;

// any class created implicitly extends java.lang.Object
public class Student {

    private String name;
    private int age;

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

    public Student() {}

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    /*
        I added the call super.toString() in the overridden method.  This is possible
        because java.lang.Object has a toString() method.
    */
}
