// Good morning! Here's your coding interview problem for today.

// This problem was asked by Microsoft.

// A number is considered perfect if its digits sum up to exactly 10.

// Given a positive integer n, return the n-th perfect number.

// For example, given 1, you should return 19. Given 2, you should return 28.


import java.util.Scanner;



class PerfectNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = n*10 + (10-(n%10)-(n/10));
        System.out.println(res);

    }
}