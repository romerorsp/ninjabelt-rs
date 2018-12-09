package br.com.cinq.dojo.ninjabelt.rs.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "belt")
public class Belt {

  @Id
  private String id;

  private String name;

  public Belt() {

  }

  public Belt(final String id, final String name) {
    this.id = id;
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
}
