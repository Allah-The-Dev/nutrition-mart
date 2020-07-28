package com.mart.nutrition.comnutritionmart;

import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.ClientResponse;

public class GreetingWebClient {
  private WebClient client = WebClient.create("http://localhost:9080");

  private Mono<ClientResponse> result = client.get()
      .uri("/hello")
      .accept(MediaType.TEXT_PLAIN)
      .exchange();

  public String getResult() {
    return ">> result = " + result.flatMap(res -> res.bodyToMono(String.class)).block();
  }
}
