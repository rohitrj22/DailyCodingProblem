// Good morning! Here's your coding interview problem for today.

// This problem was asked by Microsoft.

// A number is considered perfect if its digits sum up to exactly 10.

// Given a positive integer n, return the n-th perfect number.

// For example, given 1, you should return 19. Given 2, you should return 28.


import java.util.Scanner;



class PerfectNumber{
    public static int checkSum(int n)
    {
        int sum=0;
        for(int i=n;i>0;i=i/10)
        {
            sum = sum + i%10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int curr = 19;
        int count=0;
        while(true)
        {
            int res = checkSum(curr);
            if(res==10)
            {
                count++;
            }
            if(count==n)
            {
                System.out.println(curr);
                break;
            }
            else
                curr+=9;
        }

    }
}