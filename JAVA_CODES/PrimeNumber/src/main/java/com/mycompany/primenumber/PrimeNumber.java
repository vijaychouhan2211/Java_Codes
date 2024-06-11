package com.mycompany.primenumber;
import java.util.*;

public class PrimeNumber{
    public static void main(String args[]){
        int i, m;
        boolean flag= true;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        n = sc.nextInt();
        m=n/2;
        if(n==0||n==1){
            System.out.println(n+" Is Not a Prime Number");
        }else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println(n+" Not a Prime Number");
                    flag = false;
                    break;
                }
            } if(flag){
                    System.out.println(n+" Is a Prime Number");
                }
        }
    }
}
