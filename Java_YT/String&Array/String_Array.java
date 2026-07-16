
public class String_Array {

    public static void main(String args []){

        //String
        String S = "Tiya"; // String is a class in java  so its not a premitive data type like int, float, double etc. String is a class in java and we can create object of string class using new keyword or we can create string without new keyword also
       // strings are immutable , they cannot be changed once created , if we try to change the string then a new string will be created in the memory and the old string will be garbage collected
       // but strings can be made mutable by useing StringBuffer class in

       StringBuffer s =   new StringBuffer("Tiya"); // StringBuffer is a class in java which is used to create mutable strings , we can change the string using StringBuffer class
       s.append (str: "Dutta"); // append here is a method of StringBuffer class which is used to append the string at the end of the existing string

       System.out.println(s); // TiyaDutta
    
  }

} 