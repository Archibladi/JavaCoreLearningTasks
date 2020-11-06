
package edu.ArturKim.JavaSintax.task032;

public class Solution {

    public static void main(String[] args) {

        System.out.println(new Dream().HOBBY.toString());
        System.out.println(new Hobby().toString());

    }

    interface Desire {
    }

    interface Dream {
        private static Hobby HOBBY = new Hobby();
    }

    class Hobby extends Desire implements Dream {
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }

}

