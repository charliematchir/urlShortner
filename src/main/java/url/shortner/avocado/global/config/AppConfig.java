package url.shortner.avocado.global.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.web.client.RestTemplate;

@Configuration
@PropertySources({
        @PropertySource("classpath:env.properties"),
        @PropertySource("classpath:oauth.properties")
})
public class AppConfig {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

