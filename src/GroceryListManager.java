import java.util.ArrayList;

public class GroceryListManager {
    // 1. Create the grocery list
    private ArrayList<String> groceryList = new ArrayList<>();

    // 2. Add item to the list
    public void addItem(String item) {
        groceryList.add(item);
    }

    // 3. Remove item from the list
    public void removeItem(String item) {
        groceryList.remove(item);
    }

    // 4. Display the list
    public void displayList() {
        System.out.println("Grocery List:");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    // 5. Check if item exists
    public boolean checkItem(String item) {
        return groceryList.contains(item);
    }

    // 6. Main method to test everything
    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();

        // Add some items
        manager.addItem("Apples");
        manager.addItem("Milk");
        manager.addItem("Bread");

        // Display the list
        manager.displayList();

        // Check if "Milk" is in the list
        System.out.println("\nIs \"Milk\" in the grocery list? " + manager.checkItem("Milk"));

        // Remove "Milk"
        System.out.println("\nRemoving \"Milk\" from the list...");
        manager.removeItem("Milk");

        // Display the updated list
        System.out.println("\nUpdated Grocery List:");
        manager.displayList();
    }
}
