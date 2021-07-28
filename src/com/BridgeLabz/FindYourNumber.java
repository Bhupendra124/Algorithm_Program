package com.BridgeLabz;

import java.util.Scanner;

public class FindYourNumber {
    public static void main(String[] args) {
        System.out.println("Think of a numbers");
        Scanner scan=new Scanner(System.in);
        String x=null;
        String y=null;  //String becz i use equalsIgnorecase method
        String i=null;
        //get the input from the player
        System.out.println("Please Chose your max value ");
        if(scan.hasNext())
        {
            x=scan.next();
        }
        System.out.println("Please Chose your min value ");
        if(scan.hasNext())
        {
            y=scan.next();
        }
        int  max=Integer.parseInt(x);
        int  min=Integer.parseInt(y);

        boolean numberguessed=true;
        int numberofRound=0;
        while (numberguessed)
        {
            int midpoint=(max+min)/2;
            numberofRound++;
            System.out.println("is your number "+midpoint+"Please say too low or too high or correct");

            if (scan.hasNext())
            {
                i=scan.next();
            }
            if (i.equalsIgnoreCase("too high"))
            {
                min=midpoint;
            }
            if (i.equalsIgnoreCase("too low "))
            {
                max=midpoint;
                min=0;
            }
            if(i.equalsIgnoreCase("correct"))
            {
                System.out.println("the number of rounds in this game is "+numberofRound);
                break;

            }
        }
    }
}
