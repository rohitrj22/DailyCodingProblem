// Good morning! Here's your coding interview problem for today.

// This problem was asked by Microsoft.

// Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

// For example, given [100, 4, 200, 1, 3, 2], the longest consecutive element sequence is [1, 2, 3, 4]. Return its length: 4.

// Your algorithm should run in O(n) complexity.


import java.util.*;

public class LongestConsecutiveSequence {

    public int solve(Map<Integer,Integer> map,Integer i)
    {
        if(map.containsKey(i))  
        {
            
            if(map.get(i)!=1)
            {
                return map.get(i);
            }
            int count = 1+solve(map,i+1);
            map.put(i,count);
            return count;
        }
        return 0;
    }
    public int longestConsecutive(int[] nums) {
        
        if(nums.length==0)
            return 0;
        
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],1);
        }
        int res =1;
        for(Integer i: map.keySet())
        {
            res= Math.max(res,solve(map,i));
        }
            
        
        return res;
        
    }
    
}
