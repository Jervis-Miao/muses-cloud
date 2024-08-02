package xyz.muses;

/**
 * Copyright 2022 All rights reserved.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author jervis
 * @date 2022/11/14.
 */
@SpringBootApplication
@EnableEurekaServer
public class MusesEurekaServerApplication {

    /**
     * 启动
     *
     * @param args
     */
    public static void main(String[] args) {
        loadConfiguration();
        SpringApplication.run(MusesEurekaServerApplication.class, args);
    }

    /**
     * 加载配置
     */
    private static void loadConfiguration() {
        System.setProperty("test", "test");
    }
}
