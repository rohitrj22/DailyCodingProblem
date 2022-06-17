// Given two strings word1 and word2, return the minimum number of operations required to convert word1 to word2.

// You have the following three operations permitted on a word:

// Insert a character
// Delete a character
// Replace a character
 

// Example 1:

// Input: word1 = "horse", word2 = "ros"
// Output: 3
// Explanation: 
// horse -> rorse (replace 'h' with 'r')
// rorse -> rose (remove 'r')
// rose -> ros (remove 'e')
// Example 2:

// Input: word1 = "intention", word2 = "execution"
// Output: 5
// Explanation: 
// intention -> inention (remove 't')
// inention -> enention (replace 'i' with 'e')
// enention -> exention (replace 'n' with 'x')
// exention -> exection (replace 'n' with 'c')
// exection -> execution (insert 'u')

class Solution {
    
    int dp[][];
    int solve(String word1, String word2, int m, int n)
    {
        if(m==0)
            return n;
        if(n==0)
            return m;
        if(dp[m-1][n-1]!=-1)
            return dp[m-1][n-1];
        int op1,op2,op3;
        if(word1.charAt(m-1)==word2.charAt(n-1))
            return dp[m-1][n-1]=solve(word1,word2,m-1,n-1);
        else
        {
        op1 = solve(word1,word2,m,n-1); //add
         op2 = solve(word1,word2,m-1,n); //remove
         op3 = solve(word1,word2,m-1,n-1); //replace
        }
         
        
        return dp[m-1][n-1]=1 + Math.min(op1,Math.min(op2,op3));
        
        
    }
    
    public int minDistance(String word1, String word2) {
        
        int m=word1.length();
        int n = word2.length();
        dp = new int[m][n];
        for(int a[]:dp)
        {
            Arrays.fill(a,-1);
        }
        return solve(word1,word2,word1.length(),word2.length());
        
    }
}
