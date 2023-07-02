package org.demo.example.orders;
import org.demo.example.Main;
import java.util.HashMap;

public class Menu {

    private static final HashMap<Dishes, Integer> dishesList = new HashMap<>();
    private static final HashMap<Drinks, Integer> drinksList = new HashMap<>();


    public static void createMenu() {
        createDishesList();
        createDrinksList();

        System.out.println("Сьогоднішнє меню.");

        System.out.println("Страви:");
        for (Dishes dish:Dishes.values()) {
            System.out.println(dish.name() + " ціна: " + dishesList.get(dish));
        }

        System.out.println();
        System.out.println("Напої:");
        for (Drinks drink:Drinks.values()) {
            System.out.println(drink.name() + " ціна: " + drinksList.get(drink));
        }
    }

    public static HashMap<Dishes, Integer> getDishesList() {
        if (dishesList.size() == 0) createDishesList();
        return dishesList;
    }

    public static HashMap<Drinks, Integer> getDrinksList() {
        if (drinksList.size() == 0) createDrinksList();
        return drinksList;
    }

    private static void createDishesList(){
        for (Dishes dish:Dishes.values()) {
            dishesList.put(dish, Main.getRandomNumber(10, 50));
        }
    }

    private static void createDrinksList(){
        for (Drinks drink:Drinks.values()) {
            drinksList.put(drink, Main.getRandomNumber(5, 20));
        }
    }

}
