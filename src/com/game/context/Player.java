package com.game.context;

import com.game.strategy.MovementStrategy;

public class Player {
    private final String name;
    private MovementStrategy movementStrategy;

    public Player(String name, MovementStrategy movementStrategy){
        this.name = name;
        this.movementStrategy = movementStrategy;
    }

    public void setMovementStrategy(MovementStrategy movementStrategy){
        this.movementStrategy = movementStrategy;
    }

    public void travel() {
        movementStrategy.move(name);
    }
}
