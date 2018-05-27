package dataaccessobjectpattern;

/**
 * this class is a simple POJO, used to:
 *  1.store data
 *  2.manipulate data retrieved from DAO, with getter/setter method
 */
public class ValueObject {
    private String name;
    private int number;

    public ValueObject(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
