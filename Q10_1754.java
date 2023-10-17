/*Name: T Srisrujana
Regd no.: 2241019554
Problem statement link: https://cses.fi/problemset/task/1754/*/

import java.util.*;
public class Q10_1754 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            long sum=a+b;
            a=Math.max(a,b);
            b=sum-a;
            StringBuilder s=new StringBuilder();
            if (a>2*b){
                s.append("NO");
            }
            else if (sum%3==0){
                s.append("YES");
            }
            else{
                s.append("NO");
            }
            System.out.println(s.toString());
        }
    }
}
