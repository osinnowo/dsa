using System;
public class TournamentWinner {
    private readonly int AWAY_TEAM_WON = 0;
    private readonly int HOME_TEAM_WON = 1;
    private readonly int COUNT = 3;
    public string TournamentWinners(List<List<string>> competitions, List<string> results) {
        Dictionary<string, int> scores = new Dictionary<string, int>();
        string winner = "";
        for(int i = 0; i < competitions.Count; i++) {
            List<string> competition = competitions[i];
            string winningTeam = competition[results[i].Equals(AWAY_TEAM_WON) ? HOME_TEAM_WON : AWAY_TEAM_WON];
            scores[winningTeam] = scores.GetValueOrDefault(winningTeam) + COUNT;
            winner = scores.GetValueOrDefault(winner) < scores[winningTeam] ? winningTeam : winner;
        }
        return winner;
    }
}