package com.example.movie.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select() // Bu metod Swagger UI-də hansı API-ləri göstərməli olduğunu tənzimləyir
                .apis(RequestHandlerSelectors.basePackage("com.example.movie.controller")) // Bu, controller-lərinizi müəyyən edir
                .paths(PathSelectors.any()) // Hər hansı bir endpoint üçün Swagger UI-ni aktiv edəcək
                .build();
    }
}
