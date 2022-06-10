package day071;

import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

public class OptApp {
    public static void main(String[] args) {

        //Monads : Optional ve Stream
        Optional<String> opt= ThreadLocalRandom.current().nextInt(100)>70?Optional.of("A"):null;
        String s = opt.orElseThrow();
        System.out.println(s);

    }


}
