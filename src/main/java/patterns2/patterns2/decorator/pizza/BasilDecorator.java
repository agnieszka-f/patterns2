package patterns2.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasilDecorator extends AbstractPizzaDecorator{
    protected BasilDecorator(Pizza pizza) {
        super(pizza);
    }
    @Override
    public BigDecimal getCost(){
        return super.getCost().add(new BigDecimal(2));
    }
    @Override
    public String getDesc(){
        return super.getDesc().concat(" + bazylia");
    }
}
