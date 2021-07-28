package com.BridgeLabz;

public class InsertionShort {
    public static void main(String[] args) {
        String [] a={"shankar","disha","kalyani","sheetal","anupama","ankita"};
        String  temp;
        int j;
        for (int i=0; i<a.length; i++)
        {
            temp=a[i];
            j=i;
            while (j>0 && a[j-1].compareTo(temp)>0)
            {
                a[j]=a[j-1];
                j=j-1;

            }
            a[j]=temp;

        }
        for (int i=0; i<a.length; i++)
        {
            System.out.println(a[i]+" ");
        }
    }
}
