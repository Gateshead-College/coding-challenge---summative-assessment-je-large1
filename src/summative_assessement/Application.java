package summative_assessement;


import models.Clothes;

import javax.sql.RowSetWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    Scanner myScanner = new Scanner(System.in);
    ArrayList<Clothes> clothesArrayList = new ArrayList<>();


    public static void main(String[] args) {
        Application application = new Application();
        application.initialise();
        application.mainMenu();
        application.mainMenuChoice();
    }

    public void initialise() {

        clothesArrayList.add(new Clothes("Jackets", 2736, 130, 12));
        clothesArrayList.add(new Clothes("T-shirts", 7373, 30, 30));
        clothesArrayList.add(new Clothes("Shirts", 2726, 70, 25));
        clothesArrayList.add(new Clothes("Jeans", 2736, 45, 12));
        clothesArrayList.add(new Clothes("underwear", 8273, 40, 10));
        clothesArrayList.add(new Clothes("Socks", 7485, 12, 10));

    }

    void mainMenu() {
        System.out.println("Please see select an option:");
        System.out.println("1 - View products");
        System.out.println("2 - Update products");
        System.out.println("3 - Add a new product");
        System.out.println("4 - remove an existing item");
        System.out.println("5 - Exit");
    }

    private void displayItems() {
        System.out.println("Welcome to Large Apparel, please see the following items that we have in stock:");
        for (Clothes c : clothesArrayList) {
            System.out.println("ID:" + c.id + " - " + c.item + " - " + "Price:" + "£" + c.price + " - " + " Quantity:" + c.quantity);


        }


        int choice = Integer.parseInt(new Scanner(System.in).nextLine());
        handleChoice(choice);


    }


    void mainMenuChoice() {
        switch (Integer.parseInt(new Scanner(System.in).nextLine())) {
            case 1:
                displayItems();
                break;
            case 2:
                updateProduct();
                break;

            case 3:
                addProduct();
                break;

            case 4:
                removeProduct();
                break;

            case 5:
                exitApplication();
                break;

            default:
                System.out.println("Invalid input provided, please try again");
                break;
        }
    }

    private void exitApplication() {

    }


    private void removeProduct() {
        System.out.println("Please select the item you want to remove:");
        int count = 1;
        for (Clothes c : clothesArrayList) {
            System.out.println(count + " - " + c.getItem());
            count++;
        }
        int choice = Integer.parseInt(new Scanner(System.in).nextLine());
        clothesArrayList.remove(choice - 1);
        mainMenu();
        mainMenuChoice();
    }

    private void addProduct() {
        System.out.println("Please enter the product details.");
        System.out.println("ID: ");
        int productID = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println("Product Name: ");
        String productName = new Scanner(System.in).nextLine();
        System.out.println("Product Price : ");
        int productPrice = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println("Quantity in stock: ");
        int productQuantity = Integer.parseInt(new Scanner(System.in).nextLine());
        clothesArrayList.add(new Clothes(productName, productID, productPrice, productQuantity));
    }

    private void updateProduct() {
        System.out.println("Please enter the ID of the product you want to edit");
        int id = Integer.parseInt(new Scanner(System.in).nextLine());
        Clothes editProduct = null;
        for (Clothes c : clothesArrayList) {
            if (c.id == id) {
                editProduct = c;
                break;
            }
        }
        System.out.println("Which field do you want to change?");
        System.out.println("1 - ID");
        System.out.println("2 - Item");
        System.out.println("3 - Price");
        System.out.println("4 - Quantity");
        int choice = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println("Please enter the new value:");
        if (editProduct != null) {
            if (choice == 1) {
                editProduct.id = Integer.parseInt(new Scanner(System.in).nextLine());
            } else if (choice == 2) {
                editProduct.item = new Scanner(System.in).nextLine();
            } else if (choice == 3) {
                editProduct.price = Integer.parseInt(new Scanner(System.in).nextLine());
            } else if (choice == 4) {
                editProduct.quantity = Integer.parseInt(new Scanner(System.in).nextLine());
            } else {
                System.out.println("Invalid input provided, please try again.");
                editProduct();
            }
        }
    }

    private void handleChoice(int choice) {
        for (Clothes c : clothesArrayList) {
            if (c.getId() == choice) {
                System.out.println(c.item + "  " + c.price + "  " + c.id + "  " + c.quantity);

            }
        }

    }


    private void editProduct() {
    }
}



