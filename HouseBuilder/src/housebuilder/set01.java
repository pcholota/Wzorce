/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package housebuilder;

/**
 *
 * @author Patrick
 */
public class set01 extends Builder {
    
    @Override
    public void buildType() {
        house.setType("Apartament");
    }

    @Override
    public void buildFloors() {
        house.setFloors(2);
    }

    @Override
    public void buildArea() {
        house.setArea(250);
    }

    @Override
    public void buildCost() {
        house.setCost(750000);
    }
}
