package patterns2.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class TomatoDecorator extends AbstractPizzaDecorator{
    protected TomatoDecorator(Pizza pizza) {
        super(pizza);
    }
    @Override
    public BigDecimal getCost(){
        return super.getCost().add(new BigDecimal(5));
    }
    @Override
    public String getDesc(){
        return super.getDesc().concat(" + pomidory");
    }
}
