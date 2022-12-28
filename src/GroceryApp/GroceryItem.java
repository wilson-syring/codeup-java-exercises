package GroceryApp;

public class GroceryItem {
    private String name;
    private String category;
    private int quantity;
    private static String[] categories = {"Meat", "Produce", "Dairy", "Other"};

    public GroceryItem(String name, int quantity, String category) {

        this.quantity = quantity;
        this.name = name;
        this.category = category;
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
        return category;
    }

    public String cartEntry() {
        StringBuilder itemEntry = new StringBuilder();
        itemEntry.append(name).append(" <-> ").append(category).append(" <-> ").append(quantity);
        return itemEntry.toString();
    }


}
