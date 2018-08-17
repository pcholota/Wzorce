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
public class Director {
    private Builder builder;
    
    public void setBuilder(Builder builder){
        this.builder=builder;
    }
    public House getHouse(){
        return builder.getHouse();
    }
    
    public void createHouse(){
        builder.newHouse();
        builder.buildType();
        builder.buildFloors();
        builder.buildArea();
        builder.buildCost();
    }
}
