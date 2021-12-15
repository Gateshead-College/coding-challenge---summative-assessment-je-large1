package summative_assessement;

import models.Clothes;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    Scanner myScanner = new Scanner(System.in);
    ArrayList<Clothes> clothesArrayList = new ArrayList<>();



    public static void main(String[] args) {
        Application application = new Application();
        application.initialise();
        application.displayMenu();
    }

    public void initialise() {

        clothesArrayList.add(new Clothes("Jackets", 2736, 130, 12));
        clothesArrayList.add(new Clothes("T-shirts", 7373, 30, 30));
        clothesArrayList.add(new Clothes("Shirts", 2726, 70, 25));
        clothesArrayList.add(new Clothes("Jeans", 2736, 45, 12));
        clothesArrayList.add(new Clothes("underwear", 8273, 40, 10));
        clothesArrayList.add(new Clothes("Socks", 7485, 12, 10));

    }

    private void displayMenu() {
        System.out.println("Welcome to Large Apparel, please see the following items that we have in stock:");
        System.out.println("1 - Jackets");
        System.out.println("2 - T-shirts");
        System.out.println("3 -Shirts");
        System.out.println("4- Jeans");
        System.out.println("5 - Underwear");
        System.out.println("6 - Socks");
        System.out.println("Please enter the number of each item of stock to bring up the stock information");

        int choice = Integer.parseInt(new Scanner(System.in).nextLine());
        handleChoice(choice);


    }

    private void handleChoice(int choice) {
        switch (choice) {
            case 1:
                for (Clothes c : clothesArrayList) {
                    if (c.item.equalsIgnoreCase("jackets")) {
                        System.out.println(c.item + "  " + c.price + "  " + c.id + "  " + c.quantity);

                    }
                }
                break;
            case 2:
                for (Clothes c : clothesArrayList) {
                    if (c.item.equalsIgnoreCase("T-shirts")) {
                        System.out.println(c.item + "  " + c.price + "  " + c.id + "  " + c.quantity);
                    }
                }
                break;
            case 3:
                for (Clothes c : clothesArrayList) {
                    if (c.item.equalsIgnoreCase("Shirts")) {
                        System.out.println(c.item + "  " + c.price + "  " + c.id + "  " + c.quantity);
                    }
                }
                break;
            case 4:
                for (Clothes c : clothesArrayList) {
                    if (c.item.equalsIgnoreCase("Jeans")) {
                        System.out.println(c.item + "  " + c.price + "  " + c.id + "  " + c.quantity);
                    }
                }
                break;
            case 5:
                for (Clothes c : clothesArrayList) {
                    if (c.item.equalsIgnoreCase("Underwear")) {
                        System.out.println(c.item + "  " + c.price + "  " + c.id + "  " + c.quantity);
                    }
                }
                break;
            case 6:
                for (Clothes c : clothesArrayList) {
                    if (c.item.equalsIgnoreCase("Socks")) {
                        System.out.println(c.item + "  " + c.price + "  " + c.id + "  " + c.quantity);
                    }
                }
                break;

        }
    }
}
