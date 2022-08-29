package com.singtel.apigatewayservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import reactor.core.publisher.Mono;

@Configuration
public class GlobalFilterConfiguration {

    final Logger logger = LoggerFactory.getLogger(GlobalFilterConfiguration.class);

    // Can define any number of filters based on the requirement
    //Pre Filters will execute in ASC order
    //Post Filters will execute in DESC order

    @Order(1)
    @Bean
    public GlobalFilter secondPreFilter(){
            return ((exchange, chain) -> {
                logger.info("Second pre filter is executed...");
                return chain.filter(exchange).then(Mono.fromRunnable(() ->{
                    logger.info("Second post filter is executed...");
                }));
            });
    }

    @Order(2)
    @Bean
    public GlobalFilter thirdPreFilter(){
        return ((exchange, chain) -> {
            logger.info("Third pre filter is executed...");
            return chain.filter(exchange).then(Mono.fromRunnable(() ->{
                logger.info("Third post filter is executed...");
            }));
        });
    }


}
