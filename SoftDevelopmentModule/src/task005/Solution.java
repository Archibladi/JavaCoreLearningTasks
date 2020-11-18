package task005;

public class Solution {
    public static int min(int a, int b, int c, int d) {
      int k =0;
      if(a <= b && a <= c && a <= d){ k=a;}
      if(b <= a && b <= c && b <= d){ k=b;}
      if(c <= a && c <= b && c <= d){ k=c;}
      if(d <= a && d <= b && d <= c){ k=d;}

      return k;
    }

    public static int min(int a, int b) {
        return Math.min(a,b);

    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}
