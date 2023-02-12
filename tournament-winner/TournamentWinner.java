import java.util.*;

public class TournamentWinner {
   //1 - Home | 0 - Away
   private static final Integer HOME_TEAM_WON = 1;
   private static final Integer AWAY_TEAM_WON = 0;
   private static final Integer COUNT = 3;
   Map<String, Integer> scores = new HashMap<>();
   String winner = new String();
   public String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
     for(int i = 0; i < competitions.size(); i++){
       ArrayList<String> competition = competitions.get(i);
       String winningTeam = competition.get(results.get(i).equals(AWAY_TEAM_WON) ? HOME_TEAM_WON : AWAY_TEAM_WON);
       Integer currentScore = scores.getOrDefault(winningTeam, 0) + COUNT;
       scores.put(winningTeam, currentScore);
       winner = scores.getOrDefault(winner, 0) < currentScore ? winningTeam : winner;
     }
     return winner;
   }
}