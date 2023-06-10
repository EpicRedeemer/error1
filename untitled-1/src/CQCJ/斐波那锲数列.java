package CQCJ;

import java.util.Scanner;

public class 斐波那锲数列 {
    public static int fib(int n) {
        int n1 = 1;
        int n2 = 1;
        int cur = 0;
        if (n == 1 || n == 2) {
            return 1;
        } else {
            for (int i = 3; i <= n; i++) {
                cur = n1 + n2;
                n1 = n2;
                n2 = cur;
            }
            return cur;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));

    }
}
