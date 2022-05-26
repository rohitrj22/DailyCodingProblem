public class RunLengthEncoding {
    String encode(String str)
	{
	    int count=1;
	    char ch = str.charAt(0);
	    String res = "";
	    for(int i=1;i<str.length();i++)
	    {
	        if(str.charAt(i)==ch)
	        {
	            count++;
	        }
	        else
	        {
	            //System.out.println(ch);
	            res = res + count + ch;
	            ch =str.charAt(i);
	            count=1;
	        }
	    }
	    return res + count + ch;
          //Your code here
	}
}
