/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fboy;

import java.util.Scanner;

/**
 *
 * @author L408-S1
 */
public class Fboy {
        public static boolean contains(int[]a,int x){
         

           for (int c = 0; c < a.length; c++) {

            if (a[c] == x) {
                return true;
            }

        }
        return false;
 
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in); 
        System.out.println("insert a number");
        // String input 
        int n = sc.nextInt(); 
        int[] array = {6,7,8,9,10,11,12};
        boolean temp = contains(array, n);

        System.out.println(temp);
    }
        
        
    }
    

