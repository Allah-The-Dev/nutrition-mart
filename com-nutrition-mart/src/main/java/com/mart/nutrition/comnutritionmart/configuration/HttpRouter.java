package com.mart.nutrition.comnutritionmart.configuration;

import com.mart.nutrition.comnutritionmart.handlers.ProductHandler;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class HttpRouter {

  @Bean
  public RouterFunction<ServerResponse> route(ProductHandler productHandler) {
    return RouterFunctions.route(RequestPredicates.GET("/products"), productHandler::getProducts);
  }

}
