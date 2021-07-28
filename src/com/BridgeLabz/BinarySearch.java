package com.BridgeLabz;

public class BinarySearch {
    public static void main(String[] args) {
        String [] arr={"shankar","disha","kalyani","sheetal","anupama","ankita"};
       String Search="kalyani";
        int li=0;
        int hi=arr.length-1;
        int mi=(li+hi)/2;
        while (li<=hi)
        {
            if(arr[mi].equals(Search))
            {
                System.out.println("element is at "+mi+"  index position");
                break;
            }
            else if(arr[mi].compareTo(Search)<0 )
            {
                li=mi+1;
            }
            else
            {
                hi=mi-1;
            }
            mi=(li+hi)/2;
        }
    }
}
