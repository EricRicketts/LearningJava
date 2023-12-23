package org.example;

public class PrimaryStudent extends Student {

    private String parentName;

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public PrimaryStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "parentName='" + parentName + '\'' +
                "} " + super.toString();
    }
}
