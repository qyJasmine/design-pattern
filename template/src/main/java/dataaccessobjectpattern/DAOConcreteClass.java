package dataaccessobjectpattern;

public class DAOConcreteClass implements DAOInterface{
    @Override
    public boolean insert(ValueObject record){
        return true;
    }

    @Override
    public boolean update(ValueObject record){
        return true;
    }

    @Override
    public boolean query(ValueObject record){
        return true;
    }

    @Override
    public boolean delete(ValueObject record){
        return true;
    }
}
