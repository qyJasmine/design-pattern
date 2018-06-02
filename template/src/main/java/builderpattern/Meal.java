package builderpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * a meal contains some items
 */
public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getPrice(){
        float price = 0.0f;
        for (Item item : items){
            price += item.price();
        }
        return price;
    }

    public void showItems(){
        for (Item item : items){
            System.out.printf("Item:%s, Packing:%s, Price:%.2f",
                    item.name(), item.packing().name(), item.price());
            System.out.println();
        }
    }
}
