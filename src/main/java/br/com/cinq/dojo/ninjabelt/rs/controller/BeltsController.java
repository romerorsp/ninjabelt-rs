package br.com.cinq.dojo.ninjabelt.rs.controller;

import br.com.cinq.dojo.ninjabelt.rs.properties.EnvironmentProperties;
import br.com.cinq.dojo.ninjabelt.rs.response.Belt;
import br.com.cinq.dojo.ninjabelt.rs.response.ListOfBelts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/team/belts")
public class BeltsController {


  private final EnvironmentProperties environmentProperties;

  public BeltsController(
      final EnvironmentProperties environmentProperties) {
    this.environmentProperties = environmentProperties;
  }

  @RequestMapping(
      value = "/presenters",
      produces = MediaType.APPLICATION_JSON_UTF8_VALUE
  )
  public ResponseEntity<ListOfBelts> getBelts() {
    return ResponseEntity.ok(mockListOfBelts());
  }

  private ListOfBelts mockListOfBelts() {
    final ListOfBelts list = new ListOfBelts();
    final List<Belt> belts = new ArrayList<>();

    list.setTeamName("presenters");

    final Belt white = buildBelt("1", "white");
    final Belt yellow = buildBelt("2", "yellow");
    final Belt red = buildBelt("3", "red");
    final Belt brown = buildBelt("4", "brown");
    final Belt black = buildBelt("5", "black");

    belts.addAll(Arrays.asList(white, yellow, red, brown, black));

    list.setBelts(belts);
    return list;
  }

  private Belt buildBelt(final String id, final String namme) {
    final Belt belt = new Belt();
    belt.setId(id);
    belt.setName(namme);
    return belt;
  }
}