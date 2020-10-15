package patterns2.patterns2.fasada;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class Authenticator {
    public boolean isAuthenticated(Long userId){
        Random gen = new Random();
        return gen.nextBoolean();
    }
}
