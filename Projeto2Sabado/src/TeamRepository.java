import java.util.ArrayList;
import java.util.List;

public class TeamRepository {
	private List<Team> dbTeams = new ArrayList<Team>();
	private Long sequenceTeams = 0L;

	public Team AddTeam(Team team) {
		team.setId(this.sequenceTeams);
		dbTeams.add(team);
		this.incSequenceTeam();
		return team;
	}

	public Team updateTeam(Team team) {
		for (int i = 0; i < dbTeams.size(); i++) {
			Team teamActual = dbTeams.get(i);
			if (teamActual.equals(team)) {
				dbTeams.add(i, team);
				break;
			}
		}

		return team; // RETORNA ESTUDANTE ATUALIZADO
	}

	public void deleteTeam(Team team) {
		for (int i = 0; i < dbTeams.size(); i++) {
			Team teamActual = dbTeams.get(i);
			if (teamActual.equals(team)) {
				dbTeams.remove(i);
			}

		}
	}

	public List<Team> readAll(Team team) {
		return this.dbTeams;
	}

	private void incSequenceTeam() {
		this.sequenceTeams++;
	}
}
