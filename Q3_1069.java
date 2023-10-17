/*Name: T Srisrujana
Regd no.: 2241019554
Problem statement link: https://cses.fi/problemset/task/1069*/

import java.util.*;
public class Q3_1069 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int count=1; int max=1;
        for (int i=1; i<s.length(); i++){
            if (s.charAt(i)==s.charAt(i-1)){
                count++;
                max=Math.max(max,count);
            }
            else{
                count=1;
            }
        }
        System.out.println(max);
        sc.close();
    }
}
