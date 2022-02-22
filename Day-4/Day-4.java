import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

// Good morning! Here's your coding interview problem for today.

// This problem was asked by Stripe.

// Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.

// For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.

// You can modify the input array in-place.

class Problem{

    int seperateNegatives(int [] arr)
    {
        int t,j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=0)
            {
                t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;

                j++;

            }
        }
        return j;
    }

    int findMissing(int [] arr,int size)
    {
            for(int i=0;i<size;i++)
            {
                int x = Math.abs(arr[i]);
                if(x-1<size && arr[x-1]>0)
                    arr[x-1] = -arr[x-1];

            }
        
            for(int i=0;i<size;i++)
            {
                if(arr[i]>0)
                    return i+1;
                
            }
            return size+1;
    }

    int solve(int [] arr)
    {
        

        int split = seperateNegatives(arr);

        int arr2[] = new int[arr.length - split];
        int j = 0;
        for (int i = split; i < arr.length; i++) {
            arr2[j] = arr[i];
            j++;
        }

        return findMissing(arr2,j);

    }
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        String str[] = sc.nextLine().split(" ");
        sc.close();
        int n = str.length;
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = Integer.parseInt(str[i]);
        }

        Problem p = new Problem();
        int res = p.solve(arr);
        System.out.println(res);
        
       


    }
}