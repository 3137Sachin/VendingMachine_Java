/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignemnt02_csc225;

import java.util.Queue;

/**
 *
 * @author sachin
 */
public interface IVendingMachine<E> {

    
public void TakeMoney(Queue<E> oneitem);

public void ReturnMoney(E oneitem);

public E VendItem(Queue<E> popItem);

public String GetVendInfo();

public void DisplayContents(Queue oneitem); 

}
