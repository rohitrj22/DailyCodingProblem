/*Good morning! Here's your coding interview problem for today.

This problem was recently asked by Google.

Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

Bonus: Can you do this in one pass? */

import java.util.*;
import java.io.*;

class Problem
{
    Boolean solve(String [] strNums, Integer k)
    {
		Set <Integer> set= new HashSet<Integer>();
		for (int i = 0; i < strNums.length; i++) {
			Integer num = Integer.parseInt(strNums[i]);
			if(set.contains(k-num))
            	return true;
			else	
				set.add(num);
        }
		return false;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    	
		Problem p = new Problem();
	    BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        String[] strNums;
        strNums = bi.readLine().split(" ");
		Integer k = Integer.parseInt(bi.readLine());
		System.out.println(p.solve(strNums,k));
        
	   
	   
	
	    
		// your code goes here
	}
}
