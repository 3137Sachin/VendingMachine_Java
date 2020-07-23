/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignemnt02_csc225;

import java.util.Queue;
import java.util.Scanner;

/**
 * Mix Vending Machine Class that implements both IVendingMachineItems and IVendingMachine methods
 * @author sachin
 */
public class VendingMachineMix implements IVendingMachineItems, IVendingMachine<IVendingMachineItems>{
    
    protected Queue<IVendingMachineItems> itemone;
    protected Queue<IVendingMachineItems> itemtwo;
    protected Queue<IVendingMachineItems> itemthree;
    
    protected String VendorName = "Available Candy Items";
    protected double takemoney = 0;
    protected double givemoney = 0;
    
    public VendingMachineMix(){}
    public VendingMachineMix(Queue one, Queue two,Queue three){
        itemone=one;
        itemtwo=two;
        itemthree=three;
    }

    //Method that takes the money from the user
    
    @Override
    public void TakeMoney(Queue<IVendingMachineItems> oneitem){
        
        Scanner scan = new Scanner(System.in);
        System.out.println(" Do you want to use a Credit Card(a) or a Cash(b)? ");
        String options = scan.next(); 
        
        switch(options.toUpperCase()){
            case "B":
                System.out.println("Please insert cash!");
                double cash = scan.nextDouble();
                givemoney = cash;
                takemoney = oneitem.poll().getPrice();
                if(givemoney < takemoney){
                    System.out.println(" Insuffiicient fund, please add " + (givemoney - takemoney) + " $ more ");
                }else{
                    System.out.println("");
                }
                break;
            case "A":
                System.out.println("You have been charged with the following amount from your credit/debit card: " + oneitem.poll().getPrice());
                break;
            default:
                System.out.println("Input invalid!!");
                TakeMoney(oneitem);
                break;
                
    }
            
    }
    
    //Method that returns the money to the user
    
    public void ReturnMoney(IVendingMachineItems oneitem){
       if(givemoney > takemoney){
           double change = takemoney - givemoney;
           if(change!=0){
           System.out.println("Here's your change: $" + change);
           }
           
           System.out.println("$" + (givemoney - takemoney) + " Here is your remaining change ");
       }else{
       System.out.println(" Insufficient funds!! Please add $ " + (takemoney - givemoney) + " more ");
   }
   }
  
 //Queue method that vends the items
  
   public IVendingMachineItems VendItem(Queue<IVendingMachineItems> popItem){
       
       Queue<IVendingMachineItems> machine = popItem;
       String itemname  = machine.peek().getName();
       
       if(machine.size() > 1){
           //machine.poll();
           
           return machine.poll();
       }else if(popItem.size()==1){
           return popItem.remove();
           
       }else{
           //return "We are out of Stock!";
           return null;
       }
   }
   
   public String GetVendInfo(){
       return "Candy Machine";
   
   }
   @Override
   public void DisplayContents(Queue oneitem){
       Queue<IVendingMachineItems> displayitem = oneitem;
   if(displayitem.size()>0){
       System.out.println(displayitem.peek().getName() + " " + displayitem.size() + " " + displayitem.peek().getPrice());
   }else{
       System.out.println("We are out of Stock!! Sorry ;) ");
   } 
   }
   
   
    @Override
    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getPrice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPrice(double amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
  
   
    
}
