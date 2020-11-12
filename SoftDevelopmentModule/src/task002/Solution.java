package task002;

public class Solution {
    public static void main(String[] args) {
        Man man;
        Woman woman;
    }

    public static class Man {
        public int age;
        public int height;
        public Woman wife;
    }

    public static class Woman {
        public int age;
        public int height;
        public Man husband;
    }
}
