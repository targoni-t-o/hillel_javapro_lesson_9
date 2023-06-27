package org.demo.example.personnel;
public class Employee extends Person{
    public Position position;

    public Employee(String firstName, String lastName, Gender gender, Position position) {
        super(firstName, lastName, gender);
        this.position = position;
    }
}
