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
public class set02 extends Builder{

    @Override
    public void buildType() {
        house.setType("Studio flat");
    }

    @Override
    public void buildFloors() {
        house.setFloors(0);
    }

    @Override
    public void buildArea() {
        house.setArea(30);
    }

    @Override
    public void buildCost() {
        house.setCost(90000);
    }
    
}
