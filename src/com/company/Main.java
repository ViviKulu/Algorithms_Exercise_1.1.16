package com.company;

public class Main {

    //    Give the value of exR1(6):
    //    public static String exR1(int n)
    //    {
    //        if (n <= 0) return "";
    //        return exR1(n-3) + n + exR1(n-2) + n;
    //    }

    //  Answer:

    //  311361142246

    public static void main(String[] args) {
        // write your code here
        int n = 6;
        exR1(n);
        System.out.println(exR1(n));
    }

    public static String exR1(int n) {
        if (n <= 0) return "";
        return exR1(n - 3) + n + exR1(n - 2) + n;
    }
}
