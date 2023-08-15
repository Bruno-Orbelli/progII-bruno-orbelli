package um.progII.practicoParteI;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Data
@PropertySource(value={"application.properties"})
public class Config {
    @Value("${app.defExp}")
    private double defExp;

    @Value("${app.defIndex}")
    private double defIndex;
}
