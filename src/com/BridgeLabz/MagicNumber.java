package com.BridgeLabz;

import java.util.Random;
import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int min=0;
        int max=100;
        Random randomNum = new Random();
        int showMe = min + randomNum.nextInt(max);
        System.out.println(showMe);

        int guessNum=scan.nextInt();
        while (guessNum == showMe)
        {
            do {
                if (guessNum > showMe) {
                    System.out.println("number is too high " + guessNum);
                } else if (guessNum < showMe) {
                    System.out.println("number is too low  " + guessNum);

                } else if (guessNum == showMe) {
                    System.out.println("Correct guessing " + showMe);

                    break;

                }

            }
        }

    }
}
