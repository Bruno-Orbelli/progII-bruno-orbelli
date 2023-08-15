package um.progII.practicoParteI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("um.progII.practicoParteI")
public class ApplicationConfig {

    @Bean
    public Arranque arranque() {
        return new Arranque();
    }
}

