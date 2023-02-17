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
public class Books {
    
    private ArrayList<String> BookName = new ArrayList<>();
    private ArrayList<String> BookAuthor = new ArrayList<>();
    private ArrayList<Double> BookPrice = new ArrayList<>();
    private ArrayList<Integer> BookCopies = new ArrayList<>();
    private ArrayList<Integer> BookHolds = new ArrayList<>();
    private String name;
    private String author;
    private Double price;
    private Integer copies;
    
    public Books() {
    
    }
    
    public Books(String name, String author, Double price, Integer copies) {
        
        this.name = name;
        this.author = author;
        this.price = price;
        this.copies = copies;
        
    }
    
    // add DVD
    public void addBook(String name, String author, Double price, Integer copies) {
        BookName.add(name);
        BookAuthor.add(author);
        BookPrice.add(price);
        BookCopies.add(copies);
        BookHolds.add(0);
    }
    
    public void addBook(int index, String name, String author, Double price, Integer copies) {
        BookName.add(index, name);
        BookAuthor.add(index,author);
        BookPrice.add(index, price);
        BookCopies.add(index, copies);
        BookHolds.add(0);
    }
    
    
    // get entire arraylist
    public ArrayList<String> getBookName() {
        return BookName;
    } 
    
    public ArrayList<Double> getBookPrice() {
        return BookPrice;
    }
    
    public ArrayList<Integer> getBookCopies() {
        return BookCopies;
    } 
    
    public ArrayList<String> getAuthorName() {
        return BookAuthor;
    }
    
    //get certain DVD
    public String getBookName(int i) {
        return BookName.get(i);
    } 
    
    public Double getBookPrice(int i) {
        return BookPrice.get(i);
    }
    
    public Integer getBookCopies(int i) {
        return BookCopies.get(i);
    } 
    
    public String getAuthorName(int i) {
        return BookAuthor.get(i);
    }
    
    
    public void createBookInventory() {
        addBook("If He Had Been With Me", "Laura Nowlin", 9.98, 1);
        addBook("The Way I used To Be", "Amber Smith", 11.69, 17);
        addBook("Spare", "Price Harry", 25.20, 4);
        addBook("It Ends With Us", "Colleen Hoover", 12.99, 8);
        addBook("Final Offer", "Lauren Asher", 14.99, 1);
        addBook("And There He Kept Her", "Joshua Moehling", 17.99, 10);
        addBook("Twisted Lies", "Ana Huang", 14.99, 7);
        addBook("Encore in Death", "J. D. Robb", 20.99, 10);
        addBook("Holly", "Stephen King", 27.00, 8);
        addBook("A Court of Mist and Fury", "Sarah J. Maas", 16.99, 19);
    }
    
    
    public void updateBook(int i, String name, String author, Double price, int copies) {
        System.out.println("Please input the number for the book you would like to update");

        BookName.set(i, name);
        BookAuthor.set(i, author);
        BookPrice.set(i, price);
        BookCopies.set(i, copies);
                
    }
    
    public void decrementBook(int index) {
        BookCopies.set(index,  (BookCopies.get(index)-1));
    }
    
    
    public void reserveBook(int index) {
        BookHolds.set(index, (BookHolds.get(index)+1));
    }
 
    
 
    
}




