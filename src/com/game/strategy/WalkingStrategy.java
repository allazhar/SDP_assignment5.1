package com.game.strategy;

public class WalkingStrategy implements MovementStrategy{
    @Override
    public void move(String playerName) {
        System.out.println(playerName + " is walking normally. Speed: Standard. Stamina consumed: low.");
    }
}
