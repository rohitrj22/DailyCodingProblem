/*This problem was asked by Uber.

Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Follow-up: what if you can't use division? */

import java.util.*;

import javax.lang.model.util.ElementScanner14;

class Problem
{

    static  Integer[] solveWithDiv(Integer arr[],int product,int flag)
    {
        Integer output[] = new Integer[arr.length];
        
        for(int i=0;i<arr.length;i++)
        {
            if(flag>1)
                output[i]=0;
            else if(flag==1 && arr[i]!=0)
                output[i]=0;
            else if(flag==0)
            output[i] = product/arr[i];
            else
                output[i]=product;
        }
            
        return output;
    }
    static Integer[] solveWithoutDiv(Integer arr[])
    {

        
        int n = arr.length;
        Integer output [] = new Integer[n];
        int  right_prod=1;
        output[0]=1;
        for(int i=1;i<n;i++)
        {
            output[i] = output[i-1]*arr[i-1];
        }
        for(int i=n-2;i>=0;i--)
        {
            right_prod = right_prod * arr[i+1];
            output[i] = output[i]*right_prod;
        }


        return output;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{

        Scanner sc = new Scanner(System.in);
        List<Integer> li = new ArrayList<Integer>();
        int product=1,flag=0;
        while(sc.hasNextInt())
        {
            int num = sc.nextInt();
            if(num==0)
                flag++;
            else
                product= product * num;
            li.add(num);
        }
        sc.close();
        int size = li.size();
        Integer arr[] = new Integer[size];
        Integer output1[],output2[];
        arr = li.toArray(new Integer[0]);

        // by using division

         output1  = solveWithDiv(arr,product,flag);
        for(Integer i: output1)
            System.out.print(i + " ");
        System.out.println();

        // without using division



        output2 = solveWithoutDiv(arr); 
        for(Integer i: output2)
            System.out.print(i + " ");
		// your code goes here
	}
}
