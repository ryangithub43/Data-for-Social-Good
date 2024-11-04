// Dillon is my partner. 

import java.util.Scanner;

public class DataRunner {
  public static void main(String[] args) {

// Instantiating index 
    UserStory DinnerRush = new UserStory("name.txt", "price.txt", "size.txt", "ingredients.txt"); 


// Prints the items contained in the index
      System.out.println(DinnerRush); 

      DinnerRush.checkForDuplicates(); 


    System.out.println("^^^ Here are the items that were bought today! ^^^");
    
  }
}
