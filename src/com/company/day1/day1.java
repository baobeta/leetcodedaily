package com.company.day1;

public class day1 {


    public static boolean isPalindrome(int n) {
        if(n<0|| (n%10==0&&n!=0)) {
            return false;
        }                                       //space O(1)
        int reverseNum = 0;                    // time  O(n)
        while(n>reverseNum) {    // duyet den mot nua thi dung
            int pop = n % 10;
            reverseNum = reverseNum * 10 + pop;
            n = n / 10;
        }
        return n == reverseNum || n == reverseNum/10;
    }

    public int trailingZeroesnotoptimize(int n) {
        long sum =1;
        for(int i=1;i<=n;i++) {    //time O(n)
            sum*=i;
        }
        int count =0;
        while(sum%10==0) {
            count++;
            sum=n/10;
        }
        return count;

    }
    public int trailingZeroes(int n) {
        // Mot so co so 0 tan cung se chi het cho 10, tuy nhien trong 1 day so
        // so 2 luon nhieu hon so 5
        //=> chi can dem so 5
        int count =0;
        while(n>0) {
            n=n/5;
            count+=n;
        }
        return count;

    }
    public static double myPow(double x, int n) {
        // Y tuong 2^14 = 2^2^7 =(4)^7= 4*4^6 = 4*(4*4)^3 = 4*16*16^2=4*16*(16*16)
        double ans =1.0;
        long num =n;
        if(n<0) {
            num= -1*num;
        }
        while(num>0) {
            if(num%2==0) {
                x=x*x;
                num=num/2;
            } else {
                ans= ans*x;
                num=num-1;
            }
        }
        if(n<0) {
            return (double)(1.0)/(double)(ans);
        }
        return ans;

    }

    public static void main(String[] args) {
        int n=121;
        System.out.println(isPalindrome(n));

    }
}
