package cn.itcast.core.app;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class SmsApplication {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(SmsApplication.class);
        springApplication.run(args);

    }
}
