import java.util.HashMap;
import java.util.Map;

public class GroceryListManager {
    // HashMap to store item and cost
    private HashMap<String, Double> groceryList = new HashMap<>();

    // Add item with cost
    public void addItem(String item, double cost) {
        groceryList.put(item, cost);
    }

    // Remove item
    public void removeItem(String item) {
        groceryList.remove(item);
    }

    // Display all items with their cost
    public void displayList() {
        System.out.println("Grocery List:");
        int i = 1;
        for (Map.Entry<String, Double> entry : groceryList.entrySet()) {
            System.out.println(i + ". " + entry.getKey() + " - " + entry.getValue() + " €");
            i++;
        }
    }

    // Check if item exists
    public boolean checkItem(String item) {
        return groceryList.containsKey(item);
    }

    // Calculate total cost
    public double calculateTotalCost() {
        double total = 0;
        for (double cost : groceryList.values()) {
            total += cost;
        }
        return total;
    }

    // Main method to test
    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();

        // Add items
        manager.addItem("Apples", 2.5);
        manager.addItem("Milk", 1.2);
        manager.addItem("Bread", 1.5);

        // Display list
        manager.displayList();

        // Check if Milk is in list
        System.out.println("\nIs \"Milk\" in the list? " + manager.checkItem("Milk"));

        // Show total cost
        System.out.println("\nTotal cost: " + manager.calculateTotalCost() + " €");

        // Remove Milk
        manager.removeItem("Milk");

        // Display updated list and cost
        System.out.println("\nAfter removing Milk:");
        manager.displayList();
        System.out.println("Updated total cost: " + manager.calculateTotalCost() + " €");
    }
}
