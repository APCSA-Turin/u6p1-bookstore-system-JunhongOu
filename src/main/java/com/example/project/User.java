package com.example.project;

public class User{
    //requires 3 private attributes String name, String Id, Book book that is initialized to empty
    private String name;
    private String Id;
    private Book book = "";
    //requires 1 contructor with two parameters that will initialize the name and id
    public User(String name, String id){
        this.name = name;
        this.id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

     public String getId() {
        return Id;
     }

     public void setId(String newId) {
        this.Id = newId;
     }

    public Book getBooks() {
        return book;
    }

    public void setBooks(String newBook) {
        this.book = newBook;
    }

    public String bookListInfo(){
        if (Book){}
    } //returns a booklist for the user, if empty, output "empty"

    public String userInfo(){
        String userInfo = "Name: " + name + "\n";
        userInfo += "ID: " + Id + "\n";
        userInfo += "Books:\n" + books;
        return userInfo; //returns  "Name: []\nID: []\nBooks:\n[]"
    } 
       
}