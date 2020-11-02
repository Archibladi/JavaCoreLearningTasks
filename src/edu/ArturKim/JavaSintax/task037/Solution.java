package edu.ArturKim.JavaSintax.task037;

/*
Код сам не исправится
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Translator translator = new Translator();
        System.out.println(translator.translate());
    }

    public abstract static class Translator {
        public String translate() {
            return "Я переводчик с английского";
        }
    }
}