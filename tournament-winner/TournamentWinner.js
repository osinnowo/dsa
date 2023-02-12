var tournamentWinner = (competitions, results) => {
    const AWAY_TEAM_WON = 0;
    const HOME_TEAM_WON = 1;
    const COUNT = 3;
    let scores = new Map();
    let winner = "";
    for(let index = 0; index < competitions.length; index++) {
        let competition = competitions[index];
        let winningTeam = competition[results[index] === AWAY_TEAM_WON ? HOME_TEAM_WON : AWAY_TEAM_WON];
        scores.set(winningTeam, (scores.get(winningTeam) ?? 0) + COUNT);
        winner = (scores.get(winner) ?? 0) < scores.get(winningTeam) ? winningTeam : winner;
    }
    return winner;
}

exports.tournamentWinner = tournamentWinner;