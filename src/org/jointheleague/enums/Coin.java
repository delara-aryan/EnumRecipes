package org.jointheleague.enums;

import java.util.HashMap;
import java.util.Map;

public enum Coin {

    PENNY(1), NICKEL(5), DIME(10), QUARTER(25);

    private final int value;

    Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    
    public static Map<Coin, Integer> getChange(int money) {
	Map<Coin, Integer> change = new HashMap<>();
	for (int i = 3; i >= 0; i--) {
	    Coin c = Coin.values()[i];
	    change.put(c, money/c.getValue());
	    money = money % c.getValue();
    }
	return change;
    }

}
