package task003;
public class Solution {
    public static int min(int a, int b) {
        int k=0;
        if ( a <= b ){
            k=a;
        }
        else if ( a >= b){
            k=b;
        }
        return k;
    }

    public static void main(String[] args) {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));
    }
}
