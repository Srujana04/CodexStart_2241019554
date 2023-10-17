/*Name: T Srisrujana
Regd no.: 2241019554
Problem statement link: https://cses.fi/problemset/task/1083*/

import java.util.*;
public class Q2_1083 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long [] nums=new long [(int)n-1];
        long sum=0;
        for (int i=0; i<nums.length; i++){
            nums[i]=sc.nextLong();
            sum=sum+nums[i];
        }
        long total_sum=(n*(n+1))/2;
        System.out.println(total_sum-sum);
        sc.close();
    }
}
