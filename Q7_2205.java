/*Name: T Srisrujana
Regd no.: 2241019554
Problem statement link: https://cses.fi/problemset/task/2205*/

import java.util.*;
public class Q7_2205 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0; i<((int)Math.pow(2,n)); i++){
            System.out.println(grayCode(i,n));
        }
        sc.close();
    }

    public static String grayCode(int num, int noOfBits){
        String [] b=new String [noOfBits];
        for (int i=0; i<noOfBits; i++){
            b[i]="0";
        }
        for (int i=noOfBits-1; i>=0; i--){
            b[i] = String.valueOf(num%2);
            num=num/2;
        }
        String [] g=new String [noOfBits];
        g[0]=b[0];
        for (int i=1; i<g.length; i++){
            g[i]=String.valueOf(Integer.parseInt(b[i-1])^Integer.parseInt(b[i]));
        }
        String s="";
        for (int i=0; i<g.length; i++){
            s=s+g[i];
        }
        return s;
    }
}
