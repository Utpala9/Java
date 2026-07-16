
//Array of class 
class Student extends Object
{
    int rollno;
    String name;
    
    public Student(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }

}


public class Array {

    
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
    
        Student students [] = new Student [3];
        Student [0]  = new Student(rollno : 4, name : "Tiya"); 
        Student [1]= new Student(rollno : 5, name : "Diya"); 
        Student [2]  = new Student(rollno : 6, name : "priya"); 
        // creating object of Student class and passing values to the constructor
        for (Student s : students) 
            {
            System.out.println(s.toString());
            }
    }
    
    
}
