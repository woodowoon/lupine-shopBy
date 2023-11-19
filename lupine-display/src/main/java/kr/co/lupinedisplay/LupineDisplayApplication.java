package kr.co.lupinedisplay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "kr.co.lupinedisplay")
@SpringBootApplication
public class LupineDisplayApplication {
    public static void main(String[] args) {
        SpringApplication.run(LupineDisplayApplication.class, args);
    }
}