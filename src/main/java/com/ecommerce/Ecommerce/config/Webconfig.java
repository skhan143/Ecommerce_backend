//package com.ecommerce.Ecommerce.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.springframework.web.servlet.config.annotation.ConRegistry;
//@Configuration
//class Webconfig {
//
//    @Bean
//    public WebMvcConfigurer corsConfigure () {
//        return addCorsMappings( registry)  {
//               registry.addMapping("/**")
//                       .allowedOrigins("*")
//                       .allowedMethods("GET", "PUT", "POST", "PATCH", "DELETE", "OPTIONS");
//            }
//        }
//
//
//    }
//
//




package com.ecommerce.Ecommerce.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
class Webconfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("*")
                        .allowedMethods("GET", "PUT", "POST", "PATCH", "DELETE", "OPTIONS");
            }
        };
    }
}
