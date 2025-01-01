package org.example;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String firstName = "";
    private String lastName = "";
    private Integer age = 0;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static String addPigLatinName(List<Employee> employeeList) {
        String output = "";
        class DecoratedEmployee extends Employee {
            private String pigLatinName;
            private Employee originalEmployee;

            public DecoratedEmployee(String pigLatinName, Employee originalEmployee) {
                this.pigLatinName = pigLatinName;
                this.originalEmployee = originalEmployee;
            }

            @Override
            public String toString() {
                return originalEmployee.toString() + " " + "pigLatinName=" + pigLatinName;
            }
        }

        List<DecoratedEmployee> decoratedEmployeeList = new ArrayList<>(employeeList.size());

        for(var employee : employeeList) {
            String name = employee.getFirstName();
            String pigLatinName = name.substring(1) + name.charAt(0) + "ay";
            decoratedEmployeeList.add(new DecoratedEmployee(pigLatinName, employee));
        }

        for( DecoratedEmployee decoratedEmployee : decoratedEmployeeList) {
            output = output.concat(decoratedEmployee.toString() + "\n");
        }
        return output;
    }

    public Employee() {}

    public Employee(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
