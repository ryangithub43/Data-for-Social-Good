public class RestaurantData {

// Instance variables 
    private String name;
    private double price; 
    private String size;
    private String ingredients; 

// Parameterized constructor
    public RestaurantData(String name, double price, String size, String ingredients) {
      this.name = name; 
      this.price = price; 
      this.size = size; 
      this.ingredients = ingredients; 
    }
  
/*
 * Accessor methods 
 */
    public String getName() {
      return name; 
    }
  

    public double getPrice() {
      return price;
    }

    public String getSize() {
      return size; 
    }

    public String getIngredients() {
      return ingredients; 
    }

/*
 * What prints in the console 
 */
    public String toString() {
      return "Size: " + size + " |" + " Name: " + name + "\n" + "\n" + "Ingredients: " + ingredients + "\n" + "Price: " + "$" + price + "\n" + "------------------------------------------------------------------------------"; 
  }
}
