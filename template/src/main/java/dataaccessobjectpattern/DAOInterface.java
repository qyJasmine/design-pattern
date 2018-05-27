package dataaccessobjectpattern;

/**
 * this interface defines standard operation for DAO class
 */
public interface DAOInterface {
    boolean insert(ValueObject valueObject);
    boolean update(ValueObject valueObject);
    boolean query(ValueObject valueObject);
    boolean delete(ValueObject valueObject);

}
