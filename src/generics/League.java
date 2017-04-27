/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author esteb
 */
public class League<L extends Team>  {
    String name;
    ArrayList<L> league=new ArrayList<>();
    
    public League (String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
     public boolean addTeam(L Team){
        if(league.contains(Team)){
            return false;
        }else{
        league.add(Team);
        return true;
    }
     }
    public void showLeagueTable(){
        Collections.sort((List<L>) league);
        league.forEach((_item) -> {
        });
    }
}
