package CS102_PROJECT;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Faisal_Store {
    public static final String fileName = "inventory1.txt";
    
    public static void main(String[] args) {
       
        try {
            GroceryStore store = new GroceryStore(fileName);
            
        
        System.out.println("=======[ Welcome to Faisal's Market! ]=======");
        boolean goBack;
        while (true) {
            int choice = experience();
            switch (choice) {
                case 1:
                    goBack = store.StepsOfSale();
                    while(goBack != true){
                        goBack = store.StepsOfSale();
                    }
                    break;
                case 2:
                     goBack = store.KeepInventoryUpToDate();
                    while (goBack != true){
                        goBack = store.KeepInventoryUpToDate();
                    }
                    break;
               
                case 0:
                    System.out.println("Thank you very much for choosing Faisal's market... come again :)!");
                    System.exit(0);
            }
        }
        
         } catch (FileNotFoundException ex) {
            System.out.println("ERROR! Can not find inventory file");
            System.exit(0);
        }
    }

    public static int experience() {
        int options = 3;
        System.out.println("WELCOME TO FAISAL'S STORE. HOW MAY WE HELP YOU TODAY?");
        System.out.println("If you would like to start check out please press 1");
        
        System.out.println("If you wish to update inventory please press 2");
        System.out.println("To Exit please press 0");
        System.out.println("You can find us in Riyadh,Jeddah,and Dammam");
        System.out.print("-----------------Thank you!---------------------------- ");

        Scanner input = new Scanner(System.in);
        int choice = -1;
        while (choice < 0 || choice > options) {
            try {
            choice = input.nextInt();
            input.nextLine();
            if ((choice < 0 || choice > options)) {
                System.out.println("\nPlease enter a valid option" 
                        + options + " or 0 to Exit\n");
                break;
            }
             } catch (InputMismatchException e) {
                System.out.println("\nPlease enter a correct option (Numbers only)\n");
                break;
            }
        }
        return choice;
    }
}
