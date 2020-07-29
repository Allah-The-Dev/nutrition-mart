package com.mart.nutrition.comnutritionmart.handlers;

import java.util.List;

import com.mart.nutrition.comnutritionmart.entities.Product;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;

@Component
public class ProductHandler {

  public Mono<ServerResponse> getProducts(ServerRequest request) {
    List<Product> productList = List.of(
      new Product("Apple"),
      new Product("Banana")
    );
    return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
      .bodyValue(productList);
  }

}
