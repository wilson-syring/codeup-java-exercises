package GroceryApp;

public class GroceryItem {
    private String name;
    private String category;
    private int quantity;
    private static String[] categories = {"Meat", "Produce", "Dairy"};

    public GroceryItem(String category, String name, int quantity) {
        this.category = category;
        this.quantity = quantity;
        this.name = name;
    }

    public int compare(GroceryItem x) {
        return this.name.compareTo(x.name);
    }

    public void setQuantity(int num) {
        this.quantity = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCata() {
        return this.category;
    }

    public String cartEntry() {
        StringBuilder itemEntry = new StringBuilder();
        itemEntry.append(name).append(" <-> ").append(category).append(" <-> ").append(quantity);
        return itemEntry.toString();
    }


}
