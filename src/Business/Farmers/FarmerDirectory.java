/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Farmers;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Jagman
 */
public class FarmerDirectory {
    
    
    private ArrayList<Farmer> farmerList;

    public FarmerDirectory() {
        farmerList = new ArrayList<Farmer>();
    }

    public ArrayList<Farmer> getFarmerList() {
        return farmerList;
    }
    
    public Farmer createFarmer(){
        Farmer farmer = new Farmer();
        farmerList.add(farmer);
        return farmer;
    }
    
    public void deleteFarmer(Farmer farmer){
        farmerList.remove(farmer);
    }
    
        
}
