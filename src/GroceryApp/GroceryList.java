package GroceryApp;

import java.util.ArrayList;
public class GroceryList {
    private ArrayList<GroceryItem> shoppingCart;

    public GroceryList() {
        shoppingCart = new ArrayList<>();
    }

    public GroceryList(GroceryItem item) {
        shoppingCart = new ArrayList<>();
        shoppingCart.add(item);
    }

    public void addItem(GroceryItem item) {
        shoppingCart.add(item);
    }

    public String sort() {
        ArrayList<GroceryItem> meatList = new ArrayList<>();
        ArrayList<GroceryItem> produceList = new ArrayList<>();
        ArrayList<GroceryItem> dairyList = new ArrayList<>();
        ArrayList<GroceryItem> otherList = new ArrayList<>();

        for (GroceryItem item : shoppingCart) {
            switch (item.getCata()) {
                case "meat" -> meatList.add(item);
                case "produce" -> produceList.add(item);
                case "dairy" -> dairyList.add(item);
                case "other" -> otherList.add(item);
            }
        }
        meatList.sort(GroceryItem::compare);
        produceList.sort(GroceryItem::compare);
        dairyList.sort(GroceryItem::compare);
        otherList.sort(GroceryItem::compare);

        StringBuilder sortList = new StringBuilder();
        for (GroceryItem groceryItem : meatList) {
            sortList.append(groceryItem.cartEntry()).append("\n");
        }
        for (GroceryItem groceryItem : produceList) {
            sortList.append(groceryItem.cartEntry()).append("\n");
        }
        for (GroceryItem groceryItem : dairyList) {
            sortList.append(groceryItem.cartEntry()).append("\n");
        }
        for (GroceryItem groceryItem : otherList) {
            sortList.append(groceryItem.cartEntry()).append("\n");
        }
        return sortList.toString();
    }
}
