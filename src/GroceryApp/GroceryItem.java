package GroceryApp;

public class GroceryItem {
    private String name;
    private int category;
    private int quantity;

    public void setCata(int num){
        this.category = num;
    }

    public GroceryItem(int category,String name,int quantity){
        this.category = category;
        this.quantity = quantity;
        this.name = name;
    }

    public GroceryItem(){
    }

    public void setQuantity(int num){
        this.quantity = num;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getCata(){
        return this.category;
    }


}
