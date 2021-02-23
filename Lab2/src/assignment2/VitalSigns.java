/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author rocha
 */
public class VitalSigns {
    
    
     private int respiratoryRate;
    private int heartRate;
    private int bloodPressure;
    private double weightInKilos;
    private double weightInPounds;
    private Date date;

    
    private Patient informationOfPatient;

    public VitalSigns(int respiratoryRate, int heartRate, int bloodPressure, double weightInKilos, double weightInPounds, Patient informationOfPatient) {
        this.respiratoryRate = respiratoryRate;
        this.heartRate = heartRate;
        this.bloodPressure = bloodPressure;
        this.weightInKilos = weightInKilos;
        this.weightInPounds = weightInPounds;
        this.informationOfPatient = informationOfPatient;
        this.date = new Date(System.currentTimeMillis());
    }

    public int getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public double getWeightInKilos() {
        return weightInKilos;
    }

    public void setWeightInKilos(double weightInKilos) {
        this.weightInKilos = weightInKilos;
    }

    public double getWeightInPounds() {
        return weightInPounds;
    }

    public void setWeightInPounds(double weightInPounds) {
        this.weightInPounds = weightInPounds;
    }

    public Patient getInformationOfPatient() {
        return informationOfPatient;
    }

    public void setInformationOfPatient(Patient informationOfPatient) {
        this.informationOfPatient = informationOfPatient;
    }
    

