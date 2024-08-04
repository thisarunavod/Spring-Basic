package lk.ijse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {

        var ctx = new AnnotationConfigApplicationContext();   // <---- bajanaya //
        ctx.register(MyConfig.class);   // Application context kiyana bajanayata danawa My
        ctx.refresh();                  // poddk kalawam karaa
        ctx.close();

    }
}