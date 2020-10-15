package patterns2.patterns2.decorator.taxiportal;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class TaxiOrderTestSuite {
    @Test
    public void testBasicTaxiOrderGetCost(){
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        //When
        BigDecimal calculatedCost = taxiOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(5.0), calculatedCost);
    }
    @Test
    public void testBasicTaxiOrderGetDescription(){
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        //When
        String description = taxiOrder.getDescription();
        //Then
        Assert.assertEquals("Drive a course",description);
    }
    @Test
    public void testTaxiNetworkGetCost(){
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);
        //When
        BigDecimal calculatedCost = taxiOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(40),calculatedCost);
    }
    @Test
   public void testTaxiNetworkGetDescription(){
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);
        //When
        String description = taxiOrder.getDescription();
        //Then
        Assert.assertEquals("Drive a course by Taxi Network",description);
    }
    @Test
    public void testMyTaxiWithChildSeatGetCost(){
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new MyTaxiNetworkOrderDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        //When
        BigDecimal calculatedCost = taxiOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(37), calculatedCost);
    }
    @Test
    public void testMyTaxiWithChildSeatGetDescription(){
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new MyTaxiNetworkOrderDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        //When
        String description = taxiOrder.getDescription();
        //Then
        Assert.assertEquals("Drive a course by MyTaxi Network + child seat",description);

    }
    @Test
    public void testVipTaxiWithChildSeatExpressGetCost(){
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        taxiOrder = new VipDecorator(taxiOrder);
        //When
        BigDecimal calculatedCost = taxiOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(52),calculatedCost);
    }
}
