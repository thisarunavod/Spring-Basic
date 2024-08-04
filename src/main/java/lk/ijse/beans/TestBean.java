package lk.ijse.beans;

import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component("TestBean")
public class TestBean implements BeanNameAware, BeanFactoryAware,
        ApplicationContextAware, InitializingBean, DisposableBean {
    public TestBean() {
        System.out.println("Hello TestBean");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory is : "+ beanFactory);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean name is : "+ name );
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("ම්ං යනවො");
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application Contrext is :"+ applicationContext);
    }


    @PreDestroy  /*  <-----  meka dependency eka through wenne .
    apita oona method ekakata @PreDestroy annmotation eka
    dammama desstroy method ekata kalin call wenawa ( එකට කලින් method call වෙන්න ඔන නම්) */
    public void preDestroyTest(){
        System.out.println("ම්ං යනවො  with  destroy " );
    }
}
