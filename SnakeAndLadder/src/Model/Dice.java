package Model;

import java.util.Random;

public class Dice {
    public int rollDice() {
        return new Random().nextInt(6) + 1;
    }
}
