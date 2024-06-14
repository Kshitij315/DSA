package algorithms.Searching;

import java.util.Scanner;

public class BinarySearch {

   static int binary_search(int a[],int start,int end,int key)

    {

        if( start<=end)

        {

            int mid=(start+end)/2;

            if(a[mid]==key)

                return mid;//found

            else

            {

                if(key<a[mid])

                    return binary_search(a,start,mid-1,key);//go to left

                else

                    return binary_search(a,mid+1,end,key);//go to right

            }

        }

        else

            return(-1);//not found

    }

    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70,80,90,100};
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number");
        int input=sc.nextInt();

      int result =binary_search(arr,10,100,input);
      if(result==-1)
          System.out.println("not found");

      else
          System.out.println("key is found at index: "+result);
    }
    void print_arr(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i]+",");
        }
    }


}


