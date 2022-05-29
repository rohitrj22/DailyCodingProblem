// Given n nodes labeled from 0 to n - 1 and a list of undirected edges (each edge is a pair of nodes), write a function to check whether these edges make up a valid tree.


// Example 1:

// Input: n = 5 edges = [[0, 1], [0, 2], [0, 3], [1, 4]]
// Output: true.


// Example 2:

// Input: n = 5 edges = [[0, 1], [1, 2], [2, 3], [1, 3], [1, 4]]
// Output: false.



public class GraphValidTree {
    public class UnionFind{
        private int root[];
        private int rank[];
        public int count;
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
        public boolean union(int x,int y)
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
                return true;
            }
            return false;
            
        }
       
    }
    public boolean validTree(int n, int[][] edges) {
        //System.out.println(edges.length);
        UnionFind uf = new UnionFind(n);
        if(n==1)
            return true;
        if(n>1 && edges.length==0)
            return false;
        for(int i=0;i<edges.length;i++)
        {
                if(!uf.union(edges[i][0],edges[i][1]))
                    return false;

        }
        return uf.count==1?true:false;

        // write your code here
    }
    
}
