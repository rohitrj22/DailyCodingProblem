/*This problem was asked by Uber.

Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Follow-up: what if you can't use division? */

import java.util.*;
import java.io.*;

class Problem
{

    static  Integer[] solve(Integer arr[],int product)
    {
        
        for(int i=0;i<arr.length;i++)
            arr[i] = product/arr[i];
        return arr;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{

        Scanner sc = new Scanner(System.in);
        List<Integer> li = new ArrayList<Integer>();
        int product=1;
        while(sc.hasNextInt())
        {
            int num = sc.nextInt();
            product= product * num;
            li.add(num);
        }
        sc.close();
        int size = li.size();
        Integer arr[] = new Integer[size];
        arr = li.toArray(new Integer[0]);
        arr = solve(arr,product);
        for(Integer i: arr)
            System.out.print(i + " ");





         

	    
        
	   
	   
	
	    
		// your code goes here
	}
}
