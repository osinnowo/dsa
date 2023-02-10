import java.util.*;

public class TournamentWinner {
   //1 - Home | 0 - Away
  public String tournamentWinner(ArrayList<ArrayList<String>> competitions, 
                                   ArrayList<Integer> results) {
      Map<String, Integer> scores = new HashMap<>();
      String winningTeam = new String();
      int index = 0;
      while(index < competitions.size()){
        String winner = competitions.get(index).get(results.get(index).equals(1) ? 0 : 1);
        scores.put(winner, scores.getOrDefault(winner, 0) + 3);
        winningTeam = scores.get(winner) > scores.getOrDefault(winningTeam, 0) ? winner : winningTeam;
        index++;
      }
      return winningTeam;
  }
}