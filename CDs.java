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
public class CDs {  
    
    private ArrayList<String> CDName = new ArrayList<>();
    private ArrayList<String> CDArtist = new ArrayList<>();
    private ArrayList<Double> CDPrice = new ArrayList<>();
    private ArrayList<Integer> CDCopies = new ArrayList<>();
    private ArrayList<Integer> CDHolds = new ArrayList<>();
    private String name;
    private String artist;
    private Double price;
    private Integer copies;
    
    public CDs() {
    
    }
    
    public CDs(String name, String artist, Double price, Integer copies) {
        
        this.name = name;
        this.artist = artist;
        this.price = price;
        this.copies = copies;
        
    }
    
    // add DVD
    public void addCD(String name, String artist, Double price, Integer copies) {
        CDName.add(name);
        CDArtist.add(artist);
        CDPrice.add(price);
        CDCopies.add(copies);
        CDHolds.add(0);
    }
    
    public void addCD(int index, String name, String artist, Double price, Integer copies) {
        CDName.add(index, name);
        CDArtist.add(artist);
        CDPrice.add(index, price);
        CDCopies.add(index, copies);
        CDHolds.add(0);
    }
    
    
    // get entire arraylist
    public ArrayList<String> getCDName() {
        return CDName;
    } 
    
    public ArrayList<Double> getCDPrice() {
        return CDPrice;
    }
    
    public ArrayList<Integer> getCDCopies() {
        return CDCopies;
    } 
    
    public ArrayList<String> getArtistName() {
        return CDArtist;
    }
    
    //get certain DVD
    public String getCDName(int i) {
        return CDName.get(i);
    } 
    
    public Double getCDPrice(int i) {
        return CDPrice.get(i);
    }
    
    public Integer getCDCopies(int i) {
        return CDCopies.get(i);
    }
    
    public String getArtistName(int input) {
        return CDArtist.get(input);
    }
    
    public void createCDInventory() {
        addCD("Nevermind", "Nirvana", 9.99, 10);
        addCD("Blood on the Tracks", "Bob Dylan", 8.99, 12);
        addCD("Revolver", "The Beatles", 10.99, 8);
        addCD("Thriller", "Michael Jackson", 8.99, 19);
        addCD("American idiot", "Green Day", 10.99, 9);
        addCD("Blonde", "Frank Ocean", 9.99, 10);
        addCD("Lemonade", "Beyonce", 7.99, 7);
        addCD("Future Nostalgia", "Dua Lipa", 12.99, 18);
        addCD("After Hours", "The Weeknd", 11.99, 8);
        addCD("Plastic Hearts", "Miley Cyrus", 10.99, 8);
        
    }
    
    public void updateCD(int i, String name, String artist, Double price, int copies) {
        System.out.println("Please input the number for the book you would like to update");

        CDName.set(i, name);
        CDArtist.set(i, artist);
        CDPrice.set(i, price);
        CDCopies.set(i, copies);
                
    }
    
    public void decrementCD(int index) {
        CDCopies.set(index,  (CDCopies.get(index)-1));
    }
    
    
    public void reserveCD(int index) {
        CDHolds.set(index, (CDHolds.get(index)+1));
    }
    

}
