package lk.ijse.dep;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Sayuri implements GoodGirl {

    @Override
    public void love() {
        System.out.println("Love u sandun.........");
        System.out.println("Love u sandun.........");
        System.out.println("Love u sandun.........");
    }
}
