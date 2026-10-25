package com.game.strategy;

public class StealthStrategy implements MovementStrategy{
    @Override
    public void move(String playerName) {
        System.out.println(playerName + " is crouching in stealth mode. Speed: Low. Undetectable by enemies.");
    }
}
