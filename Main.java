package test;

import entite.*;

public class Main {

    public static void main(String[] args) {

        Animal a1=new Animal();
        a1.setFamily("Cats");
        a1.setName("lion");
        a1.setAge(2);
        a1.setMammal(true);
        System.out.println(a1);
        System.out.println(a1.age);
        System.out.println(a1.family);
        System.out.println(a1.name);
        System.out.println(a1.isMammal);

        Zoo myZoo=new Zoo("myZoo","tunis");

        //zokomodoré
        //last try 
        //si zebiii
        //3am zebi
 
        //dernebbou kataga
        myZoo.getSwim();

    }
}