package OOPs.Inheritance.Encapsulation;


class Keyboard3 { //Parent class (Super class)
    private int keys;// this keys od instance variasble.
    private String color ; // instance variables: declared inside the class, outside any method (They can be used in any method of the class)
 
    public Keyboard3(){ // constructor is a special method which is used to initialize the object of the class
      //name of the constructore is same as the class name and it does not have any return type
       keys = 100;
       color = "Green";
       System.out.println("Keyboard constructor called");
    }
    
    // as they r private therefore the only way to access them is by using  methords ( so for each variable we will create getter and setter methods to access them from outside the class)
    public void setKeys(int keys) {
        this.keys = keys; // this represent the current object of the class.
        // this keys is of loacal variable  // this keyword is used to refer to the current object of the class
        // this.keys refers to the instance variable keys of the class, while keys refers to the parameter passed to the method
    }

    public int getKeys() {
        return this.keys;
    }

    public void setColor( String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void pressed(){
        System.out.println("Signal sent" + color);
    }

    public void throwIt(){
        System.out.println("Got hit");
        keys = 85;
    }

}

// encapsulation is the process of wrapping code and data together into a single unit. In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class. Therefore, it is also known as data hiding.
// In Encapsulation variable and method should be cloesly bineded , from outside no one should be directly be able to access the variable and method of the class. Therefore, we use private access modifier for variables and public access modifier for methods.


class Demo {
    public static void main(String[] args){
        int num = 8; // primitives declared inside the method
      

        Keyboard3 obj;              // obj is a reference variable
        obj = new Keyboard3();      // () is the constructor, Keyboard is the class name

        //pele normal Keyboard  obj ; obj = new Keyboard(); // now we r using inheritance so we can use AdvKeyboard class to create object and access the methods of Keyboard class

        obj.pressed();
        obj.throwIt();

        obj.setColor("Red"); // accessing this variale indirectly through methods(getter and setter methods) // as we r setting the color therefor used setColor method
        System.out.println(obj.getKeys()); // key is not a varianble of this method , therefore we need to use the object reference variable to access // here we wanna get methoud to get the value of keys variable therefore used getKeys
    }
}