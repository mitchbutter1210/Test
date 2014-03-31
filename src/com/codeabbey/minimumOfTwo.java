package com.codeabbey;

import java.util.Scanner;

/**
 * Created by Mitchell on 3/30/2014.
 */
public class minimumOfTwo {

    public static void main(String[] args){
        int i = 0, z = 0;
        Scanner s = new Scanner(System.in);
        boolean done = false;
        boolean doneChecking = false;
        int[][] integers;
        int n = s.nextInt();
        integers = new int[n][2];
        while(done == false){
            integers[i][0] = s.nextInt();
            integers[i][1] = s.nextInt();
            i++;
            if(i == n){
                done = true;
            }
        }

        while(doneChecking == false){
            if(integers[z][0] > integers[z][1]){
                System.out.print(integers[z][1] + " ");
                z++;
            }

            //if(integers[z][0] < integers[z][1]){
              //  System.out.print(integers[z][0] + " ");
                //z++;
            //}

            else{
                System.out.print(integers[z][0] + " ");
                z++;
            }

            if(z == n){
                doneChecking = true;
            }
        }
    }

}
