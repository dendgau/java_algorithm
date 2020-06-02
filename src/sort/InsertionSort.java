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
public class InsertionSort extends BaseSort
{ 
    /**
     * Constructor of QuickSort class
     * @param arrInt 
     */
    public InsertionSort(ArrayList<Integer> arrInt)
    {
        super(arrInt);
    }

    @Override
    public void run()
    {
        int length = this.arrInt.size();
        int current, i, j;
        
        for (i = 1; i < length; i++) {
            current = this.arrInt.get(i);
            j = (i - 1);
            while (j >= 0 && current < this.arrInt.get(j)) {
                this.arrInt.set(j + 1, this.arrInt.get(j));
                j--;
            }
            this.arrInt.set(j + 1, current);
        }
    }
}
