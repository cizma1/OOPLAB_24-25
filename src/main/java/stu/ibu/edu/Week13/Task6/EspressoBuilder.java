package stu.ibu.edu.Week13.Task6;

import java.util.ArrayList;

public class EspressoBuilder implements CoffeeBuilder{
    private Coffee coffee;
    public void buildType(){
        coffee = new Coffee("Espresso", "Medium", new ArrayList<>());
    }

    public void buildSize(){}
    public void buildToppings(){}
    public Coffee getCoffee(){
        return coffee;
    }
}
