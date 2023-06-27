package org.demo.example.orders;
public enum Drinks {
    coffee, tea, lemonade, mojito, mineralWater, cocaCola;

    public static Drinks getFromString(String drinkName){
        for (Drinks drink:Drinks.values()){
            if (drink.name().equals(drinkName)){
                return drink;
            }
        }
        return null;
    }

    public static void getComponents(Drinks drink){
        switch (drink){
            case coffee:
                System.out.println("Напой " + drink.name() + " робиться з кофейних зерен та гарачої води");
                break;
            case tea:
                System.out.println("Напой " + drink.name() + " робиться з заварки та гарачої води");
                break;
            case lemonade:
                System.out.println("Напой " + drink.name() + " робиться з лимонів, цукру та води");
                break;
            case mojito:
                System.out.println("Напой " + drink.name() + " робиться з спрайту, м`яти, лайму та льоду");
                break;
            case mineralWater:
                System.out.println("Напой " + drink.name() + " робиться з газированої води");
                break;
            case cocaCola:
                System.out.println("Напой " + drink.name() + " робиться з газированої водию цукру та коки");
                break;
        }
    }

}
