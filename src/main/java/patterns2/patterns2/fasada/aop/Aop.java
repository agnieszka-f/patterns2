package patterns2.patterns2.fasada.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;
import patterns2.patterns2.fasada.api.OrderDto;
import patterns2.patterns2.fasada.api.OrderFacade;

@Component
@Aspect
public class Aop {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderFacade.class);

    @Before("execution(* patterns2.patterns2.fasada.api.OrderFacade.processOrder(..))"
    )
    public void logEvent(){
        LOGGER.info("Logging the event");
    }
}
