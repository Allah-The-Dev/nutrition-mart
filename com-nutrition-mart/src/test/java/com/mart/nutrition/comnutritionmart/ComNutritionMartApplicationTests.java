package com.mart.nutrition.comnutritionmart;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.WebTestClient;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ComNutritionMartApplicationTests {

  @Autowired
  private WebTestClient webTestClient;

	@Test
	void TestHello() {
    webTestClient
      .get().uri("/hello")
      .accept(MediaType.TEXT_PLAIN)
      .exchange()
      .expectStatus().isOk()
      .expectBody(String.class).isEqualTo("Hello, Spring!");
	}

}
