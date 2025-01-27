package com.example.project;

public class User{
    //requires 3 private attributes String name, String Id, Book book that is initialized to empty
    private String name;
    private String Id;
    private Book[] book = new Book[5];
    
    //requires 1 contructor with two parameters that will initialize the name and id
    public User(String name, String id){
        this.name = name;
        Id = id;
    }

    public String getName() { //returns name of the user
        return name;
    }

    public void setName(String newName) { //updates the name of the user
        name = newName;
    }

     public String getId() { //returns the id of the user
        return Id;
     }

     public void setId(String newId) { //updates the id of the user
        this.Id = newId;
     }

    public Book[] getBooks() { //returns books
        return book;
    }

    public void setBooks(Book[] newBook) { //updates books
        book = newBook;
    }

    public String bookListInfo(){ //returns information of the books
        String info = "";

        for (int k = 0; k < book.length; k++)
        {
            info += (book[k] == null) ? "empty\n" : "Title: " + book[k].getTitle() + ", "
            + "Author: " + book[k].getAuthor() + ", " + "Year: " + book[k].getYearPublished()
            + ", " + "ISBN: " + book[k].getIsbn() + ", " + "Quantity: " + book[k].getQuantity() + "\n"; 
        }

        return info;
    } 

    public String userInfo(){ //returns the information of the user
        return  "Name: " + name + "\n" + "Id: " + IdGenerate.getCurrentId() + "\n" + "Books: \n" + bookListInfo();
    } 
}