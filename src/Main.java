import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        InventoryManagement im=new InventoryManagement();
        InventoryManagement.addItem("Apple", 50);
        im.addItem("Banana", 30);
        im.addItem("Orange", 20);
        im.addItem("nuts",25);

        System.out.println("All items:");
        im.printAllItems();

        System.out.println("Enter an item name to get its quantity:");
        Scanner scanner=new Scanner(System.in);
        String item = scanner.nextLine();
        System.out.println(item+" "+ im.getItemQuantity(item));

        System.out.println("Enter an item name to update its quantity:");
        item = scanner.nextLine();
        System.out.println("Enter the new quantity:");
        int quantity = scanner.nextInt();

        im.updateItemQuantity(item, quantity);
        System.out.println("Updated inventory:");
        im.printAllItems();

    }
}