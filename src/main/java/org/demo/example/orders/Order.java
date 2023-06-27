package org.demo.example.orders;

import java.util.Scanner;
import java.util.HashMap;

public class Order {
    private final HashMap<Dishes, Integer> orderedDishes = new HashMap<>();
    private final HashMap<Drinks, Integer> orderedDrinks = new HashMap<>();

    public Order(){
        orderDishes();
        orderDrinks();
    }

    public HashMap<Drinks, Integer> getOrderedDrinks() {
        return orderedDrinks;
    }

    public HashMap<Dishes, Integer> getOrderedDishes() {
        return orderedDishes;
    }

    private void orderDishes(){
        boolean dishesOrdered = false;
        int dishesQuantity;

        System.out.println();
        System.out.println("Бажаєте замовити їжу? y/n");

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        while (!dishesOrdered) {
            switch (answer) {
                case "y":
                    System.out.println("Скільки страв бажаєте замовити:");
                    dishesQuantity = scanner.nextInt();

                    selectDishes(dishesQuantity);

                    dishesOrdered = true;
                    break;
                case "n":
                    dishesOrdered = true;
                    break;
                default:
                    System.out.println("Невірна відповіть, введить y/n");
                    answer = scanner.nextLine();
            }
        }
    }

    private void selectDishes(int dishesQuantity){
        Scanner dishScanner = new Scanner(System.in);

        for (int i = 0; i < dishesQuantity; i++) {
            while (true){
                System.out.println("Введіть назву страви:");

                String dishName = dishScanner.nextLine();
                Dishes orderedDish = Dishes.getFromString(dishName);

                if (orderedDish == null){
                    System.out.println("Страва відсутня для вибору. Повторіть будбласка вибор.");
                } else {
                    Scanner quantityScanner = new Scanner(System.in);
                    System.out.println("Кількість страв:");
                    orderedDishes.put(orderedDish, quantityScanner.nextInt());
                    break;
                }
            }
        }
    }

    private void orderDrinks(){
        boolean drinksOrdered = false;
        int drinksQuantity;

        System.out.println();
        System.out.println("Бажаєте замовити напої? y/n");

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        while (!drinksOrdered) {
            switch (answer) {
                case "y":
                    System.out.println("Скільки напоїв бажаєте замовити:");
                    drinksQuantity = scanner.nextInt();

                    selectDrinks(drinksQuantity);

                    drinksOrdered = true;
                    break;
                case "n":
                    drinksOrdered = true;
                    break;
                default:
                    System.out.println("Невірна відповіть, введить y/n");
                    answer = scanner.nextLine();
            }
        }
    }

    private void selectDrinks(int drinksQuantity){
        Scanner drinkScanner = new Scanner(System.in);

        for (int i = 0; i < drinksQuantity; i++) {
            while (true){
                System.out.println("Введіть назву напою:");

                String drinkName = drinkScanner.nextLine();
                Drinks orderedDrink = Drinks.getFromString(drinkName);

                if (orderedDrink == null){
                    System.out.println("Напій відсутній для вибору. Повторіть будбласка вибор.");
                } else {
                    Scanner quantityScanner = new Scanner(System.in);
                    System.out.println("Кількість напоїв:");
                    orderedDrinks.put(orderedDrink, quantityScanner.nextInt());
                    break;
                }
            }
        }
    }

    public int getTotal(){
        int orderTotal = 0;

        HashMap<Dishes, Integer> dishesPrice = Menu.getDishesList();
        HashMap<Drinks, Integer> drinksPrice = Menu.getDrinksList();

        for (Dishes dish:orderedDishes.keySet()) {
            orderTotal += dishesPrice.get(dish) * orderedDishes.get(dish);
        }

        for (Drinks drink:orderedDrinks.keySet()) {
            orderTotal += drinksPrice.get(drink) * orderedDrinks.get(drink);
        }

        return orderTotal;
    }
}
