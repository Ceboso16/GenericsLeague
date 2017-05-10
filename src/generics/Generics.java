/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author Anonimous
 
 */
public class Generics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    League<Team<FootballPlayer>> footballleague = new League<>("AFL");
        Team<FootballPlayer> Dallas = new Team<>("Dallas");
        Team<FootballPlayer> Arizona = new Team<>("Arizona");
        Team<FootballPlayer> NewEngland = new Team<>("New England");
        Team<BaseballPlayer> Packers = new Team<>("Packers");
        Arizona.matchResult(NewEngland, 3, 0);
        Arizona.matchResult(Arizona, 0, 2);
        
        //footballleague.addTeam(Borrowski); Should not work
        footballleague.addTeam(Arizona);
        footballleague.addTeam(Dallas);
        footballleague.addTeam(NewEngland);
        
        
    }
    
}