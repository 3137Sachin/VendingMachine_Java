/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignemnt02_csc225;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Main class of the vending machine
 * @author sachin
 */
public class Assignemnt02_CSC225 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
    
        //Add Pepsi, Coke , and Fanta in Soda vending machine using clone
        
        Soda Pepsi = new Soda("Pepsi",2.59);
        Soda Pepsi1 = Pepsi.Clone();
        Soda Pepsi2 = Pepsi.Clone();
        Soda Pepsi3 = Pepsi.Clone();
        Soda Pepsi4 = Pepsi.Clone();

        Soda Coke = new Soda("Coke",3.59);
        Soda Coke1 = Coke.Clone();
        Soda Coke2 = Coke.Clone();
        Soda Coke3 = Coke.Clone();
        Soda Coke4 = Coke.Clone();
        
        Soda Fanta = new Soda("Fanta",1.59);
        Soda Fanta1 = Fanta.Clone();
        Soda Fanta2 = Fanta.Clone();
        Soda Fanta3 = Fanta.Clone();
        Soda Fanta4 = Fanta.Clone();
        
        //Add Cheetos, Twinkies, and Muffin in Mix vending machine using clone
        
        Mix Cheetos = new Mix("Cheetos",2.89);
        Mix Cheetos1 = Cheetos.Clone();
        Mix Cheetos2 = Cheetos.Clone();
        Mix Cheetos3 = Cheetos.Clone();
        Mix Cheetos4 = Cheetos.Clone();
        
        Mix Twinkies = new Mix("Twinkies",5.00);
        Mix Twinkies1 = Twinkies.Clone();
        Mix Twinkies2 = Twinkies.Clone();
        Mix Twinkies3 = Twinkies.Clone();
        Mix Twinkies4 = Twinkies.Clone();
        
        Mix Muffin = new Mix("Muffin",2.00);
        Mix Muffin1 = Muffin.Clone();
        Mix Muffin2 = Muffin.Clone();
        Mix Muffin3 = Muffin.Clone();
        Mix Muffin4 = Muffin.Clone();
        
        
        ////Add Skittles, Snickers, and Toblerone in Candy vending machine using clone
        
        Candy Skittles = new Candy("Skittles",2.99);
        Candy Skittles1 = Skittles.Clone();
        Candy Skittles2 = Skittles.Clone();
        Candy Skittles3 = Skittles.Clone();
        Candy Skittles4 = Skittles.Clone();
        
        Candy Snickers = new Candy("Snickers",3.99);
        Candy Snickers1 = Snickers.Clone();
        Candy Snickers2 = Snickers.Clone();
        Candy Snickers3 = Snickers.Clone();
        Candy Snickers4 = Snickers.Clone();
        
        Candy Toblerone = new Candy("Toblerone",1.99);
        Candy Toblerone1 = Toblerone.Clone();
        Candy Toblerone2 = Toblerone.Clone();
        Candy Toblerone3 = Toblerone.Clone();
        Candy Toblerone4 = Toblerone.Clone();
        
          //Add Cheetos, Twinkies, and Muffin in Mix vending machine using clone
        
        Queue<IVendingMachineItems> CheetosBro = new LinkedList();
        CheetosBro.add(Cheetos);
        CheetosBro.add(Cheetos1);
        CheetosBro.add(Cheetos2);
        CheetosBro.add(Cheetos3);
        CheetosBro.add(Cheetos4);
        
        Queue<IVendingMachineItems> TwinkiesBro = new LinkedList();
        TwinkiesBro.add(Twinkies);
        TwinkiesBro.add(Twinkies1);
        TwinkiesBro.add(Twinkies2);
        TwinkiesBro.add(Twinkies3);
        TwinkiesBro.add(Twinkies4);
       
        Queue<IVendingMachineItems> MuffinBro = new LinkedList();
        MuffinBro.add(Muffin);
        MuffinBro.add(Muffin1);
        MuffinBro.add(Muffin2);
        MuffinBro.add(Muffin3);
        MuffinBro.add(Muffin4);
        
        ////Add Skittles, Snickers, and Toblerone in Candy vending machine using clone
        
        Queue<IVendingMachineItems> SkittlesBro = new LinkedList();
        SkittlesBro.add(Skittles);
        SkittlesBro.add(Skittles1);
        SkittlesBro.add(Skittles2);
        SkittlesBro.add(Skittles3);
        SkittlesBro.add(Skittles4);
        
        Queue<IVendingMachineItems> SnickersBro = new LinkedList();
        SnickersBro.add(Snickers);
        SnickersBro.add(Snickers1);
        SnickersBro.add(Snickers2);
        SnickersBro.add(Snickers3);
        SnickersBro.add(Snickers4);
       
        Queue<IVendingMachineItems> TobleroneBro = new LinkedList();
        TobleroneBro.add(Toblerone);
        TobleroneBro.add(Toblerone1);
        TobleroneBro.add(Toblerone2);
        TobleroneBro.add(Toblerone3);
        TobleroneBro.add(Toblerone4);
       
        //Add pepsi, coke , and Fanta in Soda vending machine using clone
        
        Queue<IVendingMachineItems> PepsiBro = new LinkedList();
        PepsiBro.add(Pepsi);
        PepsiBro.add(Pepsi1);
        PepsiBro.add(Pepsi2);
        PepsiBro.add(Pepsi3);
        PepsiBro.add(Pepsi4);
        
        Queue<IVendingMachineItems> CokeBro = new LinkedList();
        CokeBro.add(Coke);
        CokeBro.add(Coke1);
        CokeBro.add(Coke2);
        CokeBro.add(Coke3);
        CokeBro.add(Coke4);
       
        Queue<IVendingMachineItems> FantaBro = new LinkedList();
        FantaBro.add(Fanta);
        FantaBro.add(Fanta1);
        FantaBro.add(Fanta2);
        FantaBro.add(Fanta3);
        FantaBro.add(Fanta4);
       
       //Setting appropriate slots
        
    VendingMachineSoda soda = new VendingMachineSoda(PepsiBro, CokeBro, FantaBro);
    VendingMachineCandy candy = new VendingMachineCandy(SkittlesBro, SnickersBro, TobleroneBro); 
    VendingMachineMix  mix = new VendingMachineMix(CheetosBro, TwinkiesBro, MuffinBro);
    boolean check = true;
    boolean checkNew = true;
    String answer = "";
    while(check){
    
        //Main face of the user interface
   
        System.out.println(" ********** Please, you are welcome to Sachin's Vending Machine *********** ");
        System.out.println(" Please select your choice! ");
        System.out.println("(A)--------> Soda Machine");
        System.out.println("(B)--------> Candy Machine");
        System.out.println("(C)--------> Both kind");
        
        Scanner scan = new Scanner(System.in);
        String select = scan.next().toUpperCase();
        
        //Switching in between the cases
        
        if(select.equals("A")||select.equals("B")||select.equals("C"));
        
        switch(select){
            case "A": System.out.println(soda.GetVendInfo());
            System.out.println("(A)");
            soda.DisplayContents(PepsiBro);
            soda.DisplayContents(CokeBro);
            soda.DisplayContents(FantaBro);
                System.out.println("Please Select your drink: (A) , (B) , (C)");
                String subselect = scan.next().toUpperCase();
               
                
                switch(subselect){
                    case "A":soda.TakeMoney(PepsiBro);
                    System.out.println(soda.VendItem(PepsiBro));
                    System.out.println(" Please press Q to quit or press anything to make another order! ");
                    answer = scan.next().toUpperCase();
                    if(answer.equals(null)||answer.equals("Q")){
                        System.out.println(" Thank you for choosing Sachin's Vending machine!! Peace!");
                        check=false;
                    }
            break;
                 case "B":soda.TakeMoney(CokeBro);
                    System.out.println(soda.VendItem(CokeBro));
                    System.out.println(" Please press Q to quit or press anything to make another order! ");
                    answer = scan.next().toUpperCase();
                    if(answer.equals(null)||answer.equals("Q")){
                        System.out.println(" Thank you for choosing Sachin's Vending machine!! Peace!");
                        check=false;
                    }
            break;
                 case "C":soda.TakeMoney(FantaBro);
                    System.out.println(soda.VendItem(FantaBro));
                    System.out.println(" Please press Q to quit or press anything to make another order! ");
                    answer = scan.next().toUpperCase();
                    if(answer.equals(null)||answer.equals("Q")){
                        System.out.println(" Thank you for choosing Sachin's Vending machine!! Peace!");
                        check=false;
                    }
            break;
        }break;
            case "B": System.out.println(candy.GetVendInfo());
            System.out.println("(A)");
            candy.DisplayContents(SkittlesBro);
            candy.DisplayContents(SnickersBro);
            candy.DisplayContents(TobleroneBro);
                System.out.println("Please Select your Candy: (A) , (B) , (C)");
                String subselects = scan.next().toUpperCase();
               
                
                switch(subselects){
                    case "A":candy.TakeMoney(SkittlesBro);
                    System.out.println(candy.VendItem(SkittlesBro));
                    System.out.println(" Please press Q to quit or press anything to make another order! ");
                    answer = scan.next().toUpperCase();
                    if(answer.equals(null)||answer.equals("Q")){
                        System.out.println(" Thank you for choosing Sachin's Vending machine!! Peace!");
                        check=false;
                    }
            break;
                 case "B":candy.TakeMoney(SnickersBro);
                    System.out.println(candy.VendItem(SnickersBro));
                    System.out.println(" Please press Q to quit or press anything to make another order! ");
                    answer = scan.next().toUpperCase();
                    if(answer.equals(null)||answer.equals("Q")){
                        System.out.println(" Thank you for choosing Sachin's Vending machine!! Peace!");
                        check=false;
                    }
            break;
                 case "C":candy.TakeMoney(TobleroneBro);
                    System.out.println(candy.VendItem(TobleroneBro));
                    System.out.println(" Please press Q to quit or press anything to make another order! ");
                    answer = scan.next().toUpperCase();
                    if(answer.equals(null)||answer.equals("Q")){
                        System.out.println(" Thank you for choosing Sachin's Vending machine!! Peace!");
                        check=false;
                    }
            break;
        }break;
        case "C": System.out.println(mix.GetVendInfo());
            System.out.println("(A)");
            mix.DisplayContents(CheetosBro);
            mix.DisplayContents(TwinkiesBro);
            mix.DisplayContents(MuffinBro);
                System.out.println("Please Select your Item: (A) , (B) , (C)");
                String subselectss = scan.next().toUpperCase();
               
                
                switch(subselectss){
                    case "A":mix.TakeMoney(CheetosBro);
                    System.out.println(mix.VendItem(CheetosBro));
                    System.out.println(" Please press Q to quit or press anything to make another order! ");
                    answer = scan.next().toUpperCase();
                    if(answer.equals(null)||answer.equals("Q")){
                        System.out.println(" Thank you for choosing Sachin's Vending machine!! Peace!");
                        check=false;
                    }
            break;
                 case "B":mix.TakeMoney(TwinkiesBro);
                    System.out.println(mix.VendItem(TwinkiesBro));
                    System.out.println(" Please press Q to quit or press anything to make another order! ");
                    answer = scan.next().toUpperCase();
                    if(answer.equals(null)||answer.equals("Q")){
                        System.out.println(" Thank you for choosing Sachin's Vending machine!! Peace!");
                        check=false;
                    }
            break;
                 case "C":mix.TakeMoney(MuffinBro);
                    System.out.println(mix.VendItem(MuffinBro));
                    System.out.println(" Please press Q to quit or press anything to make another order! ");
                    answer = scan.next().toUpperCase();
                    if(answer.equals(null)||answer.equals("Q")){
                        System.out.println(" Thank you for choosing Sachin's Vending machine!! Peace!");
                        check=false;
                        break;
                                   }
                       }
                        
                            case "Q" : System.out.println(" Thank you for choosing Sachin's Vending machine!! Peace! ");
                        break;
                        
                        
         }
         
         }
                       
         
         
         
        {
                 System.out.println(" Please Enter a Valid Input! ");
                 }
              
                        
                        
         }      
    
        
    }   
