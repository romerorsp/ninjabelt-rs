package br.com.cinq.dojo.ninjabelt.rs.configuration;

import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfiguration {

  @Bean
  public TestRestTemplate createRestTemplate() {
    return new TestRestTemplate();
  }
}
