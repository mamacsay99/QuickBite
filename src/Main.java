import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //QuickBite
        /*
        itemName: data type for this array is string
        itemName: data type for this array is double
        itemPrices: data type for this array is boolean
         */
        // Initialize your scanner abj
         Scanner in = new Scanner(System.in);


        String[] itemName ={"pizza","shawarma","burger",};
        double[] itemPrices ={3.57,2.88,7.00};
        double[] itemAvailable ={true, true, false }https://github.com/mamacsay99/Java2.git;

        for (int i=0; i < itemName.length; i++){
            //check the availabilty of an item and print
            //sold out or available
            String check = null;
            if (itemAvailable[i]){
                check = "Available";
            } else {
                check = "sold out"
            }
            System.out.println(itemName[i]+" "+itemPrices[i]+" "+check);
            }
        /*
             pizza 300
             apple 250
             mango 100




         */
        }

    }
}
