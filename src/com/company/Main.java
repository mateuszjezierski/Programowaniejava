package com.company;

public class Main {

    public static void main(String[] args) {
	    Animal dog = new Animal("Canis");
	    dog.name = "Szarik";

	    Animal cat = new Animal("Felis");
	    cat.name = "Sierściuch";

        System.out.println(cat.species);

        System.out.println(dog.name);

        dog.feed();
        cat.feed();

        Human me = new Human();
        me.firstName = "Kacper";
        me.lastName = "Warda";
        me.pet = cat;

        System.out.println(me.firstName);
        System.out.println(me.pet.name);

        int a = 4;
        Integer aa = 4;

        double b = 2.3;
        Double bb = 2.3;

        long c = 321234;
        short d = 34;

    }
}
