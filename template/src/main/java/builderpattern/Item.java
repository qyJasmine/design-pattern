package builderpattern;

/**
 * describe concrete sold food item, like: burger, drink
 */
public interface Item {
    String name();
    Packing packing();
    float price();
}
