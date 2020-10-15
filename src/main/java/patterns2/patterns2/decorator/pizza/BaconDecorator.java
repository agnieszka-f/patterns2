package patterns2.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BaconDecorator extends AbstractPizzaDecorator{
    protected BaconDecorator(Pizza pizza) {
        super(pizza);
    }
    @Override
    public BigDecimal getCost(){
        return super.getCost().add(new BigDecimal(4));
    }
    @Override
    public String getDesc(){
        return super.getDesc().concat(" + boczek");
    }
}
