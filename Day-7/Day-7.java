import javax.sound.sampled.SourceDataLine;

class Problem
{
    static int solve(String s, int n)
    {
        if(n<=0)
            return 1;
        int op1=0,op2=0;
         op1 = s.charAt(0)=='0'?0:solve(s.substring(1),n-1);

            
            if(n>=2)
            {
                int val = Integer.parseInt(s.substring(0,2));
                if(val>=1 && val<=26)
                   op2 = solve(s.substring(2),n-2);
            }

            return op1 + op2;


    }
    public static void main(String[] args) {
        System.out.println(solve("267" ,3));
    }
}