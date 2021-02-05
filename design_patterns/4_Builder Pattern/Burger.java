import jdk.nashorn.internal.runtime.arrays.IntElements;

public abstract class Burger implements Item{
    @Override
    public Packing packing(){
        return new Wrapper();
    }
    @Override
    public abstract float price();
    
}
