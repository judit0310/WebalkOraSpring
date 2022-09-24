package hu.uni.miskolc.webalk;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public HallgatoService hallgatoService(){
        return new HallgatoService();
    }
}
