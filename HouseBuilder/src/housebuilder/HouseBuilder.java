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
public class HouseBuilder {

    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new set01();
        Builder builder2 = new set02();
        Builder builder3 = new set03();
        
        System.out.println("We can offer you 3 sets of houses.");
        System.out.println("Set nr 1");
        
        director.setBuilder(builder);
        director.createHouse();
        House house = director.getHouse();
        house.show_details();
        
        System.out.println("Set nr 2");
        
        director.setBuilder(builder2);
        director.createHouse();
        house=director.getHouse();
        house.show_details();
        
        System.out.println("Set nr 3");
        
        director.setBuilder(builder3);
        director.createHouse();
        house=director.getHouse();
        house.show_details();
    }
    
}
