package lk.ijse;

import lk.ijse.aop.Transaction;
import lk.ijse.beans.TestBean;
import lk.ijse.config.Config;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInit {
    public static void main(String[] args) {

        var ctx = new AnnotationConfigApplicationContext();   // <---- bajanaya //
        /*ctx.register(MyConfig.class);   // Application context kiyana bajanayata danawa My
        ctx.refresh();                  // poddk kalawam karaa -- mix kara //
        ctx.close();*/
        ctx.register(Config.class);
        ctx.refresh();
        Transaction transaction = (Transaction) ctx.getBean("Transaction");
        transaction.startTransaction();
        transaction.endTransaction();
//        TestBean test = (TestBean)ctx.getBean("TestBean");
//        ConfigurableBeanFactory beanFactory = ctx.getBeanFactory();
//        boolean isSingletonCustomer = beanFactory.isPrototype("TestBean"); //<--- TestBean eke scope eka prototype daa balanaewa
//        System.out.println("Is testBean Singleton : " + isSingletonCustomer );
        /*ctx.close();*/  /* close method එකට වඩිය පහල එක හොදයි */
        ctx.registerShutdownHook();  /* <---- meken resources clear wela full shutdown wenawa */


    }
}