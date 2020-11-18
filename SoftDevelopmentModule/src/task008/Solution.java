package task008;

public class Solution {
    public static void main(String[] args) {
        System.out.println(max(23,43));
        System.out.println(max(213314l,234242121l));
        System.out.println(max(432.234,23.123));
    }

    public static int max(int a,int b) {
        int k =0;
        if (a >= b){k=a;}
        else k=b;
        return k;
    }
    public static double max(double a,double b) {
        double k =0.0;
        if (a >= b){k=a;}
        else k=b;
        return k;
    }
    public static long max(long a,long b) {
        long k =0;
        if (a >= b){k=a;}
        else k=b;
        return k;
    }

}
