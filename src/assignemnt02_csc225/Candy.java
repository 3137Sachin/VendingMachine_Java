/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignemnt02_csc225;

/**
 *
 * @author sachin
 */

public class Candy implements IVendingMachineItems{
    
    private String name = "";
    private double price = 0;
    
    public Candy(){
    }

    public Candy(String name, double price){
    setName(name);
    setPrice(price);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    //Clone method to copy the number of candies
    public Candy Clone(){
        return new Candy(name,price);
    }
    
    
    
    
    
}