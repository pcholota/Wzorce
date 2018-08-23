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
public class BMWFactory implements IFactory{

    @Override
    public IHatchback fHatchback() {
        return new BMWHatchback();
    }

    @Override
    public ICoupe fCoupe() {
        return new BMWCoupe();
    }
    
}
