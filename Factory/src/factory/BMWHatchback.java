
package factory;

/**
 *
 * @author Patrick
 */
public class BMWHatchback implements IHatchback {
    private float engine;
    private int enginePower;
    
    public BMWHatchback(){
        engine=(float) 2.0;
        enginePower=150;
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
        System.out.println("BMW (Hatchback) have engine with capacity equals: "+engine+" and HP: "+enginePower+".");
    }
}
