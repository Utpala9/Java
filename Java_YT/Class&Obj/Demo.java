

class Calculator{

    int a ; // class can also have variables, here we are declaring an integer variable 'a' which can be used within the class

    public int add() //public : access; int : return type; add: method name (which will perform operation)

    {
        System.out.println("This is the add method");
        return 0; //return type is int so we have to return an integer value, here we are returning 0 as a placeholder
    }
}

public class Demo  //Class name: Demo (Class = Blueprint of Object)
{
    public static void main (String[] args) 
    {
        int num1 = 4;  // int (premitive data type)
        int num2 = 5; //Creating Object ;

        //int result = num1 + num2 ; 
        //System.out.println("The sum of num1 and num2 is: " + result);
    
        Calculator calc = new Calculator(); //( to cansume space its imp to creat obj)Creating an object of the Calculator class, 'calc' is the reference variable that holds the object
        //virtual object created in heap memory and 'calc' is pointing to that object
        calc.add(); // calling the add method using the object 'calc'
    }
        
}
//To creat obj : 1st mention class name  > refral variable name > new keyword > class constructor
//constructor is a special method that is used to initialize objects, it has the same name as the class and does not have a return type
// method is a block of code that performs a specific task, it can have a return type and can be called to execute the code within it
