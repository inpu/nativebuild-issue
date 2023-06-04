package org.ntbuild;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication(proxyBeanMethods = false)
public class Main implements CommandLineRunner {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Main.class).headless(false).run(args);
    }

    @Override
    public void run(String... args) {
        System.out.println("Hello world!!!");
    }
}
