package LOOPS;

public class WhileLoop 
{
    /**
     * @param args
     */
    public static void main(String a[])
    {
        int i = 1;
        while(i<=5)
        {
            System.out.println("its Monday" + i);
            System.out.println("its Tuesday" + i);
            System.out.println("its Wednesday" + i);
            System.out.println("its Thursday" + i);
            System.out.println("its Friday" + i);
            
            
            int j = 1;
            while (j<=1) //Nested while loop
                {
                    
                    System.out.println("Yey irs saturday n its a holiday" + i);
                    System.out.println("Yey irs sunday n its a holiday" + i);
                    j++;
                }

            i++;
        }

        System.out.println("Ok Byeeee" + i);
    }

    
    
}
