/*Name: T Srisrujana
Regd no.: 2241019554
Problem statement link: https://cses.fi/problemset/submit/1068/*/

import java.util.*;
public class Q1_1068 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        weirdAlgo(n);
        sc.close();
    }

    public static long weirdAlgo(long n){
        System.out.print(n+" ");
        if (n==1){
            return 1;
        }
        else {
            if (n%2==0){
                n=n/2;
            }
            else {
                n=(n*3)+1;
            }
            return weirdAlgo(n);
        }
    }
}


