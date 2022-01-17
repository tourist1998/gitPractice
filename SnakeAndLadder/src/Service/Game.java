package Service;

import Model.Dice;
import Model.Player;

public class Game {
    public int playNextMove(Player player) {
        int playerCurrentPosition = player.getCurrent_cell();
        Dice dice = new Dice();
        int playerNewPosition = playerCurrentPosition + dice.rollDice();
        return playerNewPosition;
    }
}