package br.com.cinq.dojo.ninjabelt.rs.response;

import java.util.List;

public class ListOfBelts {

  private String teamName;

  private List<Belt> belts;

  public List<Belt> getBelts() {
    return belts;
  }

  public void setBelts(List<Belt> belts) {
    this.belts = belts;
  }

  public String getTeamName() {
    return teamName;
  }

  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }
}
