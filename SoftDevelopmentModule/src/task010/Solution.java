package task010;

public class Solution {
    public static void main(String[] args) {
    }

    private static  abstract class Pet {
        private String getName() {
            return "Я - котенок";
        }

        private Pet getChild() {
            return null;
        }
    }

}
