import Foundation

class TournamentWinner {
    let AWAY_TEAM_WON: Int = 0
    let HOME_TEAM_WON: Int = 1
    let COUNT: Int = 3;
    public func tournamentWinner(_ competitions: [[String]], _ results: [Int]) -> String {
        var winner = ""
        var scores: [String: Int] = [:]
        for index in stride(from: 0, to: competitions.count, by: 1) {
            var winningTeam = competitions[index][results[index] == AWAY_TEAM_WON ? HOME_TEAM_WON : AWAY_TEAM_WON]
            if let score = scores[winningTeam] {
                scores[winningTeam] = score + COUNT
            } else {
                scores[winningTeam] = COUNT
            }
            winner = scores[winner, default: 0] < scores[winningTeam]! ? winningTeam : winner
        }
        return winner
    }
}