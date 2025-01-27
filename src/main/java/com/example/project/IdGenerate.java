package com.example.project;

public class IdGenerate{ //This class contains statics variable and methods, you do not initalize an object to use it.
    
    // //requires 1 private attribute String currentId. You must initialize it to 99
    private static String currentId = "99";

    // //requires one empty constructor
    
    public IdGenerate(){}

    public static String getCurrentId(){
    return currentId;
}
    public static void reset(){
    currentId = "99"; //must reset the currentId back to 99
}


    public static void generateID(){ //increases the id number by 1
        Integer currentIncrement = (Integer.parseInt(currentId) + 1);
        currentId = currentIncrement.toString();
  } 
}