package task011;

public class Solution {
    public static void main(String[] args) {
        Pet pet = new Cat();
        pet.setName("Я - кот");

        System.out.println(pet.getName());
    }

    public static class Pet {
        protected String name;

        public Pet() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    public static class Cat extends Pet {

    }
}
