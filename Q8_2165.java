/*Name: T Srisrujana
Regd no.: 2241019554
Problem statement link: https://cses.fi/problemset/task/2165*/

import java.util.*;
public class Q8_2165 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int count=((int)Math.pow(2,n))-1;
       System.out.println(count);
       toh(n,1,3,2);
       sc.close();
    }
    public static void toh(int n, int s, int d, int h) {
        if (n == 1) {
            System.out.println(s+" "+d);
            return;
        }
        toh(n - 1, s, h, d);
        System.out.println(s+" "+d);
        toh(n - 1, h,d,s);
    }
}
