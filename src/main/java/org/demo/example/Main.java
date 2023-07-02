package org.demo.example;

import org.demo.example.orders.*;
import org.demo.example.personnel.*;
import org.demo.example.premises.*;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Вітаємо у нашому ресторані!");
        System.out.println();

        Hall hall = new Hall();

        String table = hall.getFreeTable();

        System.out.println("Ваш столик " + table);
        System.out.println();

        Employees employees = new Employees();
        Employee waiter = employees.getEmployee(Position.waiter);

        Menu.createMenu();

        System.out.println();
        System.out.println("Офіціант " + waiter.getFulName() + " прийме Ваше замовлення.");

        Order order = new Order();

        System.out.println();

        Kitchen kitchen = new Kitchen();
        kitchen.makeDish(order, employees);

        System.out.println();

        Bar bar = new Bar();
        bar.makeDrink(order, employees);

        System.out.println();

        System.out.println("Ваше замовлення коштує " + order.getTotal());

    }

    public static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
}