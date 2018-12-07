package br.com.cinq.dojo.ninjabelt.rs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class NinjaBeltApplication {

  public static void main(String[] args) {
    SpringApplication.run(NinjaBeltApplication.class, args);
  }
}
