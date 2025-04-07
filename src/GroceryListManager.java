import java.util.ArrayList;

public class GroceryListManager {
    private ArrayList<GroceryItem> groceryList = new ArrayList<>();

    // Add item with name, cost, category, and quantity
    public void addItem(String name, double cost, String category, int quantity) {
        groceryList.add(new GroceryItem(name, cost, category, quantity));
    }

    // Update quantity of an item
    public void updateQuantity(String itemName, int newQuantity) {
        for (GroceryItem item : groceryList) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                item.setQuantity(newQuantity);
                System.out.println("Updated quantity of " + itemName + " to " + newQuantity);
                return;
            }
        }
        System.out.println("Item not found: " + itemName);
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

    // Display items with positive quantity
    public void displayAvailableItems() {
        System.out.println("\nAvailable items (Qty > 0):");
        for (GroceryItem item : groceryList) {
            if (item.getQuantity() > 0) {
                System.out.println("- " + item);
            }
        }
    }

    // Main method to test
    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();

        manager.addItem("Apples", 2.5, "Fruit", 5);
        manager.addItem("Milk", 1.2, "Dairy", 0);
        manager.addItem("Bread", 1.5, "Bakery", 2);
        manager.addItem("Banana", 1.1, "Fruit", 3);

        manager.displayList();

        manager.displayAvailableItems();

        // Update quantity
        manager.updateQuantity("Milk", 4);
        manager.displayAvailableItems();
    }
}
