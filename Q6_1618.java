/*Name: T Srisrujana
Regd no.: 2241019554
Problem statement link: https://cses.fi/problemset/task/1618*/

import java.util.*;
public class Q6_1618 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        if (n>0){
            while (n>0){
                n=n/5;
                count=count+n;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
