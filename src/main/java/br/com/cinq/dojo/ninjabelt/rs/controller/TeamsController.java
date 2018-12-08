package br.com.cinq.dojo.ninjabelt.rs.controller;

import br.com.cinq.dojo.ninjabelt.rs.bean.Team;
import br.com.cinq.dojo.ninjabelt.rs.properties.EnvironmentProperties;
import br.com.cinq.dojo.ninjabelt.rs.response.ListOfTeams;
import br.com.cinq.dojo.ninjabelt.rs.response.Ninja;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/team")
public class TeamsController {


  private final EnvironmentProperties environmentProperties;

  public TeamsController(
      final EnvironmentProperties environmentProperties) {
    this.environmentProperties = environmentProperties;
  }

  @RequestMapping(
      value = "/list",
      produces = MediaType.APPLICATION_JSON_UTF8_VALUE
  )
  public ResponseEntity<ListOfTeams> getEnvironment() {
    return ResponseEntity.ok(mockListOfTeams());
  }

  private ListOfTeams mockListOfTeams() {
    final ListOfTeams list = new ListOfTeams();
    final List<Team> teams = new ArrayList<>();
    final Team presenters = new Team();
    presenters.setIsPresenter(true);
    presenters.setName("Presenters");
    presenters.setId("1");
    final List<Ninja> ninjas = new ArrayList<>();
    final Ninja ninjaRomero = new Ninja();
    ninjaRomero.setName("Rômero Ricardo");
    final Ninja ninjaGabriel = new Ninja();
    ninjaGabriel.setName("Gabriel Santos");

    ninjas.add(ninjaRomero);
    ninjas.add(ninjaGabriel);

    presenters.setNinjas(ninjas);
    teams.add(presenters);
    list.setTeams(teams);
    return list;
  }
}