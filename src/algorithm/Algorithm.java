/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

import java.lang.reflect.Method;
import java.util.*;
import sort.Manufacturing;

/**
 *
 * @author BeeBee
 */
public class Algorithm {
    
    int MIN_NUM = 0;
    int MAX_NUM = 10000000;
    int LENGTH = 200;
    
    /**
     * @param args the command line arguments
     * @throws java.lang.NoSuchMethodException
     * @throws java.lang.IllegalAccessException
     * @throws java.lang.reflect.InvocationTargetException
     */
    public static void main(String[] args) throws Exception 
    {
        Algorithm algorithm = new Algorithm();
        algorithm.runSort();
    }
    
    /**
     * Main function to run sort types
     * @throws java.lang.NoSuchMethodException
     * @throws java.lang.IllegalAccessException
     * @throws java.lang.reflect.InvocationTargetException
     */
    public void runSort() throws Exception
    {
        // Init array
        ArrayList<Integer> arrInt = this.initIntegerArray(this.LENGTH);
        this.printResult(arrInt, "Random", -1);
        
        // Create manufacturing instance
        Object[] args = new Object[1];
        args[0] = arrInt.clone();
        Manufacturing manufacturing = new Manufacturing(args);
        
        // Run sort action of list instance
        long startTime, endTime;
        double duration;
        for (sort.BaseSort sortInstance:manufacturing.getListInstanceSort()) {
            // Run process sort
            startTime = System.currentTimeMillis();
            sortInstance.run();
            endTime = System.currentTimeMillis();
            duration = (double) ((endTime - startTime));
            
            // Print result
            this.printResult(
                sortInstance.getResult(),
                sortInstance.getName(),
                duration
            );
        }
    }
    
    /**
     * Print integer array
     * @param arrInt 
     * @param sortType
     */
    public void printResult(ArrayList<Integer> arrInt, String sortType, double executeTime)
    {
        if (!sortType.isEmpty()) {
            System.out.println("Sort type: " + sortType);
            System.out.printf("Result: ");
        }
        
        for (int item:arrInt) {
            System.out.printf(String.valueOf(item) + " ");
        }
        
        if (executeTime > -1) {
            System.out.println();
            System.out.printf("Execute time: %sms", executeTime);
        }
        
        System.out.println();
        System.out.println();
    }
    
    /**
     * Get random integer
     * @param min
     * @param max
     * @return 
     */
    private int getRandom(int min, int max) 
    {
        return (int) (Math.random() * (max - min));
    }
    
    /**
     * Initial array number
     * @param lenArr
     * @return 
     */
    private ArrayList<Integer> initIntegerArray(int length) 
    {
        // Init param
        ArrayList<Integer> arrInt = new ArrayList(); 
        int i = 0;
        
        // Init array with random number
        while (i < length) {
            arrInt.add(this.getRandom(
                this.MIN_NUM,
                this.MAX_NUM
            ));
            i++;
        }
        
        return arrInt;
    }
}
