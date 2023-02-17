/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package magnottajoshproject1.book;

import java.util.ArrayList;

/**
 *
 * @author jmhee
 */
public class DVDs {
    
    private ArrayList<String> DVDName = new ArrayList<>();
    private ArrayList<Double> DVDPrice = new ArrayList<>();
    private ArrayList<Integer> DVDCopies = new ArrayList<>();
    private ArrayList<String> DVDCompany = new ArrayList<>();
    private ArrayList<Integer> DVDHolds = new ArrayList<>();
    private String company;
    private String name;
    private Double price;
    private Integer copies;
    
    public DVDs() {
    
    }
    
    public DVDs(String name, String company, Double price, Integer copies) {
        
        this.name = name;
        this.company = company;
        this.price = price;
        this.copies = copies;
        
    }
    
    // add DVD
    public void addDVD(String name, String company, Double price, Integer copies) {
        DVDName.add(name);
        DVDCompany.add(company);
        DVDPrice.add(price);
        DVDCopies.add(copies);
        DVDHolds.add(0);
    }
    
    public void addDVD(int index, String name, Double price, Integer copies) {
        DVDName.add(index, name);
        DVDCompany.add(index, company);
        DVDPrice.add(index, price);
        DVDCopies.add(index, copies);
        DVDHolds.add(0);
    }
    
    
    // get entire arraylist
    public ArrayList<String> getDVDName() {
        return DVDName;
    } 
    
    public ArrayList<Double> getDVDPrice() {
        return DVDPrice;
    }
    
    public ArrayList<Integer> getDVDCopies() {
        return DVDCopies;
    } 
    
    public ArrayList<String> getCompanyName() {
        return DVDCompany;
    }
    
    //get certain DVD
    public String getDVDName(int i) {
        return DVDName.get(i);
    } 
    
    public Double getDVDPrice(int i) {
        return DVDPrice.get(i);
    }
    
    public Integer getDVDCopies(int i) {
        return DVDCopies.get(i);
    } 
    
    public String getCompanyName(int input) {
        return DVDCompany.get(input);
    }
    
    public void createDVDInventory() {
        addDVD("Cars", "Pixar", 8.99, 10);
        addDVD("Minions: The Rise of Gru", "Illumination", 7.99, 15);
        addDVD("Sing", "Illumination", 8.99, 12);
        addDVD("Dispicable Me", "Illumination", 6.99, 2);
        addDVD("Toy Story 4", "Pixar", 8.99, 8);
        addDVD("Lightyear", "Pixar", 9.99, 10);
        addDVD("WALL-E", "Pixar", 5.99, 3);
        addDVD("The Boss Baby", "DreamWorks", 5.99, 8);
        addDVD("Turbo", "DreamWorks", 5.99, 7);
        addDVD("How to Train Your Dragon", "DreamWorks", 4.99, 6);
        
    }
    
    public void updateDVD(int i, String name, String company, Double price, int copies) {
        System.out.println("Please input the number for the book you would like to update");

        DVDName.set(i, name);
        DVDCompany.set(i, company);
        DVDPrice.set(i, price);
        DVDCopies.set(i, copies);
                
    }
    
    public void decrementDVD(int index) {
        DVDCopies.set(index,  (DVDCopies.get(index)-1));
    }
    
    
    public void reserveDVD(int index) {
        DVDHolds.set(index, (DVDHolds.get(index)+1));
    }
    
}
