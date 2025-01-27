package com.example.project;
import java.util.Scanner;
import java.lang.Thread;

public class ExtraCredit{
    public static void userInterface(){
        System.out.println("[||||||||||||||||||||||||||||||||||||||||||||||||||]");
        System.out.println("|---------𝓦𝓮𝓵𝓬𝓸𝓶𝓮 𝓽𝓸 𝓽𝓱𝓮 𝓖𝓕𝓖 𝓛𝓲𝓫𝓻𝓪𝓻𝔂!---------|");
        System.out.println("[||||||||||||||||||||||||||||||||||||||||||||||||||]");
        System.out.println("ℋℴ𝓅ℯ 𝓎ℴ𝓊 𝒶𝓇ℯ 𝒽𝒶𝓋𝒾𝓃ℊ 𝒶 𝒻𝒶𝓃𝓉𝒶𝓈𝓉𝒾𝒸 𝒹𝒶𝓎 𝓉ℴ𝒹𝒶𝓎!");
        System.out.println("𝕾𝖊𝖑𝖊𝖈𝖙 𝕱𝖗𝖔𝖒 𝕿𝖍𝖊 𝕱𝖔𝖑𝖑𝖔𝖜𝖎𝖓𝖌 𝕺𝖕𝖙𝖎𝖔𝖓𝖘 ☞ó ͜つò☞ :");
        System.out.println("𝒫𝓇ℯ𝓈𝓈 0 𝓉ℴ ℰ𝓍𝒾𝓉 𝒜𝓅𝓅𝓁𝒾𝒸𝒶𝓉𝒾ℴ𝓃 (｀∀´)Ψ");
        System.out.println("𝒫𝓇ℯ𝓈𝓈 1 𝓉ℴ 𝒜𝒹𝒹 𝓃ℯ𝓌 ℬℴℴ𝓀 ᕙ(▀̿̿Ĺ̯̿̿▀̿ ̿) ᕗ");
        System.out.println("𝒫𝓇ℯ𝓈𝓈 2 𝓉ℴ 𝒰𝓅ℊ𝓇𝒶𝒹ℯ 𝒬𝓊𝒶𝓃𝓉𝒾𝓉𝓎 ℴ𝒻 𝒶 ℬℴℴ𝓀 ( ° ᴗ°)~ð (/❛o❛/)");
        System.out.println("𝒫𝓇ℯ𝓈𝓈 3 𝓉ℴ 𝒮ℯ𝒶𝓇𝒸𝒽 𝒶 ℬℴℴ𝓀 凸( •̀_•́ )凸");
        System.out.println("𝒫𝓇ℯ𝓈𝓈 4 𝓉ℴ 𝒮𝒽ℴ𝓌 𝒜𝓁𝓁 ℬℴℴ𝓀𝓈 ヽ(ﾟДﾟ)ﾉ ");
        System.out.println("𝒫𝓇ℯ𝓈𝓈 5 𝓉ℴ ℛℯℊ𝒾𝓈𝓉ℯ𝓇 𝒰𝓈ℯ𝓇 ᕦ(ò_óˇ) ");
        System.out.println("𝒫𝓇ℯ𝓈𝓈 6 𝓉ℴ 𝒮𝒽ℴ𝓌 𝒜𝓁𝓁 ℛℯℊ𝒾𝓈𝓉ℯ𝓇ℯ𝒹 𝒰𝓈ℯ𝓇𝓈 щ（ﾟДﾟщ）");
        System.out.println("[||||||||||||||||||||||||||||||||||||||||||||||||||]");
    } //layout of the user interface
    

    public static void main(String[] args){
        boolean exit = false;
        BookStore bookstore = new BookStore();

        while(!exit){
            Scanner scan = new Scanner(System.in);
            userInterface();
            System.out.println();
            int choices = scan.nextInt();
            scan.nextLine();

            switch(choices){
                case 0:
                    exit = true;
                    scan.close();
                    break;
                
                case 1:
                    System.out.println("Enter Serial Number of Book: ");
                    String isbnBook = scan.nextLine();
                    
                    System.out.println("Enter name of Book: ");
                    String nameBook = scan.nextLine();

                    System.out.println("Enter author name: ");
                    String authorBook = scan.nextLine();

                    System.out.println("Enter publication year: ");
                    int publishYear = scan.nextInt();
                    scan.nextLine();

                    System.out.println("Enter quantity of Book: ");
                    int bookQuantity = scan.nextInt();
                    scan.nextLine();

                    Book book = new Book(nameBook, authorBook, publishYear, isbnBook, bookQuantity);
                    bookstore.addBook(book);
                    break; // adds the specified book to bookstore
                
                case 2:
                    System.out.println("Enter name of Book to Upgrade Quantity: ");
                    String searchBook = scan.nextLine();

                    for (int k = 0; k < bookstore.books.length; k++){
                        if (bookstore.books[k].getTitle().equals(searchBook)){
                            System.out.println("Upgrade Quantity by What Amount: ");
                            int quantity = scan.nextInt();
                            scan.nextLine();

                            bookstore.books[k].setQuantity(bookstore.books[k].getQuantity() + quantity);
                            break;
                        }
                    }
                    break; // more quantities of the specified book gets added
                    
                case 3:
                    System.out.println("Enter name of Book: ");
                    String findBook = scan.nextLine();

                    for (int k = 0; k < bookstore.books.length; k++){
                        if (bookstore.books[k].getTitle().equals(findBook)){
                            System.out.println("Book Found");
                            System.out.println(bookstore.books[k].bookInfo());
                            break;
                        }
                    }
                    break; //searches for the specified book, and prints out its information
                
                case 4:
                    for (int k = 0; k < bookstore.books.length; k++){
                        System.out.println(bookstore.books[k].bookInfo());
                    }
                    break; //prints out information about all of the available books in the bookstore
                
                case 5:
                    System.out.println("Username: ");
                    String username = scan.nextLine();

                    IdGenerate.generateID();

                    User user = new User(username, IdGenerate.getCurrentId());
                    bookstore.addUser(user);
                    bookstore.consolidateUsers();
                    break; //New users gets added into the bookstore
                    
                case 6:
                    for (int k = 0; k < bookstore.users.length; k++){
                        if (bookstore.users[k] == null){
                            break;
                        }
                        else{
                            System.out.println(bookstore.users[k].userInfo());
                        }
                    }
                    break; //Prints information about every user that is in the bookstore
                }
                
                try{
                    Thread.sleep(2000); 
                } 
                    catch (InterruptedException e){
                    System.out.println("Interrupted: " + e.getMessage());  //Code to pause the program per 2 seconds
            }      
        }
    }
}