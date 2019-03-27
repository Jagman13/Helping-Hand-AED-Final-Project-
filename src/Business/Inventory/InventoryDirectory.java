/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Inventory;

import java.util.ArrayList;

/**
 *
 * @author ira
 */
public class InventoryDirectory {
    
    private ArrayList<Inventory> inventoryList;

    public InventoryDirectory() {
        inventoryList = new ArrayList<Inventory>();
        
    }

    public ArrayList<Inventory> getInventoryList() {
        return inventoryList;
    }

    public void setInventoryList(ArrayList<Inventory> inventoryList) {
        this.inventoryList = inventoryList;
    }

    
    public Inventory createProduct(String category,String name, int quantity, int price){
        Inventory product= new Inventory();
        product.setCategory(category);
        product.setName(name);
        product.setQuantity(quantity);
        product.setPrice(price);
        inventoryList.add(product);
        return product;
    }
    
}
