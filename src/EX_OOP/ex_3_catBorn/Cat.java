package EX_OOP.ex_3_catBorn;

import java.util.Scanner;

public class Cat {
    String name;

    public Cat (String name) {
        this.name = name;
    }
    public int getCounterCatBorn(String name) {
        int counterCatBorn = 0;
        this.name = name;
        if (!(name.isEmpty())) {
            ++counterCatBorn;
        }
        return counterCatBorn;
    }

}
