package GroceryApp;

import util.Input;

import java.util.Scanner;

public class GroceryListApp {
    public static void main(String[] args) {
        Input cart = new Input(new Scanner(System.in));
        GroceryList groceries = new GroceryList();
        System.out.println("<########## My Groceries #########>");
        while(true){
            System.out.println("Would you like to add an item to the cart?");
            boolean addCart = cart.yesNo();
            if (addCart){
                boolean newItem = true;
                System.out.println("New item entry");
                while(newItem){
                    String itemName = cart.getString();
                    System.out.println("how many " + itemName+ " would you like to add");
                    int itemAmount = cart.getInt();
                    System.out.println("what kind of item is this: meat, dairy, produce, other");
                    String itemCata = cart.getString();
                    System.out.println("itemCata = " + itemCata);
                    groceries.addItem(new GroceryItem(itemName, itemAmount, itemCata));
                    System.out.println("Add another item to cart?");
                    newItem = cart.yesNo();
                    System.out.println("newItem = " + newItem);
                }
            }else{
                System.out.println("Thank you for using our app");
                return;
            }System.out.println("Creating the groceries list");
            System.out.println(groceries.sort());
        }
    }
}
