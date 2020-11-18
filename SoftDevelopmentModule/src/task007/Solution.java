package task007;

public class Solution{
    public  static int min(int a, int b){
     int k = 0;
     if( a <= b){
         k = a;
     }
     else k = b;
     return k;
    }
    public static long min(long al, long bl){
        long k =0;
        if( al <= bl){
            k = al;
        }
        else k = bl;
        return k;
    }
    public static double min(double a, double b){
        double k =0;
        if( a <= b){
            k = a;
        }
        else k = b;
        return k;
    }
    public static void main(String[] args) {
        System.out.println(min(23,432));
        System.out.println(min(23424l,432423l));
        System.out.println(min(23.312,432.131));
    }
}
