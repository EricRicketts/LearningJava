package org.example;

import java.util.Comparator;

public class StudentGPAComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        // this first compares the GPAs which are double values then if they are the same they compare by name
        return (o1.getGpa() + o1.getName()).compareTo(o2.getGpa() + o2.getName());
    }
}
