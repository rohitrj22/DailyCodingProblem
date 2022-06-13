class Solution {
    int dp[][];
    int solve(List<List<Integer>> triangle,int i,int j)
    {
        
        if(i==triangle.size() || j==triangle.size() )
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        int p1 = triangle.get(i).get(j) + solve(triangle,i+1,j);
        int p2 = triangle.get(i).get(j) + solve(triangle,i+1,j+1);
        return dp[i][j]=Math.min(p1,p2);
        
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        
        int n = triangle.size();
        dp = new int[n][n];
        for(int[] a:dp)            
            Arrays.fill(a,-1);
        return solve(triangle,0,0);
        
    }
}
