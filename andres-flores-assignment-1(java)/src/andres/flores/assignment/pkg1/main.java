// January 24, 2022
package andres.flores.assignment.pkg1;

import java.util.ArrayList;
import java.util.Scanner;

class Item {

    String name;
    int price;
    
    public Item() {
        this.name = "";
        this.price = 0;
    }

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return this.name + ", $" + this.price;
    }

    public int getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }
    
    public void setName(String name) {
        this.name = name;
    }

}

public class main {

    public static int calculateAverage(int total, int numItems) {

        return total/numItems;
    }
    
    public static void processItems() {
        ArrayList<Item> items = new ArrayList<Item>();

        boolean addMore = true;
        Scanner sc = new Scanner(System.in);

        while (addMore) {
            System.out.println("Enter item name: ");
            String name = sc.next();

            System.out.println("Enter item price: $");
            int price = sc.nextInt();

            if (price == -1) {
                addMore = false;
                continue;
            }

            items.add(new Item(name, price));

        }

        int total = 0;
        int numberOfItems = items.size();
        boolean containsPeas = false;

        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i).toString());
            total += items.get(i).getPrice();

            if (items.get(i).getName().equals("peas") || items.get(i).getName().equals("Peas")) {
                containsPeas = true;
            };
        }

        if (containsPeas) {
            System.out.println("Your average is $" + calculateAverage(total, numberOfItems));
        } else {
            System.out.println("no average output");
        }
    }

    public static void main(String[] args) {
        String choice = "yes";
        
        while (choice.equals("yes")) {
            processItems();
            
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Would you like to process another group of items? yes/no");
            choice = sc.next();
            
        }

    }

}
