package edu.ArturKim.JavaSintax.task043;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Dream.HOBBY.toString());
        System.out.println(new Hobby().INDEX);
    }

    interface Desire {
    }

    interface Dream implements Hobby {
        public static Hobby HOBBY = new Hobby();
    }

    static class Hobby extends Desire, Dream {
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }

}

