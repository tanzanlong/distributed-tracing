package com.tan.zipkin.account.controller;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    static final Logger logger = LoggerFactory.getLogger(AccountController.class);

    @Autowired
    private OkHttpClient client;

    private Random random = new Random();

    @RequestMapping("apay")
    public String apay() throws InterruptedException, IOException {
        int sleep = random.nextInt(100);
        TimeUnit.MILLISECONDS.sleep(sleep);
        logger.info(" AccountController apay:{}",6);
        return " [apay sleep " + sleep + " ms]";
    }
}
