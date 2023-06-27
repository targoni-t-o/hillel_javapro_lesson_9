package org.demo.example.personnel;
public class Person {
    public String firstName;
    public String lastName;
    public Gender gender;

    public Person(String firstName, String lastName, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getFulName(){
        return this.lastName + " " + this.firstName;
    }
}
