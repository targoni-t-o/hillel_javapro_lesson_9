package org.demo.example.premises;

import org.demo.example.orders.Dishes;
import org.demo.example.orders.Order;
import org.demo.example.personnel.Employee;
import org.demo.example.personnel.Employees;
import org.demo.example.personnel.Position;

import java.util.HashMap;

public class Kitchen {
    public void makeDish(Order order, Employees employees){
        HashMap<Dishes, Integer> orderedDishes = order.getOrderedDishes();
        Employee cook = employees.getEmployee(Position.cook);

        if (orderedDishes.size() == 0){
            System.out.println("В замовленні страви відсутні");
        } else {
            for (Dishes orderedDish : orderedDishes.keySet()) {
                System.out.println("Повар " + cook.getFulName() + " робить страву " + orderedDish.name());
                Dishes.getComponents(orderedDish);
            }
        }
    }
}
