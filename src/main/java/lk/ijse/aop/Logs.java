package lk.ijse.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Logs {

    /*Spring eken aspect eka handle karana widiya */
    @Before("execution(public void startTransaction())")  // meken transaction start wenna kalin run wenawa
    public void LogsForStartTransaction(){
        System.out.println("Logs for Trasnsaction Started  ");
    }

    @Before("execution(public void endTransaction())")
    public void LogsForEndTransaction(){
        System.out.println("Logs for Trasnsaction Ending ");
    }

}
