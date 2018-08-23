/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        String choose = "";
        int type = 2;
        Scanner read = new Scanner(System.in);
        
        System.out.println("Write BMW or Audi to choose your new Car: ");
        while(!choose.equals("BMW") && !choose.equals("Audi")){
            choose = read.nextLine();
            if(!choose.equals("BMW") && !choose.equals("Audi")){
                System.out.println("Something goes wrong! Try again.");
            }
        }
        System.out.println("Now choose type of car. If you want Hatchback press 0. If ypu want Coupe press 1");
        while(type!=0 && type!=1){
            type=read.nextInt();
            if(type!=0 && type!=1){
                System.out.println("Something goes wrong! Try again.");
            }
        }
        IFactory fac;
        IHatchback hatch;
        ICoupe coupe;
        if(choose.equals("BMW")){
           fac = new BMWFactory();
        }else{
           fac = new AudiFactory(); 
           
        }
        if(type==0){
                 hatch = fac.fHatchback();
                 hatch.displayCar();
            }else{
                coupe = fac.fCoupe();
                coupe.displayCar();
            }
        
    }
    
}
