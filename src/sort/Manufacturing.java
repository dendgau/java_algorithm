/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

import java.util.*;

/**
 * Manufacturing for sort class
 * @author BeeBee
 */
public class Manufacturing 
{
    /**
     * Store list instance of sort type
     */
    private ArrayList<BaseSort> listSortInstance;
    
    /**
     * Store list name of sort type
     */
    private String[] SORT_TYPE = {
        "QuickSort",
        "BubbleSort",
        "SelectionSort",
    };
    
    /**
     * Constructor of Manufacturing class
     * @param params
     * @throws Exception 
     */
    public Manufacturing(Object[] params)
    {
        this.listSortInstance = new ArrayList<>();
        for (String item:this.SORT_TYPE) {
            try {
                // Create new instance by name of class
                Object instance = Class.forName("sort." + item).getConstructor(ArrayList.class).newInstance(params);

                // Add below instance to list object
                this.listSortInstance.add((BaseSort) instance);
            } catch (Exception e) {
                System.out.printf("ERROR: Can not create new instance for %s class", item);
                System.out.println();
                System.out.println();
            }
        }
    }
    
    /**
     * Return list instance of sort class
     * @return 
     */
    public ArrayList<BaseSort> getListInstanceSort()
    {
        return this.listSortInstance;
    }
}
