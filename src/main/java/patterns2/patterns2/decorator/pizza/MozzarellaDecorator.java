package patterns2.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class MozzarellaDecorator extends AbstractPizzaDecorator{
    protected MozzarellaDecorator(Pizza pizza) {
        super(pizza);
    }
    @Override
    public BigDecimal getCost(){
        return super.getCost().add(new BigDecimal(5));
    }
    @Override
    public String getDesc(){
        return super.getDesc().concat(" + mozzarella");
    }
}
