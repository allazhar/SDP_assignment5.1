package com.game;

import com.game.context.Player;
import com.game.strategy.MovementStrategy;
import com.game.strategy.RunningStrategy;
import com.game.strategy.StealthStrategy;
import com.game.strategy.WalkingStrategy;

public class Main {
    public static void main(String[] args) {
        MovementStrategy walk = new WalkingStrategy();
        MovementStrategy run = new RunningStrategy();
        MovementStrategy stealth = new StealthStrategy();

        Player player = new Player("Allazhar", walk);
        player.travel();

        System.out.println("\n Player enters a dangerous zone ");
        player.setMovementStrategy(stealth);
        player.travel();

        System.out.println("\n Player is chased by monsters! ");
        player.setMovementStrategy(run);
        player.travel();
    }
}
