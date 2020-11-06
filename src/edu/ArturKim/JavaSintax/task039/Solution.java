package edu.ArturKim.JavaSintax.task039;

/*
Большая лисица — это такая лисица
*/

import java.awt.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        Fox bigFox = new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());

    }

    public interface Animal {
        Color getColor();
    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }

    public static class BigFox {
        public Color() {
            return Color.GRAY;
        }
    }

}
