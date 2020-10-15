package patterns2.patterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {
    @Test
    public void test(){
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new MozzarellaDecorator(pizza);
        pizza = new BaconDecorator(pizza);
        pizza = new MushroomsDecorator(pizza);
        pizza = new TomatoDecorator(pizza);
        pizza = new BasilDecorator(pizza);
        pizza = new GarlicSauceDecorator(pizza);
        //When
        BigDecimal calculatedCost = pizza.getCost();
        String description = pizza.getDesc();
        //Then
        Assert.assertEquals(new BigDecimal(35),calculatedCost);
        Assert.assertEquals("Pizza: ciasto i sos pomidorowy z serem + mozzarella + boczek + pieczarki + pomidory + bazylia + sos czosnkowy", description);
    }

}
