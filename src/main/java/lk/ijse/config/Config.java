package lk.ijse.config;

import lk.ijse.beans.Order;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse") /*package eka dunnama eka saha sub package wala ewath scan karanawa  */
public class Config { /* meya karanne  spring context ekata watenna kamathi aya hoyala denawa */

    @Bean    /* source code ekak nati class ekak bean ekak widiyata register karanna oon awenawaa */
    public Order order(){
        return new Order();
    }

}
