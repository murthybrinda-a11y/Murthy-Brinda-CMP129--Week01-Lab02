import java.util.Scanner;

public class SalesBarChart 
{
    public static void main( String[] args)
    {
        int Numastricks ;
        int numOfStores;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter number of stores");
        numOfStores = keyboard.nextInt();
 // Arrays 
        int[] StoreArr = new int[numOfStores];
        int[] NumastricksArr = new int[numOfStores];
//Loop to ask numOfStores
        for(int i = 0 ; i < numOfStores; i++)
        {
            System.out.print("Enter today's sales for store " + (i+1) + " ");
            StoreArr[i] = keyboard.nextInt();
            NumastricksArr[i] = StoreArr[i]/100;
        }
        System.out.println("\nSALES BAR CHART\n ");
        System.out.print("Each * = 100\n");
// Loop to print everything
        for (int i = 0 ; i < numOfStores; i++)
        {
            System.out.print("Store " + ( i + 1)+  ": ");
            for(int k = 0; k < NumastricksArr[i]; k ++)
            {
                System.out.print("*");
            }
            System.out.print('\n');

        }  

        
    }
}
