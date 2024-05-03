package test;

import entite.*;

public class Main {

    public static void main(String[] args) {

        Animal a1=new Animal();
        a1.setFamily("Cats");
        a1.setName("lion");
        a1.setAge(2);
        a1.setMammal(true);
      //  System.out.println(a1);
       /* System.out.println(a1.age);
        System.out.println(a1.family);
        System.out.println(a1.name);
        System.out.println(a1.isMammal);

        Zoo myZoo=new Zoo("myZoo","tunis");
        //myZoo.displayZoo();

        //System.out.println(myZoo.toString());

//        System.out.println(myZoo.addAnimal(a1));
//        System.out.println(myZoo.addAnimal(a2));
//        System.out.println(myZoo.addAnimal(a1));
//        System.out.println(myZoo.addAnimal(a1));
        //System.out.println(myZoo.toString());
       // System.out.println(myZoo.searchAnimal(a2));
//        Zoo myZoo2=new Zoo("myZoo 2","sousse");
//        myZoo2.addAnimal(a2);
//        System.out.println(Zoo.comparerZoo(myZoo,myZoo2));
//hi


myZoo.getSwim();

    }
}
