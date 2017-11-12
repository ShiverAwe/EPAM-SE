package com.epam.javaschool.shefer.chapter2.task6;

import com.epam.javaschool.shefer.chapter2.task7.Technic;

@Technic(type = "nuclear")
public class NuclearBoat {

    public static void main(String[] args) {
        NuclearBoat boat = new NuclearBoat();
        boat.move();
    }

    Engine engine = new Engine();

    public void move(){
        engine.start();
    }

    private class Engine{
        public void start(){
            System.out.println("brr brrrr br br brrr brrrr br");
        }
    }
}
