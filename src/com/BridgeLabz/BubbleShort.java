package com.BridgeLabz;

import java.util.Scanner;

public class BubbleShort {
    public static void main(String[] args) {
        int temp;
 Scanner s=new Scanner(System.in);
 int n =s.nextInt();
 int []list=new int[n];

 //user input
        for (int i=0; i<list.length; i++)
        {
            list[i]=s.nextInt();
        }

        //int[] list = {36, 19, 29, 12, 5};

//for number of round
        for (int i = 0; i < list.length; i++) {
            //flag to terminate loop
            int flag = 0;

            //here -i last element already shorted
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (list[j] > list[j + 1]) {
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    flag = 1;
                }

            }
            if (flag == 0) {
                break;
            }

        }
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " ");
        }


    }

}