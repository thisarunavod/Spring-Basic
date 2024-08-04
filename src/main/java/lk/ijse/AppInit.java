package lk.ijse;

import lk.ijse.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInit {
    public static void main(String[] args) {

        var ctx = new AnnotationConfigApplicationContext();   // <---- bajanaya //
        /*ctx.register(MyConfig.class);   // Application context kiyana bajanayata danawa My
        ctx.refresh();                  // poddk kalawam karaa -- mix kara //
        ctx.close();*/

        ctx.register(Config.class);
        ctx.refresh();
        ctx.close();


    }
}