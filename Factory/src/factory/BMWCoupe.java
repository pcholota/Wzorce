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
public class BMWCoupe implements ICoupe {
    private float engine;
    private int enginePower;
    
    public BMWCoupe(){
        engine=(float)3.5;
        enginePower=300;
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
        System.out.println("BMW (Coupe) have engine with capacity equals: "+engine+" and HP: "+enginePower+".");
    }
}
