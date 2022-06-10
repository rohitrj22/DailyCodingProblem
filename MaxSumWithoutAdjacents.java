// Given an array Arr of size N containing positive integers. Find the maximum sum of a subsequence such that no two numbers in the sequence should be adjacent in the array.

// Example 1:

// Input:
// N = 6
// Arr[] = {5, 5, 10, 100, 10, 5}
// Output: 110
// Explanation: If you take indices 0, 3
// and 5, then Arr[0]+Arr[3]+Arr[5] =
// 5+100+5 = 110.



import java.util.Arrays;

public class MaxSumWithoutAdjacents {

    int dp[];
    int solve(int[] arr,int n)
    {
        if(n<1)
            return 0;
        if(dp[n-1]!=-1)
            return dp[n-1];
        int op1 = arr[n-1]+solve(arr,n-2);
        int op2 = solve(arr,n-1);
        return dp[n-1]=Math.max(op1,op2);
    }
    public int rob(int[] nums) {
        dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return solve(nums,nums.length);
    }
    
}
