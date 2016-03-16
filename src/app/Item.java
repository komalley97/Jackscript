package app;

public class Item implements Comparable<Item>{
    private int itemId;
    private String itemName;
    private double sellingPrice;
    private int quantity;
    private int itemsSold;
    public Item(){};

    public Item(int itemId, String itemName, 
            double sellingPrice, int quantity, int itemsSold) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.sellingPrice = sellingPrice;
        this.quantity=quantity;
        this.itemsSold=itemsSold;
    }

    public int getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }
    public int setItemsSold(){
        return itemsSold;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }
    public int getQuantity(){
        return quantity;
    }
    public boolean inStock(){
        if(getQuantity()>0){
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public int compareTo(Item item) {
        if (this.getItemId() < item.getItemId()) {
            return -1;
        } else if (this.getItemId() > item.getItemId()) {
            return 1;
        } else {
            return 0;
        }
    }

    /**
     * @param itemId the itemId to set
     */
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    /**
     * @param itemName the itemName to set
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @param sellingPrice the sellingPrice to set
     */
    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString(){
        StringBuilder inventory=new StringBuilder();
        inventory.append(itemId);
        inventory.append(",");
        inventory.append(itemName);
        inventory.append(",");
        inventory.append(sellingPrice);
        inventory.append(",");
        inventory.append(quantity);
        inventory.append(",");
        inventory.append(itemsSold);
        inventory.append(",");
        return inventory.toString();
        
    }
}

