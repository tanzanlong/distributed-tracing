package com.tan.zipkin.pay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableDiscoveryClient
public class PayApplication {//-Xms128M -Xmx128M
  public static void main(String[] args) {
    SpringApplication.run(PayApplication.class, args);
  }
}
