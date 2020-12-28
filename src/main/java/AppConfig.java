import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
 
    @Bean(name="helloworld")
    //Знаю, что по умолчанию Scope = singleton, но не уверен, что это так-же и в настроечном классе, как и в XML.
    @Scope("singleton")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }
    @Bean(name = "cat")
    @Scope("prototype")
    public Cat getCat(){
        Cat cat = new Cat();
        cat.setMessage("Mew");
        return cat;
    }

}