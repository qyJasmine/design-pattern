package builderpattern;

/**
 * a specific category of item: cold drink
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing(){
        return new Bottle();
    }

    @Override
    public abstract float price();
}
