package lk.ijse.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse") /*package eka dunnama eke sub package wala ewath scan karanawa  */
public class Config { /* meya karanne  spring context ekata watenna kamathi aya hoyala denawa */

    public Config() { }
}
