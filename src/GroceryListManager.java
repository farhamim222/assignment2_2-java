import java.util.ArrayList;

public class GroceryListManager {
    private ArrayList<GroceryItem> groceryList = new ArrayList<>();

    // Add item
    public void addItem(String name, double cost, String category, int quantity) {
        groceryList.add(new GroceryItem(name, cost, category, quantity));
    }

    // Update quantity
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

    // Display full list
    public void displayList() {
        System.out.println("Full Grocery List:");
        int i = 1;
        for (GroceryItem item : groceryList) {
            System.out.println(i + ". " + item);
            i++;
        }
    }

    // Display items in a specific category
    public void displayByCategory(String category) {
        System.out.println("\nItems in category: " + category);
        for (GroceryItem item : groceryList) {
            if (item.getCategory().equalsIgnoreCase(category)) {
                System.out.println("- " + item);
            }
        }
    }

    // Display items with quantity > 0
    public void displayAvailableItems() {
        System.out.println("\nAvailable items (Qty > 0):");
        for (GroceryItem item : groceryList) {
            if (item.getQuantity() > 0) {
                System.out.println("- " + item);
            }
        }
    }

    // Calculate total cost considering quantity
    public double calculateTotalCost() {
        double total = 0;
        for (GroceryItem item : groceryList) {
            total += item.getTotalCost();
        }
        return total;
    }

    // MAIN method - Testing all tasks!
    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();

        // Add items
        manager.addItem("Apples", 2.5, "Fruit", 3);
        manager.addItem("Milk", 1.2, "Dairy", 0);
        manager.addItem("Bread", 1.5, "Bakery", 2);
        manager.addItem("Banana", 1.1, "Fruit", 5);
        manager.addItem("Cheese", 3.5, "Dairy", 1);

        // Display all items
        manager.displayList();

        // Show items in 'Fruit' category
        manager.displayByCategory("Fruit");

        // Show only items with quantity > 0
        manager.displayAvailableItems();

        // Total cost (quantity * price)
        System.out.println("\nTotal cost of available items: " + manager.calculateTotalCost() + " €");

        // Update quantity of Milk
        manager.updateQuantity("Milk", 2);

        // Show again
        manager.displayAvailableItems();
        System.out.println("Updated total cost: " + manager.calculateTotalCost() + " €");
    }
}
