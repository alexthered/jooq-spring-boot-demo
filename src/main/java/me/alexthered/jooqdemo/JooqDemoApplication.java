package me.alexthered.jooqdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class JooqDemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(JooqDemoApplication.class, args);
  }

}
