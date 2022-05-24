import java.util.ArrayList;
import java.util.List;

public class Stack {

    private int max;
    int stack[],top=-1,capacity;
    Stack(int n){
        this.capacity=n;
        this.stack = new int[n];
    }
    void push(int x){
        if(top==-1)
        {
            max=x;
            stack[++top]=x;
            return;
        }
        if (x > max)
        {
            stack[++top] = 2*x-max;
            //s.push(2 * x - maxEle);
            max = x;
        }
 
        else
            stack[++top]=x;
        

    }
    Integer pop()
    {
        if(top==-1)
            return null;
        int y = stack[top--];
        if(y>max)
        {
            int ret =  max;
             max=2*max-y;
             return ret;
             
        }
        else
            return y;
    }
    Integer max()
    {


        if (top==-1)
        {
            System.out.print("Stack is empty\n");
            return null;
        }
           
 
        // variable maxEle stores the maximum element
        // in the stack.
        else
            return max;

    }

    public static void main(String[] args) {
        Stack st = new Stack(5);
        st.push(2);
        st.push(4);
        st.push(10);
        st.push(0);
        st.push(1);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        // st.pop();
        // st.pop();
        
    }
    
}
