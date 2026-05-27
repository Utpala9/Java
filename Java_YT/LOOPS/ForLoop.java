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
            System.out.println("its Monday (work 9 to 5)" + " Week :" + i);
            System.out.println("its Tuesday (work 9 to 5)" + " Week :" + i);
            System.out.println("its Wednesday (work 9 to 5)" + " Week :" + i);
            System.out.println("its Thursday (work 9 to 5)" + " Week :" + i);
            System.out.println("its Friday (work 9 to 5)" + " Week :" + i);
            
            
            for (int j = 1; j <= 1; j++) //Nested for loop
                {
                    
                    System.out.println("Yey its saturday n its a holiday" + " Week :" + i);
                    System.out.println("Yey its sunday n its a holiday" + " Week :" + i);
                    
                }
        }
    }
    
}
