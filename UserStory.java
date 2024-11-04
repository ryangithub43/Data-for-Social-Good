import java.util.Scanner;

public class UserStory {

// Accesses the txt files and turns them into an index list
    private RestaurantData[] restaurantData; 

    public UserStory(String nameFile, String priceFile, String sizeFile, String ingredientsFile) {
      restaurantData = createData(nameFile, priceFile, sizeFile, ingredientsFile);
    }

    public RestaurantData[] createData(String nameFile, String priceFile, String sizeFile, String ingredientsFile) {
      String[] names = FileReader.toStringArray(nameFile);
      double[] prices = FileReader.toDoubleArray(priceFile); 
      String[] sizes = FileReader.toStringArray(sizeFile);
      String[] ingredient = FileReader.toStringArray(ingredientsFile); 
      RestaurantData[] tempData = new RestaurantData[names.length]; 

      for (int i = 0; i < tempData.length; i++) {
        tempData[i] = new RestaurantData(names[i], prices[i], sizes[i], ingredient[i]);
      }

      return tempData; 
    }
/*
 * Checks for duplicates to not repeat the same phrase
 */
    public boolean checkForDuplicates() {
      for(int outer = 0; outer < restaurantData.length; outer++) {
        for(int inner = outer + 1; inner < restaurantData.length; inner++) {
          if(restaurantData[outer].getPrice() == (restaurantData[inner].getPrice())) {
            return true; 
          }
        }
      }
      
      return false; 
    }


  // Returns a certain set of strings in the console. 
    public String toString() {
      String result = ""; 

      for (RestaurantData org : restaurantData) {
        result += org + "\n";
      }

      return result; 
  }
}





  
