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
public class SelectionSort extends BaseSort
{ 
    /**
     * Constructor of QuickSort class
     * @param arrInt 
     */
    public SelectionSort(ArrayList<Integer> arrInt)
    {
        super(arrInt);
    }

    @Override
    public void run()
    {
        int length = this.arrInt.size();
        for (int i = 0; i < length - 1; i++) {
            int selection = i;
            for (int j = (i + 1); j < length; j++) {
                if (this.arrInt.get(selection) > this.arrInt.get(j)) {
                    this.swap(selection, j);
                    selection = j;
                }
            }
        }
    }
}
