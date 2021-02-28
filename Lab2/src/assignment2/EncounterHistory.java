/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rocha
 */
public class EncounterHistory {
    
    
    private List<Encounter> encounterHistoryList;

    public EncounterHistory() {
        encounterHistoryList= new ArrayList<>();
        
    }
    
    public void addEncoutner(Encounter e){
     this.encounterHistoryList.add(e);
    }

    public List<Encounter> getEncounterHistoryList() {
        return this.encounterHistoryList;
    }
    
    
    
}
