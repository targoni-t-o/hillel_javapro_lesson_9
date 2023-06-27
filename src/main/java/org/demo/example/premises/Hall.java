package org.demo.example.premises;

import org.demo.example.Main;

import java.util.HashMap;
import java.util.Random;

public class Hall {
    private final HashMap<String, Boolean> tablesList = new HashMap<>();

    public Hall() {
        Random random = new Random();
        int tablesCount = Main.getRandomNumber(1, 7);

        for (int i = 1; i <= tablesCount; i++) {
            this.tablesList.put("Столик " + i, random.nextBoolean());
        }
    }

    public String getFreeTable(){
        for (String table : tablesList.keySet()) {

            if(tablesList.get(table)){
                return table;
            }
        }

        return "No free tables";
    }
}
