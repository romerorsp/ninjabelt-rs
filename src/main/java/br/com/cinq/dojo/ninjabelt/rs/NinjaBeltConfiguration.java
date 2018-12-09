package br.com.cinq.dojo.ninjabelt.rs;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NinjaBeltConfiguration {

  @Bean
  public ModelMapper createModelMapper() {
    return new ModelMapper();
  }
}
