
package OOPs.Inheritance.Polymorphism;

public class Keyboard4 { //Parent class (Super class)
    int keys = 100;
    String color = "White"; // instance variables: declared inside the class, outside any method (They can be used in any method of the class)

    public void pressed(){
        System.out.println("Signal sent" + color);
    }

    public void throwIt(){
        System.out.println("Got hit");
       
    }

    public void throwIt(int Keys){  // same method name but different parameters is called method overloading
        System.out.println("Got hit with " + Keys + " keys");
        // compile time polymorphism is achieved by method overloading because the method name is same but the parameters are different
    }


}

class AdvKeyboard extends Keyboard4 {  // child class (Subclass)
     // Inheritance can be achived by extend key word ... here we r performing inheritance of Keyboard class in AdvKeyboard class
    public void hitNum(){
        System.out.println(" sent number from advanced keyboard");
    }
     public void throwIt(){
        System.out.println("Got hit hard");
        keys = 85;
         // also known as run time polymorphism because the method name is same but the parameters are different
        //overriding the method of Keboard with the method of AdvKeyboard class ... this is called method overriding
    }

    // we can have sub class of sub class also known as multiple levels of inheritance
    // multiple inheritance is not possible in java due to ambiguity but we can achieve it by using interfaces
}

class Demo {
    public static void main(String[] args){
        int num = 8; // primitives declared inside the method
      

        AdvKeyboard obj;              // obj is a reference variable
        obj = new AdvKeyboard();      // () is the constructor, Keyboard is the class name
        // object is of advKyeboard class but the methods are called from the parent class 
        //pele normal Keyboard  obj ; obj = new Keyboard(); // now we r using inheritance so we can use AdvKeyboard class to create object and access the methods of Keyboard class

        // here if we change advkeyboard to keyboard then it will print got hit and that is called ploymorphism because the method of parent class is called instead of the method of child class(same thing different behaviour)
        
        obj.pressed();
        obj.throwIt(); //method calling will be depend upon whic object is being created ... here we r creating object of AdvKeyboard class so the method of AdvKeyboard class will be called instead of the method of Keyboard class
        // got hit hard is printed because the method of AdvKeyboard class is called instead of the method of Keyboard class due to method overriding
        obj.hitNum();

        System.out.println(obj.keys); // key is not a varianble of this method , therefore we need to use the object reference variable to access
    }
}