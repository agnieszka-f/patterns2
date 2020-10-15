package patterns2.patterns2.fasada;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Random;

@Service
public class ProductService {
    public BigDecimal getPrice(Long productId){
        Random gen = new Random();
        return new BigDecimal(gen.nextInt(100000)/100);
    }
}
