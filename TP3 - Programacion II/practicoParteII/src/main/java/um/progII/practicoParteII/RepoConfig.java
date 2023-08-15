package um.progII.practicoParteII;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "datos-iniciales", ignoreUnknownFields = true)
public class RepoConfig {
    private Domicilio dom1;
    private Domicilio dom2;
    private Domicilio dom3;
}

