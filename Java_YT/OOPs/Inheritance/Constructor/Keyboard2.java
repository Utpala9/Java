package OOPs.Inheritance.Constructor;

 class Keyboard2 { //Parent class (Super class)
    int keys ;
    String color; // instance variables: declared inside the class, outside any method (They can be used in any method of the class)

     public Keyboard2(){ // constructor is a special method which is used to initialize the object of the class
      //name of the constructore is same as the class name and it does not have any return type
       keys = 100;
       color = "Green";
       System.out.println("Keyboard constructor called");
    }


    public void pressed(){
        System.out.println("Signal sent" + color);
    }

    public void throwIt(){
        System.out.println("Got hit");
        keys = 85;
    }
}



class Demo {
    public static void main(String[] args){
        int num = 8; // primitives declared inside the method
      

        Keyboard2 obj;              // obj is a reference variable
        obj = new Keyboard2();      // () is the constructor, Keyboard is the class name

        //pele normal Keyboard  obj ; obj = new Keyboard(); // now we r using inheritance so we can use AdvKeyboard class to create object and access the methods of Keyboard class

        obj.pressed();
        obj.throwIt();
        

        System.out.println(obj.keys); // key is not a varianble of this method , therefore we need to use the object reference variable to access
    }
}