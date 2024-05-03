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
*/
        Animal a2=new Animal("cats","tigre",3,true);
       /* System.out.println(a2.age);
        System.out.println(a2.family);
        System.out.println(a2.name);
        System.out.println(a2.isMammal);
*/

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

     //   Aquatique aqua1=new Aquatique("aqua 1","aqua name",3,true,"ocean");
        Dauphin dauph1=new Dauphin("dauphin 1","dauph",2,true,"ocean",1.2f);

        Pingouin pin1=new Pingouin("pin 1","pin",2,true,"ocean",1.2f);
      //  System.out.println(aqua1.toString());
        System.out.println(dauph1);
     //   aqua1.swim();
        dauph1.swim();
        pin1.swim();

       // myZoo.addAquaticAnimal(aqua1);
        myZoo.addAquaticAnimal(dauph1);
        myZoo.addAquaticAnimal(pin1);

myZoo.getSwim();

    }
}
