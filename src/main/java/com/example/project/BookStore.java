package com.example.project;

public class BookStore{

    //requires at least 2 attributes Book[] books, User[] users (initialized to an empty array of 10 max users) 
    
    public Book[] books = new Book[0];
    public User[] users = new User[10];

    //requires 1 empty constructor
    public BookStore(){}
   
    public User[] getUsers(){ //returns users
    return users;
}

    public void setUsers(User[] newUsers){ //sets users into updated users
        users = newUsers;
    }

    public Book[] getBooks(){ //returns books
        return books;
    }

    public void addUser(User newUser){ //Adds newUser to users
        for(int k = 0; k <= users.length - 1; k++){
            if(users[k] == null){
                users[k] = newUser;
                break;
            }
        }
    } 

    public void removeUser(User user){ //removes an user from users, puts detected null value to the end of users array
        for (int k = 0; k < users.length; k++){
            if(users[k] == user){
                users[k] = null;
                consolidateUsers();
                break;
            }
        }
    }

    public void consolidateUsers(){ //Puts every value of null onto the end of the users array
        User[] updatedUser = new User[users.length];
        int num = 0;

        for (User user : users){
            if (user != null){
                updatedUser[num] = user; 
                num++;
            }
        }

        users = updatedUser;  
    }
    public void addBook(Book book){ //Adds a new book onto the books array
        Book[] updatedBook = new Book[books.length + 1];
        for (int k = 0; k <= books.length - 1; k++){
            updatedBook[k] = books[k];
        }
            updatedBook[updatedBook.length - 1] = book;

        books = updatedBook;
    }

    public void insertBook(Book book, int index){
        Book[] updatedBook = new Book[books.length + 1];

        if (index == updatedBook.length - 1){ //Determines if final index in updatedBook = index
            for (int k = 0; k < books.length; k++){
                updatedBook[k] = books[k];
            }
                updatedBook[index] = book;
         }
        else{
            for (int k = 0; k < index; k++){
                updatedBook[k] = books[k];
            }
                    
            updatedBook[index] = book;
    
            for (int y = index; y < books.length; y++){                
                updatedBook[y + 1] = books[y];
            }
        }
                
        books = updatedBook;  
    }

    public void removeBook(Book book){ //removes a book from the book array
    boolean notInBookstore = false; //Boolean variable to change for varying book quantities

       for (int k = 0; k <= books.length - 1; k++){ //For whether 0 is the amount of a specified book.
            if (books[k] == book){
                if (books[k].getQuantity() - 1 == 0){
                    books[k] = null;
                    notInBookstore = true;
                }
                else{
                    books[k].setQuantity(books[k].getQuantity() - 1);
                }
            }
    }
        if (notInBookstore){ //if there is no books for the specified book, the specified book gets removed from the book array
          Book[] updatedBook = new Book[books.length - 1];
          consolidateBooks();
          
          for (int k = 0; k <= updatedBook.length - 1; k++){
            updatedBook[k] = books[k];
        }
        books = updatedBook;
    }
          else{
          consolidateBooks();
    }
  }
    
    public void consolidateBooks()
    {
        User[] updatedBook = new User[books.length];
        int num = 0;

        for (Book book : books){
            if (book != null){
                books[num] = book; //brings all null values to the end for books array
                num++;
            }
        }

        users = updatedBook;  
    }  
}