public class Employee {
    private String name;        // Employee's name
    private int age;            // Employee's age
    private String department;  // Employee's department
    private double salary;      // Employee's salary
    private String position;    // Employee's position

    // Constructor to initialize all fields
    public Employee(String name, int age, String department, double salary, String position) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
        this.position = position;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Getter for department
    public String getDepartment() {
        return department;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Getter for position
    public String getPosition() {
        return position;
    }

    // Setter for position
    public void setPosition(String position) {
        this.position = position;
    }

    // Provides a string representation of the employee
    @Override
    public String toString() {
        return name + " (" + position + ")"; // Formats the employee details for display
    }
}
