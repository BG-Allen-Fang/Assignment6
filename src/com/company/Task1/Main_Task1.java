package com.company.Task1;

public class Main_Task1 {

    public static void main(String[] args) {
        Creature vampire = new Creature(new FlyMagic(),new Walk());
        vampire.getStrategy();
        System.out.println("\n");

        Creature gryphon = new Creature(new Fly(),new Walk());
        gryphon.getStrategy();
        System.out.println("\n");

        Creature troll = new Creature(new Walk());
        troll.getStrategy();
        System.out.println("\n");

        Creature murloc = new Creature(new Walk(), new Swim());
        murloc.getStrategy();
        System.out.println("\n");

        Creature waterDragon = new Creature(new Walk(), new Swim(), new Fly());
        waterDragon.getStrategy();
        System.out.println("\n");

    }
}
