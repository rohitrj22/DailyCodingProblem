// A permutation perm of n + 1 integers of all the integers in the range [0, n] can be represented as a string s of length n where:

// s[i] == 'I' if perm[i] < perm[i + 1], and
// s[i] == 'D' if perm[i] > perm[i + 1].
// Given a string s, reconstruct the permutation perm and return it. If there are multiple valid permutations perm, return any of them.


public class DiStringMatch {

    public int[] diStringMatch(String s) {
        
        int n=s.length();
       int res[] = new int[n+1];
       int k = 0,j=0,l=n;
       for(int i=0;i<n;i++)
       {
           if(s.charAt(i)=='I')
               res[k++] = j++;
           else
               res[k++] = l--;
       }
       res[k] = (s.charAt(n-1)=='D')?j:l;
       return res;
       
   }
    
}
