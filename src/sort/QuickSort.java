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
public class QuickSort extends BaseSort
{ 
    /**
     * Constructor of QuickSort class
     * @param arrInt 
     */
    public QuickSort(ArrayList<Integer> arrInt)
    {
        super(arrInt);
    }

    @Override
    public void run()
    {
        // Setup for quick sort
        int left = 0, right = this.arrInt.size() - 1;
        
        // Run process
        this.runQuickSort(left, right);
    }
    
    /**
     * Process quick sort function
     * @param arrInt
     * @param left
     * @param right 
     */
    private void runQuickSort(int left, int right) 
    {  
        if (left >= right) {
            return;
        }
        
        int middle = (int) (left + (right - left) / 2);
        int i = left, j = right;
        while (i <= j) {
            while (this.arrInt.get(i) < this.arrInt.get(middle)) {
                i++;
            }
            
            while (this.arrInt.get(j) > this.arrInt.get(middle)) {
                j--;
            }
            
            if (i <= j) {
                this.swap(i, j);
                i++;
                j--;
            }
            
            if (left < j) {
                this.runQuickSort(left, j);
            }
            
            if (right > i) {
                this.runQuickSort(i, right);
            }
        }
    }
}