    public String getDate() {
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");   
        return formatter.format(this.date).toString();
    }



public boolean isThisVitalSignNormal ( String vitalsigns) {
    
    String definedAge= informationOfPatient.getgroupAge(informationOfPatient.monthsToYears(informationOfPatient.getAge()));
    if (vitalsigns.equals("Respiratory rate")) {
        if (definedAge=="New Born"){
            if (respiratoryRate <= 50 && respiratoryRate >= 30) {
                        System.out.println("Respiratory rate is normal for " + definedAge);
                        return true;
                    } else {
                        System.out.println("Respiratory rate is not normal for " + definedAge);
                        return false;
        }
    } else if (definedAge=="Infant"){
    
        if (respiratoryRate <= 30 && respiratoryRate >= 20) {
                        System.out.println("Respiratory rate is normal for " + definedAge);
                        return true;
                    } else {
                        System.out.println("Respiratory rate is not normal for " + definedAge);
                        return false;
                    }
    } else if (definedAge=="Toddler"){
        
         if (respiratoryRate <= 30 && respiratoryRate >= 20) {
                        System.out.println("Respiratory rate is normal for " + definedAge);
                        return true;
                    } else {
                        System.out.println("Respiratory rate is not normal for " + definedAge);
                        return false;
                    }
    } else if (definedAge=="PreSchooler"){
        
        if (respiratoryRate <= 30 && respiratoryRate >= 20) {
                        System.out.println("Respiratory rate is normal for " + definedAge);
                        return true;
                    } else {
                        System.out.println("Respiratory rate is not normal for " + definedAge);
                        return false;
                    }
    }  else if (definedAge== "School Age"){
        
        if (respiratoryRate <= 30 && respiratoryRate >= 20) {
                        System.out.println("Respiratory rate is normal for " + definedAge);
                        return true;
                    } else {
                        System.out.println("Respiratory rate is not normal for " + definedAge);
                        return false;
                    }
    }   else if(definedAge== "Adolescent"){
                    if (respiratoryRate <= 20 && respiratoryRate >= 12) {
                        System.out.println("Respiratory rate is normal for " + definedAge);
                        return true;
                    } else {
                        System.out.println("Respiratory rate is not normal for " + definedAge);
                        return false;
                    }
            
                   
    }else if (vitalsigns.equals("Blood Pressure")) {

            
        if (definedAge== "New Born"){
            if (bloodPressure <= 70 && bloodPressure >= 50) {
                        System.out.println("Blood pressure is normal for " + definedAge);
                        return true;
                    } else {
                        System.out.println("Blood pressure is not normal for " + definedAge);
                        return false;
                    }
        }  else if (definedAge== "Infant"){
                
                
                    if (bloodPressure <= 100 && bloodPressure >= 70) {
                        System.out.println("Blood pressure is normal for " + definedAge);
                        return true;
                    } else {
                        System.out.println("Blood pressure is not normal for " + definedAge);
                        return false;
                    }
        }  else if (definedAge=="Toddler"){
                    if (bloodPressure <= 110 && bloodPressure >= 80) {
                        System.out.println("Blood pressure is normal for " + definedAge);
                        return true;
                    } else {
                        System.out.println("Blood pressure is not normal for " + definedAge);
                        return false;
                    }
        }  else if (definedAge=="Pre Schooler"){
                    if (bloodPressure <= 110 && bloodPressure >= 80) {
                        System.out.println("Blood pressure is normal for " + definedAge);
                        return true;
                    } else {
                        System.out.println("Blood pressure is not normal for " + definedAge);
                        return false;
                    }
        } else if (definedAge== "School Age"){
                    if (bloodPressure <= 120 && bloodPressure >= 80) {
                        System.out.println("Blood pressure is normal for " + definedAge);
                        return true;
                    } else {
                        System.out.println("Blood pressure is not normal for " + definedAge);
                        return false;
                    }
        } else if (definedAge== "Adolescent"){
                    if (bloodPressure <= 120 && bloodPressure >= 110) {
                        System.out.println("Blood pressure is normal for " + definedAge);
                        return true;
                    } else {
                        System.out.println("Blood pressure is not normal for " + definedAge);
                        return false;
                    }
            }

        } else if (vitalsigns.equals("Heart Rate")) {

            if (definedAge=="New Born"){
                
                    if (respiratoryRate <= 50 && respiratoryRate >= 30) {
                        System.out.println("Heart Rate is normal for " + definedAge);
                        return true;
                    } else {
                        System.out.println("Heart Rate is not normal for " + definedAge);
                        return false;
                    }
        } else if (definedAge== "Infant"){
                    if (respiratoryRate <= 30 && respiratoryRate >= 20) {
                        System.out.println("Heart Rate is normal for " + definedAge);
                        return true;
                    } else {
                        System.out.println("Heart Rate is not normal for " + definedAge);
                        return false;
                    }
        } else if (definedAge== "Toddler"){
                    if (heartRate <= 130 && heartRate >= 80) {
                        System.out.println("Heart Rate is normal for " + definedAge);
                        return true;
                    } else {
                        System.out.println("Heart Rate is not normal for " + definedAge);
                        return false;
                    }
        }else if(definedAge== "Pre Schooler"){
                    if (heartRate <= 120 && heartRate >= 80) {
                        System.out.println("Heart Rate is normal for " + definedAge);
                        return true;
                    } else {
                        System.out.println("Heart Rate is not normal for " + definedAge);
                        return false;
                    }
        } else if (definedAge=="School Age"){
                    if (heartRate <= 110 && heartRate >= 70) {
                        System.out.println("Heart Rate is normal for " + definedAge);
                        return true;
                    } else {
                        System.out.println("Heart Rate is not normal for " + definedAge);
                        return false;
                    }
    }     else if (definedAge== "Adolescent"){
                    if (heartRate <= 105 && heartRate >= 55) {
                        System.out.println("Heart Rate is normal for " + definedAge);
                        return true;
                    } else {
                        System.out.println("Heart Rate is not normal for " + definedAge);
                        return false;
                    }
            }
    }else  if (vitalsigns.equals("Weight in kilos")) {
            
            if (definedAge== "New Born"){
                    if (weightInKilos <= 3 && weightInKilos >= 2) {
                        System.out.println("Weight in kilos is normal for " + definedAge);
                        return true;
                    } else {
                        System.out.println("Weight in kilos is not normal for " + definedAge);
                        return false;
                    }
    } else if (definedAge== "Infant"){
                    if (weightInKilos <= 10 && weightInKilos >= 4) {
                        System.out.println("Weight in kilos is normal for " + definedAge);
                        return true;
                    } else {
                        System.out.println("Weight in kilos is not normal for " + definedAge);
                        return false;
                    }
    }  else if (definedAge== "Toddler"){
                    if (weightInKilos <= 14 && weightInKilos >= 10) {
                        System.out.println("Weight in kilos is normal for " + definedAge);
                        return true;
                    } else {
                        System.out.println("Weight in kilos is not normal for " + definedAge);
                        return false;
                    }
    } else if (definedAge=="Pre Schooler"){
                    if (weightInKilos <= 18 && weightInKilos >= 14) {
                        System.out.println("Weight in kilos is normal for " + definedAge);
                        return true;
                    } else {
                        System.out.println("Weight in kilos is not normal for " + definedAge);
                        return false;
                    }
    } else if (definedAge== "School Age"){
                    if (weightInKilos <= 42 && weightInKilos >= 20) {
                        System.out.println("Weight in kilos is normal for " + definedAge);
                        return true;
                    } else {
                        System.out.println("Weight in kilos is not normal for " + definedAge);
                        return false;
                    }
    }  else if (definedAge== "Adolescent"){
                    if (weightInKilos > 50) {
                        System.out.println("Weight in kilos is normal for " + definedAge);
                        return true;
                    } else {
                        System.out.println("Weight in kilos is not normal for " + definedAge);
                        return false;
                    }
            }

     }else if (vitalsigns.equals("Weight in pounds")) {

            if(definedAge== "New Born"){
                    if (weightInPounds <= 7 && weightInPounds >= 4.5) {
                        System.out.println("Weight in pounds is normal for " + definedAge);
                        return true;
                    } else {
                        System.out.println("Weight in pounds is not normal for " + definedAge);
                        return false;
                    }
      } else if (definedAge== "Infant"){
                    if (weightInPounds <= 22 && weightInPounds >= 9) {
                        System.out.println("Weight in pounds is normal for " + definedAge);
                        return true;
                    } else {
                        System.out.println("Weight in pounds is not normal for " + definedAge);
                        return false;
                    }
     } else if(definedAge== "Toddler"){
                    if (weightInPounds <= 31 && weightInPounds >= 22) {
                        System.out.println("Weight in pounds is normal for " + definedAge);
                        return true;
                    } else {
                        System.out.println("Weight in pounds is not normal for " + definedAge);
                        return false;
                    }
    }  else if (definedAge=="Pre Schooler"){
                    if (weightInPounds <= 40 && weightInPounds >= 31) {
                        System.out.println("Weight in pounds is normal for " + definedAge);
                        return true;
                    } else {
                        System.out.println("Weight in pounds is not normal for " + definedAge);
                        return false;
                    }
   }   else if (definedAge=="School Age"){
    
                    if (weightInPounds <= 92 && weightInPounds >= 41) {
                        System.out.println("Weight in pounds is normal for " + definedAge);
                        return true;
                    } else {
                        System.out.println("Weight in pounds is not normal for " + definedAge);
                        return false;
                    }
   } else if (definedAge=="Adolescent"){
                    if (weightInPounds > 110) {
                        System.out.println("Weight in pounds is normal for " + definedAge);
                        return true;
                    } else {
                        System.out.println("Weight in pounds is not normal for " + definedAge);
                        return false;
                    }
            }
   else {
            System.out.println("No such vital sign found");
            return false;
        }
    }
        
    
}
return false;
}
}


    


