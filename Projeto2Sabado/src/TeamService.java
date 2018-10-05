import java.util.List;

public class TeamService {
	private TeamRepository teamRepository = new TeamRepository();
	private Classroom classroom = new Classroom(this.classroom.getNumber(), this.classroom.getAvailability(),
			this.classroom.getCapacity());

	public void addTeam(Team team) {
		if (classroom.getAvailability().equals(true) && classroom.getCapacity() <= classroom.getCapacity()) {
			teamRepository.AddTeam(team);
		}
	}

	// ATUALIZA SOMENTE SE O CURSO NAO FOI ALTERADO
	public void removeTeam(Team team) {
		this.teamRepository.deleteTeam(team);
	}

	public List<Team> listAll() {
		return this.teamRepository.readAll(null);
	}

}
