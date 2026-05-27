package LOOPS;

public class ForLoop {

    public static void main(String []args)
    {
        // we can mention 3 statements in one loop
               //1. Initialization
                //2. Condition
                 //3. Increment/Decrement

        for(int i=1; i<=5; i++)         
        {
            System.out.println("its Monday" + i);
            System.out.println("its Tuesday" + i);
            System.out.println("its Wednesday" + i);
            System.out.println("its Thursday" + i);
            System.out.println("its Friday" + i);
            
            
            for (int j = 1; j <= 1; j++) //Nested for loop
                {
                    
                    System.out.println("Yey irs saturday n its a holiday" + i);
                    System.out.println("Yey irs sunday n its a holiday" + i);
                    
                }
        }
    }
    
}
