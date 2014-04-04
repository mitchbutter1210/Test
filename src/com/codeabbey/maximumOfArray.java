package com.codeabbey;

import java.util.Scanner;

/**
 * Created by Mitchell on 4/4/2014.
 */
public class maximumOfArray {

    public static void  main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] numArray;
        numArray = new int[300];
        int maxNum = -10000, x =300, n = 0, minNum = 10000;
        while(x != n){
            numArray[n] = s.nextInt();
            if(numArray[n] > maxNum){
                maxNum = numArray[n];
            }
            if(numArray[n] < minNum){
                minNum = numArray[n];
            }
            n++;
        }

        System.out.print(maxNum + " " + minNum);


    }
}
