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
public class House {
    String type;
    int floors;
    float cost;
    int area;
    
    public House(){
        floors=-1;
        cost=-1;
        area=-1;
        type=null;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public void setArea(int area) {
        this.area = area;
    }
    
    public void show_details(){
        System.out.println("Details of the House:");
        if(type!=null)  System.out.println("Type: "+type);
        if(area!=-1)  System.out.println("Area: "+area+" m^2");
        if(floors!=-1) System.out.println("Floors: "+floors);
        if(cost!=-1)  System.out.println("Cost: "+cost+" $.");
    }
}
