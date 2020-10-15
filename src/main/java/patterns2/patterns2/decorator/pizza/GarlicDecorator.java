package patterns2.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class GarlicDecorator extends AbstractPizzaDecorator{
    protected GarlicDecorator(Pizza pizza) {
        super(pizza);
    }
    @Override
    public BigDecimal getCost(){
        return super.getCost().add(new BigDecimal(1));
    }
    @Override
    public String getDesc(){
        return super.getDesc().concat(" + czosnek");
    }
}
