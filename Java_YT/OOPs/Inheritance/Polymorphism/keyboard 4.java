package OOPs.Inheritance.Polimorphisum;

package OOPs.Inheritance.Polymorphism;

public class Keyboard4 { //Parent class (Super class)
    int keys = 100;
    String color = "White"; // instance variables: declared inside the class, outside any method (They can be used in any method of the class)

    public void pressed(){
        System.out.println("Signal sent" + color);
    }

    public void throwIt(){
        System.out.println("Got hit");
        keys = 85;
    }
}

class AdvKeyboard extends Keyboard4 {  // child class (Subclass)
     // Inheritance can be achived by extend key word ... here we r performing inheritance of Keyboard class in AdvKeyboard class
    public void hitNum(){
        System.out.println(" sent number from advanced keyboard");
    }

    // we can have sub class of sub class also known as multiple levels of inheritance
    // multiple inheritance is not possible in java due to ambiguity but we can achieve it by using interfaces
}

class Demo {
    public static void main(String[] args){
        int num = 8; // primitives declared inside the method
      

        AdvKeyboard obj;              // obj is a reference variable
        obj = new AdvKeyboard();      // () is the constructor, Keyboard is the class name

        //pele normal Keyboard  obj ; obj = new Keyboard(); // now we r using inheritance so we can use AdvKeyboard class to create object and access the methods of Keyboard class

        obj.pressed();
        obj.throwIt();
        obj.hitNum();

        System.out.println(obj.keys); // key is not a varianble of this method , therefore we need to use the object reference variable to access
    }
}