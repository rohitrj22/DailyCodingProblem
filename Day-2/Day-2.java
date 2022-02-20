/*This problem was asked by Uber.

Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Follow-up: what if you can't use division? */

import java.util.*;

import javax.lang.model.util.ElementScanner14;

class Problem
{

    static  Integer[] solve(Integer arr[],int product,int flag)
    {
        
        for(int i=0;i<arr.length;i++)
        {
            if(flag>1)
                arr[i]=0;
            else if(flag==1 && arr[i]!=0)
                arr[i]=0;
            else if(flag==0)
            arr[i] = product/arr[i];
            else
                arr[i]=product;
        }
            
        return arr;
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
        arr = li.toArray(new Integer[0]);
        arr = solve(arr,product,flag);
        for(Integer i: arr)
            System.out.print(i + " ");
		// your code goes here
	}
}
