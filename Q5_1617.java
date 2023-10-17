/*Name: T Srisrujana
Regd no.: 2241019554
Problem statement link: https://cses.fi/problemset/task/1617*/

import java.util.*;
public class Q5_1617 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long ans=1;
        long mod=1000000007;
        for (long i=0; i<n; i++){
            ans=ans*2;
            ans=ans%mod;
        }
        System.out.println(ans);
        sc.close();
    }
}
