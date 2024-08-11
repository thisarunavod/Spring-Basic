package lk.ijse.aop;

import org.springframework.stereotype.Component;

@Component("Transaction")
public class Transaction {
    public void startTransaction(){
        System.out.println(" Started Trasnsaction  ");
    }

    public void endTransaction(){
        System.out.println("Ending Trasnsaction  ");
    }
}
