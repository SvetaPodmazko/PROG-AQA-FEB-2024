package org.prog.cars;

public class Tesla implements ICar {
    @Override
    public void goTo() {
        System.out.println("Tesla uses electricity");
    }

    @Override
    public void fillCar() {
        System.out.println("Tesla is charging...");
    }

 //   public void autoPilot() {
 //       System.out.println("Tesla is driving with autopilot");
 //   }

    @Override
    public void turnOnMusic() {
        System.out.println("Tesla turns on the music with his vois");}
}
