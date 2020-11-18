package task004;
public class Solution {    public static int min(int a, int b, int c) {
    int k = 0;
    if(a <= b && a <= c){
        k=a;
    }
    if(b <= c && b <= a){
        k=b;
    }
    if(c <= a && c <= b){
        k=c;
    }
    return k;
}

    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}
