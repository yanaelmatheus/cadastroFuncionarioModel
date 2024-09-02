package br.com.ponto_mais;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:3000") // Permite solicitações da origem especificada
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Permite métodos HTTP
                .allowedHeaders("*"); // Permite todos os cabeçalhos
    }
}
