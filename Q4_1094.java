/*Name: T Srisrujana
Regd no.: 2241019554
Problem statement link: https://cses.fi/problemset/task/1094*/

import java.util.*;
public class Q4_1094 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        long [] nums=new long [(int)n];
        for (int i=0; i<n; i++){
            nums[i]=sc.nextLong();
        }
        long count=0;
        for (int i=1; i<n; i++){
            if (nums[i-1]>nums[i]){
                count=count+(nums[i-1]-nums[i]);
                nums[i]=nums[i-1];
            }
        }
        System.out.println(count);
        sc.close();
    }
}
