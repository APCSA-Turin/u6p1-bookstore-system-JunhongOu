package com.example.project;

public class Book{
    //requires 5 attributes String title, String author, int yearPublished, String isbn, int quantity
    private String title;
    private String author;
    private int yearPublished;
    private String isbn;
    private int quantity;
    
    //requires 1 constructor with 5 arguments that intitialize the attribtues of the class.
    public Book(String title, String author, int yearPublished, String isbn, int quantity){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isbn = isbn;
        this.quantity = quantity;
    }
    
    public String getTitle() {
        return title;
    }

     public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public int getYearPublished() {
        return yearPublished;
     }

    public void setYearPublished(int newYearPublished) {
        this.yearPublished = newYearPublished;
     }

    public String getIsbn() {
        return isbn;
     }

    public void setIsbn(String newIsbn) {
        this.isbn = newIsbn;
     }
    
    public int getQuantity() {
        return quantity;
     }

    public void setQuantity(int newQuantity) {
        this.quantity = newQuantity;
     }

     /* getter and setter methods to contain information about each part of books */

    public String bookInfo(){
        String info = "";
        info += "Title: " + title + ", ";
        info += "Author: " + author + ", ";
        info += "Year: " + yearPublished + ", ";
        info += "ISBN: " + isbn + ", ";
        info += "Quantity: " + quantity;
        return info; //returns "Title: [], Author: [], Year: [], ISBN: [], Quantity: []"
    } 
       
}