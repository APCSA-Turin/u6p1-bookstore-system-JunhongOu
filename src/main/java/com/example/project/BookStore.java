package com.example.project;

public class BookStore{

    //requires at least 2 attributes Book[] books, User[] users (initialized to an empty array of 10 max users) 
    
    private Book[] books;
    private User[] users = User[10];

    //requires 1 empty constructor
    public BookStore(){}
   
    public String[] getUsers(){
    return users;
}

    public void setUsers(String[] newUsers){
        this.users = newUsers;
    }

    public String[] getBooks(){
        return books;
    }

    public void addUser(User newUser){
        users += User[newUser];
    } 

    public void removeUser(User newUser){
        users -= User[newUser];
    }

    public void consolidateUsers(){
        for (int i = 0; i < users.length; i++){
            if (users[i].equals(null)){
                users[i] = users[users.length - 1];
            }
        }
    }

    public void addBook(Book book){}

    public void insertBook(Book book, int index){}

    public void removeBook(Book book){}
       
    public String bookStoreBookInfo(){} //you are not tested on this method but use it for debugging purposes

    public String bookStoreUserInfo(){} //you are not tested on this method but use it for debugging purposes

}