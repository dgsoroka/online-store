package org.online.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class OnlineStore {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                SpringApplication.run(OnlineStore.class, args);
        GreetingClient greetingClient = context.getBean(GreetingClient.class);

        System.out.println(">> message = " + greetingClient.getMessage().block());

    }
}