/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

import java.util.ArrayList;

/**
 *
 * @author Anonimous
 
 */
public class Team <T extends Player> implements Comparable<Team<T>> {
    private String name;
    int played=0;
    int win=0;
    int draw=0;
    int lose=0;
    private ArrayList<T> members=new ArrayList<>();
    
    public Team (String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println(player.getName()+ "is already on the Team");
            return false;
        }else{
        members.add(player);
            System.out.println(player.getName() + "picked for team" + this.name);
        return true;
    }
    }
    public int numPlayers(){
        return this.members.size();
    }
    
    public void matchResult(Team<T> opponent,int ourscore, int theirscore){
        String message;
                if(ourscore>theirscore){
                    win++;
                    message= " beat ";
                }else if(ourscore==theirscore){
                    draw++;
                    message=" drew with ";
                }else{
                    lose++;
                    message=" Lost to ";
                }
               played++;
               if(opponent !=null){
                   System.out.println(this.getName()+message+opponent.getName());
                   opponent.matchResult(null, theirscore, ourscore);
               }
    }
    public int ranking(){
        return(win*2)+draw;
    }
    public int compareTo(Team<T> team){
        if(this.ranking()>team.ranking()){
            return -1;
        }else if(this.ranking()<team.ranking()){
            return 1;
        }else{
            return 0;
        }
    }
}
