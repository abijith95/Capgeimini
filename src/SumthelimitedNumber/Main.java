package SumthelimitedNumber;

import java.util.Scanner;

// a = 28,b = 31
// 2 + 8 + 2 + 9 + 3 + 0 + 3 + 1 = 28;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;
        for(int i=a;i<=b;i++)
        {
            ans += digitSum(i);
        }

        System.out.println(ans);
    }

    public static int digitSum(int a)
    {
        int sum = 0;
        while(a != 0)
        {
            int rem = a%10;
            sum = sum+rem;

            a = a/10;
        }

        return sum;
    }
}
