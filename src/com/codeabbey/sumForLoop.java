package com.codeabbey;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by Mitchell on 3/30/2014.
 */
public class sumForLoop {

    public static void main(String[] args){
        boolean done = false;
        int n, i = 0;
        int[] intArray;
        Scanner s = new Scanner(System.in);
        n = s.nextInt(); //read number of values to add
        intArray = new int[n]; //initialize array with n number of values
        while(done == false){  //while loop runs i number of times
            intArray[i] = s.nextInt();
            i++;
            if(i == n){ //if i equals the number of integers in list, stop the loop
                done = true;
            }
        }

        int sum = IntStream.of(intArray).sum(); //new java 8 function for adding arrays
        System.out.println(sum);

    }

}
