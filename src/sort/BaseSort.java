/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

import java.util.*;

/**
 * Base class for sort algorithm
 * @author BeeBee
 */
abstract public class BaseSort 
{
    /**
     * Store numbers in array
     */
    protected ArrayList<Integer> arrInt = new ArrayList<Integer>();
    
    /**
     * Store name of sort type
     */
    protected String sortName = "";
    
    /**
     * Constructor of SortBase class
     * @param arrInt 
     */
    BaseSort(ArrayList<Integer> arrInt, String sortName)
    {
        this.arrInt = new ArrayList<Integer>(arrInt);
        this.sortName = sortName;
        
        sortName = "con cac chung may";
    } 
    
    /**
     * Get list result after sort action is done
     * @return 
     */
    public ArrayList<Integer> getResult() 
    {
        return this.arrInt;
    }
    
    /**
     * Get name of sort type
     * @return 
     */
    public String getName()
    {
        return this.sortName;
    }
    
    /**
     * Run precess sort
     */
    abstract public void run();
}
