package factorypattern;

public class Red implements Color {
    @Override
    public void fill(){
        System.out.println("inside fill method of Red");
    }
}
