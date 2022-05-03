import java.util.Scanner;

class PerfectNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = n*10 + (10-(n%10)-(n/10));
        System.out.println(res);

    }
}