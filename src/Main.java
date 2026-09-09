import java.util.Arrays;
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


        String[] itemName = {"pizza","shawarma","burger",};
        double[] itemPrices = {3.57,2.88,7.00};
        boolean[] itemAvailable = {true, true, false };

        // add items to the Array using scanner class/object
        do {
            System.out.println("Are you adding?: Y or N"); // hint the user
            String userInput = in.next();

            if (userInput.equalsIgnoreCase(  "n")) break;
            System.out.print("Enter item name: ");
            String name = in.next();

            System.out.print("Enter item price: ");
            double price = in.nextDouble();

            System.out.println("Enter item status: ");
            boolean status = in.nextBoolean(); // true / false

            System.out.println("Name \t price \t status");
            System.out.println(name+ "\t" +price+ "\t" +status);

            // add new captured item to the store
            itemName = Arrays.copyOf(itemName, itemName.length+1);
            // Array is resized {"Burger", "Fries", "Soda", ""}
            itemName[itemName.length-1] = name;
            System.out.println(Arrays.toString(itemName));

        } while (true);


        for (int i=0; i < itemName.length; i++){
            //check the availabilty of an item and print
            //sold out or available
            String check = null;

            if (itemAvailable[i] == true){
                check = "Available";
            } else {
                check = "sold out";
            }
            System.out.println(itemName[i]+" "+itemPrices[i]+" "+check);
            }

            //Linear search by item name
            for (int i = 0; i < itemName.length; i++) {
                System.out.print("Enter the item name:__");
                String searchTerm = in.next();


                if (itemName[i].equalsIgnoreCase(searchTerm)) {
                    System.out.println(itemName[i] + "\t" + itemPrices[i] + "\t" + itemAvailable);
                } else {
                    System.out.println(searchTerm+ "not found");
                }

                }
            }
        /*
             pizza 300
             apple 250
             mango 100




         */
        }

    }
