package com.codeabbey;

import java.util.Scanner;

/**
 * Created by Mitchell on 3/30/2014.
 */
public class minimumOfThree {

    public static void main(String[] args){
        int i = 0, z = 0;
        Scanner s = new Scanner(System.in);
        boolean done = false;
        boolean doneChecking = false;
        int[][] integers;
        int n = s.nextInt();
        integers = new int[n][3];
        while(done == false){
            integers[i][0] = s.nextInt();
            integers[i][1] = s.nextInt();
            integers[i][2] = s.nextInt();
            i++;
            if(i == n){
                done = true;
            }
        }

        while(doneChecking == false){
            int minimumFirst = Math.min(integers[z][0], integers[z][1]);
            int minimumSecond = Math.min(minimumFirst, integers[z][2]);
            System.out.print(minimumSecond + " ");

            z++;
            if(z == n){
                doneChecking = true;
            }
        }
    }

}
