
public class Patterns 

{
    public static void main( String[] args)
    {
        System.out.println("------------------------------");
        System.out.println("          Pattern A           ");
        System.out.println("------------------------------");

        //Pattern A
        for(int i = 1 ; i <= 10; i++)
        {
            System.out.println("");
            for (int k = 1; k <= i; k++) 
            {
                System.out.print("+"); 
            }
        }
        System.out.println();
        
        //Pattern B    
        System.out.println("------------------------------");
        System.out.println("          Pattern B           ");
        System.out.println("------------------------------");

         for(int i = 10 ; i >= 1; i--)
        {
            System.out.println("");
            for (int k = 1; k <= i; k++) 
            {
                System.out.print("+"); 
            }
        }
        System.out.println();




    }

    
}
