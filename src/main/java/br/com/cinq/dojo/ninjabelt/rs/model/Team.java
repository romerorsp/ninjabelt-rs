package br.com.cinq.dojo.ninjabelt.rs.model;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "team")
public class Team {

  @Id
  private String id;

  private Boolean isPresenter;

  private String name;

  private List<Ninja> ninjas;

  public Boolean getIsPresenter() {
    return isPresenter;
  }

  public void setIsPresenter(Boolean isPresenter) {
    this.isPresenter = isPresenter;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Ninja> getNinjas() {
    return ninjas;
  }

  public void setNinjas(List<Ninja> ninjas) {
    this.ninjas = ninjas;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
}
