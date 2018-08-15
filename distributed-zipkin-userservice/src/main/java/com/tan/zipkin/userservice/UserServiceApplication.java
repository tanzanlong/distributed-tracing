package com.tan.zipkin.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 使用Eureka做服务发现.
 * @author tan -Xms256M -Xmx256M
 */
@SpringBootApplication
//@EnableEurekaServer
public class UserServiceApplication {
  public static void main(String[] args) {
    SpringApplication.run(UserServiceApplication.class, args);
  }
}
