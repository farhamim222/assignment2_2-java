import java.util.ArrayList;

public class GroceryListManager {
    private ArrayList<GroceryItem> groceryList = new ArrayList<>();

    // Add item with name, cost, and category
    public void addItem(String name, double cost, String category) {
        groceryList.add(new GroceryItem(name, cost, category));
    }

    // Display all items
    public void displayList() {
        System.out.println("Grocery List:");
        int i = 1;
        for (GroceryItem item : groceryList) {
            System.out.println(i + ". " + item);
            i++;
        }
    }

    // Display items by category
    public void displayByCategory(String category) {
        System.out.println("\nItems in category: " + category);
        for (GroceryItem item : groceryList) {
            if (item.getCategory().equalsIgnoreCase(category)) {
                System.out.println("- " + item);
            }
        }
    }

    // Main method to test
    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();

        manager.addItem("Apples", 2.5, "Fruit");
        manager.addItem("Milk", 1.2, "Dairy");
        manager.addItem("Bread", 1.5, "Bakery");
        manager.addItem("Banana", 1.1, "Fruit");

        manager.displayList();

        // Display only Fruit category
        manager.displayByCategory("Fruit");
    }
}
