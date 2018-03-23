package at.refugeecode.HelloWorld;


import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
    private Hello hello;
    private World world;

    public HelloWorld(Hello hello,World world) {
                  this.hello = hello;
                  this.world = world;
     }

    public String sayHelloWorld() {
        return hello.SayHello()+" "+world.SayWorld();
    }
}
