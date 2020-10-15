package patterns2.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class MushroomsDecorator extends AbstractPizzaDecorator{
    protected MushroomsDecorator(Pizza pizza) {
        super(pizza);
    }
    @Override
    public BigDecimal getCost(){
        return super.getCost().add(new BigDecimal(3));
    }
    @Override
    public String getDesc(){
        return super.getDesc().concat(" + pieczarki");
    }
}
