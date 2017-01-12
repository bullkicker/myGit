/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerceapp;

/**
 *
 * @author ericafu
 */  
    
    import java.util.ArrayList;
    import java.util.Collections;

public class NumberSorting {
    public static void main(String[ ] args) {
       ArrayList<Integer> nums = new ArrayList<>();
       nums.add(10);
       nums.add(5);
       nums.add(6);
       nums.add(1);
       nums.add(12);
       nums.add(7);
        Collections.sort(nums);
        System.out.println(nums);
    }
}
   