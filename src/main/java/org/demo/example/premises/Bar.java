package org.demo.example.premises;

import org.demo.example.orders.Drinks;
import org.demo.example.orders.Order;
import org.demo.example.personnel.Employee;
import org.demo.example.personnel.Employees;
import org.demo.example.personnel.Position;

import java.util.HashMap;

public class Bar {
    public void makeDrink(Order order, Employees employees){
        HashMap<Drinks, Integer> orderedDrinks = order.getOrderedDrinks();
        Employee barman = employees.getEmployee(Position.barman);

        if (orderedDrinks.size() == 0){
            System.out.println("В замовленні напої відсутні");
        } else {
            for (Drinks orderedDrink : orderedDrinks.keySet()) {
                System.out.println("Бармен " + barman.getFulName() + " робить напой " + orderedDrink.name());
                Drinks.getComponents(orderedDrink);
            }
        }
    }
}
