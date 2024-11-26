package package2.config;

import com.example.Annotations.service.ConsumerService;
import com.example.Annotations.service.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PvkConfig {

    public void pp(){
        System.out.println("hello configuration class here");
    }

    @Bean
    ProductService testing(){
        return new ProductService();
    }

    @Bean
    ConsumerService testing2(){
        return new ConsumerService();
    }
}
