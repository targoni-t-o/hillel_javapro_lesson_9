package org.demo.example.personnel;

import java.util.HashMap;

public class Employees {
    private final HashMap<Position, Employee> employees = new HashMap<>();

    public Employees(){
        this.employees.put(Position.waiter, new Employee("John", "Dawson", Gender.male, Position.waiter));
        this.employees.put(Position.cook, new Employee("Alice", "Peterson", Gender.female, Position.cook));
        this.employees.put(Position.barman, new Employee("Peter", "Petty", Gender.male, Position.barman));
    }

    public Employee getEmployee(Position position) {
        return employees.get(position);
    }
}
