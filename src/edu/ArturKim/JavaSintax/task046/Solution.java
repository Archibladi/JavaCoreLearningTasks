package edu.ArturKim.JavaSintax.task046;

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(Matrix.NEO);
    }

    static class Matrix {
        public static DBObject NEO = new User().initializeIdAndName(1, "Neo");
    }

    interface DBObject {
        DBObject initializeIdAndName(long id, String name);
    }

    static class User {
        long id;
        String name;

        @Override
        public String toString() {
            return String.format("The user's name is %s, id = %d", name, id);
        }
    }
}
