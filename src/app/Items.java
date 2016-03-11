/*Reads file into object class
 Uses Arraylist instance var to add inventory and read into object
*/
package app;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;



public class Items {
    // define the array list header. Note that it is an instance variable
    public static ArrayList<Item> a= new ArrayList<Item>();
    public static ArrayList<Order> order=new ArrayList<Order>();
    //public static ArrayList<Inventory> inStock=new ArrayList<Inventory>();

//Item object variables for the inventory 
public void initItems() throws FileNotFoundException, IOException{
    if(a.size()>=1)
        a.clear();
    
    BufferedReader readItem=new BufferedReader(new FileReader("Product.csv"));
    
    String line=readItem.readLine();
    @SuppressWarnings("UnusedAssignment")
    StringTokenizer nextItem=null;
    
    Item index=new Item();
    a.add(index);
    while(line!=null){
        nextItem=new StringTokenizer(line, ",");
                
        while(nextItem.hasMoreTokens()){
            int productID=Integer.parseInt(nextItem.nextToken());
            String productName=nextItem.nextToken();
            double salePrice=Double.parseDouble(nextItem.nextToken());
            int quantity=Integer.parseInt(nextItem.nextToken());
            Item product=new Item(productID, productName, salePrice, quantity);
            a.add(product);
        
        
        line=readItem.readLine();
        }
    }
    
    readItem.close();
    
    /*Iterator loading=a.iterator();
    
    while(loading.hasNext()){
        Object item;
        item=loading.next();
        int itemID=((Item)item).getItemId();
        int inStock=inventoryMatch(itemID);
        ((Item)item).setQuantity(inStock);
        
    }*/

}

/*public void initInventory() throws FileNotFoundException, IOException{
    
    
    BufferedReader readInventory=new BufferedReader(new FileReader("Inventory.csv"));
    
    String line=readInventory.readLine();
    
    StringTokenizer nextItem;
    
    while(line!=null){
        nextItem=new StringTokenizer(line, ",");
        
        while(nextItem.hasMoreTokens()){
            int productID=Integer.parseInt(nextItem.nextToken());
            int quantity=Integer.parseInt(nextItem.nextToken());
            
            Inventory inventory=new Inventory(productID, quantity);
            inStock.add(inventory);
        
        line=readInventory.readLine();
    
        }
    }
    readInventory.close();

}*/
//adds an item to the array and then writes it to the file
    public void addItem(int id, String name, double price, int quantity){
        Item temp=new Item(id,name,price,quantity);
        a.add(temp);
        updateItemList(temp);
    }
    //Updates product.csv, used when adding a new inventory item to the file.
    public void updateItemList(Item i){
         try{
                String selection="%Jackscript%/Product.csv";
                if(selection!=null){

                    BufferedWriter fileWriter=new BufferedWriter(new FileWriter(selection,true));
        

                    //for (int i=0; i<a.size()-1; i++) {
                    String item =i.getItemId()+","+i.getItemName()+","+i.getSellingPrice()+","+i.getQuantity()+",";
                        fileWriter.write(item);
                   // fileWriter.append(System.getProperty("line.separator"));

                    //}
                    
 //closes buffered writer
            fileWriter.close();
            JOptionPane.showMessageDialog(null, "Export successful");
            }
            else
            {
            JOptionPane.showMessageDialog(null, "Program shit the bed");
            }
         
         }catch(FileNotFoundException io){
             JOptionPane.showMessageDialog(null, "An error has occurred.  Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
             
         }catch(IOException ioe){
             JOptionPane.showMessageDialog(null, "An error has occurred.  Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
             
         }catch(HeadlessException e){
             JOptionPane.showMessageDialog(null, "An error has occurred.  Please please try again.", "Error", JOptionPane.ERROR_MESSAGE);
             
         }finally
         {
         }
} 
//searches inventory
/*
public int inventoryMatch(int productID){
    Iterator iterate=inStock.iterator();
    int quantity=0;
    
     while(iterate.hasNext()){
                Object temp;
                temp=iterate.next();
                int itemId=((Inventory)temp).getItemID();
                if(itemId==productID){
                    
                        quantity=((Inventory)temp).getQuantityInStock();
                        
                    }
     }
    
    return quantity;
}*/
//sells item, updates inventory, and creates new order

public void sellAnItem(boolean shippingCharged, Item item, Customer customer, int quantityOrdered, double finalPrice){
    int customerID=customer.getCustomerID();
    int itemID=item.getItemId();
    int qoh=item.getQuantity();
    String type="in-store order";
    int postSaleUnits=qoh-quantityOrdered;
    item.setQuantity(postSaleUnits);
    if(shippingCharged){
            type="online order";
        }
        
    
    if(quantityOrdered>0&&itemID>0&&quantityOrdered>0){
            
        Order newOrder=new Order(customerID, itemID, quantityOrdered, finalPrice, type);
        order.add(newOrder);
    }    
    

}

    //gets price of order before additional fees
    public double getOrderPrice(Customer customer, Item item, int units){

            double finalCost;
            double pricePerItem=item.getSellingPrice();
            double preCost=units*pricePerItem;
            if(customer instanceof CreditCustomer){
                CreditCustomer cust=(CreditCustomer) customer;
                
                finalCost=preCost+(preCost*cust.getCREDIT_MARKUP());
            }
            else if(customer instanceof CashCustomer){
                CashCustomer custCash=(CashCustomer) customer;
                finalCost=preCost-(preCost*custCash.getCASH_DISCOUNT());
                
            }
            else{
                finalCost=0;
            }

        return finalCost;
    }
                    
//adds shipping
    
    public boolean addShipping(int position){
        boolean addShipping=false;
        if(position==2){
            addShipping=true;
        }
        return addShipping;
    }

   //displays a report of current inventory 
     public void itemReport() throws IOException{
         try{
                FileChooser fr=new FileChooser();
                fr.setVisible(false);
                String selection=fr.fileName();
                if(selection!=null){

                    BufferedWriter fileWriter=new BufferedWriter(new FileWriter(selection+".csv"));
        

                    String header=("ItemId,Item Name,Pieces in Store,SellingPrice,\n");
                    fileWriter.append(header);
                    for (int i=0; i<a.size()-1; i++) {
                        Item temp=a.get(i);
                        fileWriter.append(temp.toString());
                    fileWriter.append(System.getProperty("line.separator"));

                    }
                    
 //closes buffered writer
            fileWriter.close();
            JOptionPane.showMessageDialog(null, "Export successful");
            }
            else
            {
            JOptionPane.showMessageDialog(null, "Program shit the bed");
            }
         
         }catch(FileNotFoundException io){
             JOptionPane.showMessageDialog(null, "An error has occurred.  Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
             
         }catch(IOException ioe){
             JOptionPane.showMessageDialog(null, "An error has occurred.  Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
             
         }catch(HeadlessException e){
             JOptionPane.showMessageDialog(null, "An error has occurred.  Please please try again.", "Error", JOptionPane.ERROR_MESSAGE);
             
         }finally
         {
         }
}
          
     public String orderSummary(){
         
         int end=(order.size())-1;
         Order reviewedOrder=order.get(end);
         String orderSummary="\nCustomerID: "+reviewedOrder.getCustomerID()+
                 "\nItemID: "+reviewedOrder.getItemID()+"\nQuantity Ordered: "+reviewedOrder.getQuant()+"\nPrice: "+reviewedOrder.getTotalPrice()+
                 "\nOrder Type:"+reviewedOrder.getType();
         
         return orderSummary;
     }   
} 