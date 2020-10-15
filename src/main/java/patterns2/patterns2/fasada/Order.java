package patterns2.patterns2.fasada;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Item> items = new ArrayList<>();
    private final Long orderId;
    private final Long userId;
    private boolean isPaid = false;
    private boolean isVeryfied = false;
    private boolean isSubmitted = false;
    private ProductService productService;

    public Order(Long orderId, Long userId, ProductService productService) {
        this.orderId = orderId;
        this.userId = userId;
        this.productService = productService;
    }
    public BigDecimal calculateValue(){
        BigDecimal sum = BigDecimal.ZERO;
        for(Item item: items){
            sum = sum.add(productService.getPrice(item.getProductId()).multiply(new BigDecimal(item.getQty())));
        }
        return sum;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Long getOrderId() {
        return orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public boolean isVeryfied() {
        return isVeryfied;
    }

    public void setVeryfied(boolean veryfied) {
        isVeryfied = veryfied;
    }

    public boolean isSubmitted() {
        return isSubmitted;
    }

    public void setSubmitted(boolean submitted) {
        isSubmitted = submitted;
    }

    public ProductService getProductService() {
        return productService;
    }

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }
}
