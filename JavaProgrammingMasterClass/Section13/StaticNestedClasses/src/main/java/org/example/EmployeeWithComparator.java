package org.example;
import java.util.Comparator;

public class EmployeeWithComparator {

    public static class EmployeeComparator
            <T extends EmployeeWithComparator> implements Comparator<EmployeeWithComparator> {

        private String sortType;

        public EmployeeComparator() {
            this("name");
        }

        public EmployeeComparator(String sortType) {
            this.sortType = sortType;
        }

        @Override
        public int compare(EmployeeWithComparator o1, EmployeeWithComparator o2) {
            if (sortType.equalsIgnoreCase("yearStarted")) {
                return Integer.compare(o1.getYearStarted(), o2.getYearStarted());
            } else if (sortType.equalsIgnoreCase("employeeId")) {
                return Integer.compare(o1.getEmployeeId(), o2.getEmployeeId());
            } else {
                return o1.getName().compareTo(o2.getName());
            }
        }
    }


    private int employeeId;
    private String name;
    private int yearStarted;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearStarted() {
        return yearStarted;
    }

    public void setYearStarted(int yearStarted) {
        this.yearStarted = yearStarted;
    }

    @Override
    public String toString() {
        return STR."EmployeeWithComparator{employeeId=\{employeeId}, name='\{name}', yearStarted=\{yearStarted}}";
    }

    public EmployeeWithComparator() {}

    public EmployeeWithComparator(int employeeId, String name, int yearStarted) {
        this.employeeId = employeeId;
        this.name = name;
        this.yearStarted = yearStarted;
    }
}


