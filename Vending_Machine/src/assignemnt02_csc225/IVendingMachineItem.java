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
public class IVendingMachineItem implements IVendingMachineItems{
    
    protected String name="";
    protected double price=0;

    @Override
    public String getName() {
        return name;
        
    }

    @Override
    public void setName(String name) {
        this.name=name;
        
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double amount) {
        this.price=price;
        
    }
    
}
