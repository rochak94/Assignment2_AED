/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.ArrayList;

/**
 *
 * @author rocha
 */
public class VitalSignsHistory {
    
    private ArrayList<VitalSigns> vitalSignsRecord;
    
    public VitalSignsHistory(){
        this.vitalSignsRecord = new ArrayList<VitalSigns>();
    }
    public ArrayList<VitalSigns> getVitalSignsList() {
        return this.vitalSignsRecord;
    }
    
    public void addVital(VitalSigns newVitalSigns) {
        vitalSignsRecord.add(newVitalSigns);
    }
}
