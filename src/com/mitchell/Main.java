package com.mitchell;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        String name;
        int i = 0;
        System.out.println("Welcome to the swag machine!");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter yo name nigga: ");
        name = s.nextLine();
        System.out.println("Hold up my nigga, we're generating your swag name");
        while(i <= 4){
            i++;
            System.out.println("///");
            Thread.sleep(1000);
        }
        System.out.println("It appears that your swag name would be: " + name + "swag");
    }
}
