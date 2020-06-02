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
public class BubbleSort extends BaseSort
{ 
    /**
     * Constructor of QuickSort class
     * @param arrInt 
     */
    public BubbleSort(ArrayList<Integer> arrInt)
    {
        super(arrInt);
    }

    @Override
    public void run()
    {
        int length = this.arrInt.size();
        int i, j;
        for (i = (length - 1); i >= 0; i--) {
            for (j = 0; j < i; j++) {
                if (this.arrInt.get(j) > this.arrInt.get(j + 1)) {
                    this.swap(j, j + 1);
                }
            }
        }
    }
}
