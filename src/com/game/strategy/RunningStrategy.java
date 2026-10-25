package com.game.strategy;

public class RunningStrategy implements MovementStrategy{
    @Override
    public void move(String playerName) {
        System.out.println(playerName + " is running fast. Speed: High. Stamina consumed: High.");
    }
}
