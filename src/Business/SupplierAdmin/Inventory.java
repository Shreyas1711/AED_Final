/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SupplierAdmin;

/**
 *
 * @author Apoorva
 */
public class Inventory {
    String name;
    String manufacturer;
    Double price;
    int availability;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public Inventory(String name, String manufacturer, Double price, int availability) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.availability = availability;
    }

    @Override
    public String toString() {
        return  name ;
    }
    
    
    
    
}
