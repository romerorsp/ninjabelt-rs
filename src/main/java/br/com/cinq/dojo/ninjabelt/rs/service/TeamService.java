package br.com.cinq.dojo.ninjabelt.rs.service;

import br.com.cinq.dojo.ninjabelt.rs.model.Ninja;
import br.com.cinq.dojo.ninjabelt.rs.model.Team;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class TeamService {

  private final MongoTemplate template;

  public TeamService(final MongoTemplate template) {
    this.template = template;
  }

  @PostConstruct
  public void loadPresenters() {
    template.save
  }

  private Team mockListOfTeams() {
    final Team presenters = new Team();
    presenters.setIsPresenter(true);
    presenters.setName("Presenters");

    final List<Ninja> ninjas = new ArrayList<>();
    final Ninja ninjaRomero = new Ninja();
    ninjaRomero.setName("Rômero Ricardo");
    final Ninja ninjaGabriel = new Ninja();
    ninjaGabriel.setName("Gabriel Santos");

    ninjas.add(ninjaRomero);
    ninjas.add(ninjaGabriel);

    presenters.setNinjas(ninjas);
    return presenters;
  }

  public List<Team> getAllTeams() {
    return template.findAll(Team.class);
  }
}
