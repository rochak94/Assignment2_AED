/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author rocha
 */
public class Encounter {
   
   private VitalSigns vitalSigns;

    public Encounter(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }
    
    
   
   
}