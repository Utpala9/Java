package String_Array; 

// Array of class 
// class Student extends Object{
//     int rollno;
//     String name;
    
//     public Student(int rollno, String name){
//         this.rollno = rollno;
//         this.name = name;
//     }

// }




public class String_Array {

    public static void main(String args []){

        //String
        String S = "Tiya"; // String is a class in java  so its not a premitive data type like int, float, double etc. String is a class in java and we can create object of string class using new keyword or we can create string without new keyword also
       // strings are immutable , they cannot be changed once created , if we try to change the string then a new string will be created in the memory and the old string will be garbage collected
       // but strings can be made mutable by useing StringBuffer class in

       StringBuffer s =   new StringBuffer("Tiya"); // StringBuffer is a class in java which is used to create mutable strings , we can change the string using StringBuffer class
       s.append (str: "Dutta"); // append here is a method of StringBuffer class which is used to append the string at the end of the existing string

       System.out.println(s); // TiyaDutta


       //Array of premitive values
       int num1 [] = {8,6,7,1}; // arry with vales assigned to it
       int num2 [] = new int [5]; // array with size 5 but no values assigned to it
       num2[0] = 10;
       num2[1] = 20;
       num2[2] = 30;
       num2[3] = 40;
       num2[4] = 50;
    
       for (int i = 0; i < num1.length; i++){ // length is a property of array which gives the size of the array
        System.out.println(num1[i]); // printing the values of num1 array
        }

    for (int n : num2) { // in hanhansed for loop we can iterate through the array without using the index of the array
        System.out.println(n); 

        // this method is better bcz the traditional one can cause ArrayIndexOutOfBoundsException if we try to access the index which is not present in the array but in this method we can iterate through the array without using the index of the array so we can avoid ArrayIndexOutOfBoundsException
    }
    
  }

} 