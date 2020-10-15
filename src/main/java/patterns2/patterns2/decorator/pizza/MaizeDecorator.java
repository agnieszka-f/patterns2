package patterns2.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class MaizeDecorator extends AbstractPizzaDecorator{
    protected MaizeDecorator(Pizza pizza) {
        super(pizza);
    }
    @Override
    public BigDecimal getCost(){
        return super.getCost().add(new BigDecimal(3));
    }
    @Override
    public String getDesc(){
        return super.getDesc().concat(" + kukurydza");
    }
}
