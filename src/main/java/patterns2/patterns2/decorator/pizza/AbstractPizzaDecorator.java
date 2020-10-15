package patterns2.patterns2.decorator.pizza;

import java.math.BigDecimal;

abstract public class AbstractPizzaDecorator implements Pizza{
    private final Pizza pizza;

    protected AbstractPizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public BigDecimal getCost(){
        return pizza.getCost();
    }
    @Override
    public String getDesc(){
        return pizza.getDesc();
    }
}
