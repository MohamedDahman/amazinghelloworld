package at.refugeecode.HelloWorld;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Starter {


        @Bean
        ApplicationRunner applicationRunner(HelloWorld helloWorld) {
                return applicationArguments -> {
                        String sayHelloWorld = helloWorld.sayHelloWorld();
                        System.out.println(sayHelloWorld);

                };
        }
}
