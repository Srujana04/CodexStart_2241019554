/*Name: T Srisrujana
Regd no.: 2241019554
Problem statement link: https://cses.fi/problemset/task/1070*/

import java.util.*;
public class Q9_1070 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (n==2 || n==3){
            System.out.println("NO SOLUTION");
        }
        else {
            StringBuilder s=new StringBuilder();
            for (int i=2; i<=n; i=i+2){
                s.append(i).append(" ");
            }
            for (int i=1; i<=n; i=i+2){
                s.append(i).append(" ");
            }
            System.out.println(s);
        }
    }
}
