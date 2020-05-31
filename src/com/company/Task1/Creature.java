package com.company.Task1;

public class Creature {
    private MoveStrategy[] strategy;

    public Creature(MoveStrategy ... strategy){
        this.strategy = strategy;
    }

    public void getStrategy(){
        for (int i = 0; i < strategy.length; i++){
            strategy[i].move();
        }
    }
}
