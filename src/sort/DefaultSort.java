/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

import java.util.*;

/**
 * Quick sort class
 * @author BeeBee
 */
public class DefaultSort extends BaseSort
{ 
    /**
     * Constructor of QuickSort class
     * @param arrInt 
     */
    public DefaultSort(ArrayList<Integer> arrInt)
    {
        super(arrInt);
    }

    @Override
    public void run()
    {
        Collections.sort(arrInt);
    }
}
