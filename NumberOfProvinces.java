// There are n cities. Some of them are connected, while some are not. If city a is connected directly with city b, and city b is connected directly with city c, then city a is connected indirectly with city c.

// A province is a group of directly or indirectly connected cities and no other cities outside of the group.

// You are given an n x n matrix isConnected where isConnected[i][j] = 1 if the ith city and the jth city are directly connected, and isConnected[i][j] = 0 otherwise.

// Return the total number of provinces.

// Input: isConnected = [[1,1,0],[1,1,0],[0,0,1]]
// Output: 2


// Input: isConnected = [[1,0,0],[0,1,0],[0,0,1]]
// Output: 3





public class NumberOfProvinces {
    public class UnionFind{
        private int root[];
        private int rank[];
        private int count;
        UnionFind(int x)
        {
             root = new int[x];
             rank = new int[x];
            count=x;
            for(int i=0;i<x;i++)
            {
                root[i]=i;
                rank[i]=1;
            }
            
        }
        public int find(int x)
        {
            if(x==root[x])
                return x;
            return root[x] = find(root[x]);
        }
        public void union(int x,int y)
        {
            int rootX = find(x);
            int rootY = find(y);
            if(rootX!=rootY)
            {
                if(rank[rootX]>rank[rootY])
                    root[rootY] = rootX;
                else if(rank[rootY]>rank[rootX])
                    root[rootX] = rootY;
                else
                {
                    root[rootY]=rootX;
                    rank[rootX]+=1;
                }
                count--;
            }
            
        }
        public int countProvinces()
        {
            
            return count;
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected[0].length;
        UnionFind uf = new UnionFind(n);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(isConnected[i][j]==1)
                    uf.union(i,j);
            }
        }
        return uf.countProvinces();
        
        
    }
    
}
