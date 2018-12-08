package br.com.cinq.dojo.ninjabelt.rs.response;

import br.com.cinq.dojo.ninjabelt.rs.bean.Team;
import java.util.List;

public class ListOfTeams {

  private List<Team> teams;

  public List<Team> getTeams() {
    return teams;
  }

  public void setTeams(List<Team> teams) {
    this.teams = teams;
  }
}
