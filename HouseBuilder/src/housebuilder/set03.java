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
public class set03 extends Builder {

    @Override
    public void buildType() {
        house.setType("Single-family house");
    }

    @Override
    public void buildFloors() {
       house.setFloors(1);
    }

    @Override
    public void buildArea() {
        house.setArea(120);
    }

    @Override
    public void buildCost() {
        house.setCost(310000);
    }
    
}
