// Given two strings word1 and word2, return the minimum number of steps required to make word1 and word2 the same.

// In one step, you can delete exactly one character in either string.

 

// Example 1:

// Input: word1 = "sea", word2 = "eat"
// Output: 2
// Explanation: You need one step to make "sea" to "ea" and another step to make "eat" to "ea".
// Example 2:

// Input: word1 = "leetcode", word2 = "etco"
// Output: 4


class Solution {
    int dp[][];
    int lcs(String word1, String word2,int m,int n)
    {
        if(m==0 || n==0)
            return 0;
        if(dp[m-1][n-1]!=-1)
            return dp[m-1][n-1];
        if(word1.charAt(m-1)==word2.charAt(n-1))
            return dp[m-1][n-1]=1 + lcs(word1,word2,m-1,n-1);
        else
            return dp[m-1][n-1]=Math.max(lcs(word1,word2,m,n-1),lcs(word1,word2,m-1,n));
    }
    public int minDistance(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();
        dp=new int[m][n];
        for(int a[]:dp)
            Arrays.fill(a,-1);
        return lcs(word1,word2,word1.length(),word2.length());
        
    }
}
