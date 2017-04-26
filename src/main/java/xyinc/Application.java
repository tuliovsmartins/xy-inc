package xyinc;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"xyinc.*"})
public class Application {

     
    public static void main(String[] args) {
           new SpringApplicationBuilder(Application.class).web(true).run(args);
    }
     
}

