import java.util.*;

public class TournamentWinner {
   //1 - Home | 0 - Away
   private static final Integer HOME_TEAM_WON = 1;
   private static final Integer AWAY_TEAM_WON = 0;
   // [homeTeam, awayTeam] | 1 - HOME_TEAM_WON, 0 - AWAY_TEAM_WON
   Map<String, Integer> scores = new HashMap<>();
   String winner = new String();
   public String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
     for(int i = 0; i < competitions.size(); i++){
       ArrayList<String> competition = competitions.get(i);
       String winningTeam = competition.get(results.get(i).equals(AWAY_TEAM_WON) ? HOME_TEAM_WON : AWAY_TEAM_WON);
       Integer currentScore = scores.getOrDefault(winningTeam, 0) + 3;
       scores.put(winningTeam, currentScore);
       winner = scores.getOrDefault(winner, 0) < currentScore ? winningTeam : winner;
     }
     return winner;
   }
}