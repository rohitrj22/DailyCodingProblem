// Given an integer array nums of size n, return the minimum number of moves required to make all array elements equal.

// In one move, you can increment or decrement an element of the array by 1.

// Test cases are designed so that the answer will fit in a 32-bit integer.

 

// Example 1:

// Input: nums = [1,2,3]
// Output: 2
// Explanation:
// Only two moves are needed (remember each move increments or decrements one element):
// [1,2,3]  =>  [2,2,3]  =>  [2,2,2]
// Example 2:

// Input: nums = [1,10,2,9]
// Output: 16

class Solution {
    public int minMoves2(int[] nums) {
        
        //Approach - 1
        Arrays.sort(nums);
        int n = nums.length;
        int mid = n/2,res=0;
        for(int i=0;i<n;i++)
        {
            res+=Math.abs(nums[i]-nums[mid]);
        }
        return res;
        
        // int res = Integer.MAX_VALUE;
        // int sum=0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     for(int j=0;j<nums.length;j++)
        //     {
        //         sum+=Math.abs(nums[i]-nums[j]);
        //     }
        //     res = Math.min(res,sum);
        //     sum=0;
        // }
        // return res;
        
    }
}
