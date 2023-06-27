package org.demo.example.orders;
public enum Dishes {
    steak, chickenWings, fries, fish, salad, risotto;

    public static Dishes getFromString(String drinkName){
        for (Dishes dish:Dishes.values()){
            if (dish.name().equals(drinkName)){
                return dish;
            }
        }
        return null;
    }

    public static void getComponents(Dishes dish){
        switch (dish){
            case fish:
                System.out.println("Страва " + dish.name() + " робиться з карпа. Запікається в духовці.");
                break;
            case chickenWings:
                System.out.println("Страва " + dish.name() + " робиться з курячих крилець, маринованих у гірчиці та соевому соусі. Запікаеться на грилі.");
                break;
            case fries:
                System.out.println("Страва " + dish.name() + " робиться з картоплі. Вариться у фрітюрниці.");
                break;
            case salad:
                System.out.println("Страва " + dish.name() + " робиться з огірків, помідорів, цибулі, листя салату та сиру. Заправляється олією.");
                break;
            case steak:
                System.out.println("Страва " + dish.name() + " робиться з м`яса яловичини. Можливі різні рівні обжарки.");
                break;
            case risotto:
                System.out.println("Страва " + dish.name() + " робиться з рису та овочів.");
                break;
        }
    }
}
