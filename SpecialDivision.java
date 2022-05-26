// Good morning! Here's your coding interview problem for today.

// This question was asked by ContextLogic.

// Implement division of two positive integers without using the division, multiplication, or modulus operators. Return the quotient as an integer, ignoring the remainder.

import java.util.Scanner;
public class SpecialDivision{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(divide(a,b));
        
    }

    private static int divide(int a, int b) {

        if(b==0)
            return -1;
        if(a<b)
            return 0;
        else    
            return 1+divide(a-b,b);

    }


}