package com.example.gateway.demo.v1.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GateWayRoutesConfig {


    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r ->
                        r.path("/demo/**")
                                .filters(
                                        f -> f.stripPrefix(1)
                                )
                                .uri("http://localhost:8088/cousmer-demo")
                )
                .build();
    }
}
