public class CountAndSay {

    public String countAndSay(int n) {
        
        if(n==1)
            return "1";
        if(n==2)
            return "11";
        String res = countAndSay(n-1);
        StringBuilder  ret = new StringBuilder();
        char ch = res.charAt(0);
        int count=1;
        for(int i=1;i<res.length();i++)
        {
            if(res.charAt(i)==ch)
                count++;
            else
            {
                ret.append(String.valueOf(count) + ch);
                count=1;
                ch=res.charAt(i);
            }
            
        }
        ret.append(String.valueOf(count) + ch);
        return String.valueOf(ret);
        
        
    }
    
}
