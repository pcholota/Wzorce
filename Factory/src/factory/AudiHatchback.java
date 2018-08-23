/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author Patrick
 */
public class AudiHatchback implements IHatchback {
    private float engine;
    private int enginePower;
    
    public AudiHatchback(){
        engine=(float) 1.9;
        enginePower=125;
    }
    @Override
    public void engine(float cap) {
       engine = cap;
    }

    @Override
    public void power(int pow) {
        enginePower=pow;
    }

    @Override
    public void displayCar() {
        System.out.println("Audi (Hatchback) have engine with capacity equals: "+engine+" and HP: "+enginePower+".");
    }
}
