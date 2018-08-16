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
abstract class Builder {
    protected House house;
    
    public void newHouse(){
        house = new House();
    }
    public House getHouse(){
        return house;
    }
    public abstract void buildType();
    public abstract void buildFloors();
    public abstract void buildArea();
    public abstract void buildCost();
}
