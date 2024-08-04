package lk.ijse.dep;

import org.springframework.stereotype.Component;

@Component
public class Ruwini implements GoodGirl {
    @Override
    public void love() {
        System.out.println("Love u Sandun");
    }
}
