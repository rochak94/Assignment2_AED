/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author rocha
 */
public class Main {
    
    public static void viewSignHistory(VitalSignsHistory  record) {
    
     ArrayList<VitalSigns> list=  record.getVitalSignsList();
        for (int i = 0; i < list.size() ; i++) {
        
    
         VitalSigns vitals= list.get(i);
    
            System.out.println("");
            System.out.println("Patient's name is :" + vitals.getInformationOfPatient().getName());
            System.out.println("Patient's age is :" + vitals.getInformationOfPatient().getAge());
            System.out.println("Patien's respiratory rate is :" + vitals.getRespiratoryRate());
            System.out.println("Patient's heart rate is :" + vitals.getHeartRate());
            System.out.println("Patient's blood pressure is :" + vitals.getBloodPressure());
            System.out.println("Patient's weight in Kilos is :" + vitals.getWeightInKilos());
            System.out.println("Patient's wight in Pounds is :" + vitals.getWeightInPounds());
            System.out.println("");

        }
    }
    
    public static void displayLastRecordedVitalSign(VitalSignsHistory record) {

        VitalSigns latest = record.getVitalSignsList().get(record.getVitalSignsList().size() - 1);
        
        System.out.println("Patient's name is :" + latest.getInformationOfPatient().getName());
        System.out.println("Patient's age is :" + latest.getInformationOfPatient().getAge());
        System.out.println("Patien's respiratory rate is :" + latest.getRespiratoryRate());
        System.out.println("Patient's heart rate is :" + latest.getHeartRate());
        System.out.println("Patient's blood pressure is :" + latest.getBloodPressure());
        System.out.println("Patient's weight in Kilos is :" + latest.getWeightInKilos());
        System.out.println("Patient's wight in Pounds is :" + latest.getWeightInPounds());

    }
    
      public static VitalSigns newVitalSign(Patient patientDetails) {
        Scanner scanner = new Scanner(System.in);
               
        System.out.print("Enter patient's respiratory : ");
        int respiratoryRate = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter patient's heart rate: ");
        int heartRate = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter patient's blood pressure: ");
        int bloodPressure = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter patient's weight in kilos: ");
        double weightInKilos = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter patient's weight in pounds: ");
        double weightInPounds = Double.parseDouble(scanner.nextLine());
        

        VitalSigns object= new VitalSigns(respiratoryRate, heartRate,
                bloodPressure, weightInKilos, weightInPounds, patientDetails);

       return object;
      }
      
      public static void main (String[] args)  {
          
          VitalSignsHistory histObject= new VitalSignsHistory();
          
           Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Choose an option : \n 1> Patient's Information "
                    + "\n 2> View patient vital sign record "
                    + "\n 3> Check vital signs ");
            String recordOption = (sc.nextLine());
          
            
         if (recordOption.equals("1") ){
                    System.out.print("Enter patient's name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter patient's age in years: ");
                    double age = Double.parseDouble(sc.nextLine());
                    Patient patientInformation = new Patient(age, name);

                    VitalSigns vitalSigns = newVitalSign(patientInformation);
                    
                    histObject.addVital(vitalSigns);
                    System.out.println("New entry has been created");
                    
         } else if (recordOption.equals ("2") ) {
                    System.out.println("Choose an option : "
                            + "\n 1> View last entered record "
                            + "\n 2> View All recorded history ");
                    recordOption = (sc.nextLine());
                    
                      if (recordOption.equals("1") ){
                            System.out.println("Viewing latest entry: ");
                            displayLastRecordedVitalSign(histObject);
                            
                     } else if (recordOption.equals("2")){
                            System.out.println("Viewing historical data: ");
                            viewSignHistory(histObject);
                        }
                     else {
                            System.out.println("Re enter your choice: ");
                    }
        } else if (recordOption.equals("3") ) {
            
                    ArrayList<VitalSigns> list= histObject.getVitalSignsList();
                    if(list.size()==0)
                        System.out.println("No Patient records found");
            
                    else{
                        
                        System.out.println("Enter which vital signs to verify records for: "
                                + "\n 1> Respiratory rate \n 2> Heart Rate "
                                + "\n 3> Blood Pressure \n 4> Weight in kilos "
                                + "\n 5> Weight in pounds ");
                        recordOption = (sc.nextLine());
                        
                        
                        System.out.println("Records: ");
                        for (int i=0; i< list.size(); i++) {
                            VitalSigns cur = list.get(i);
                            boolean isNormal = cur.isThisVitalSignNormal(recordOption);
                            System.out.println("");
                            System.out.println("Patient: "+ cur.getInformationOfPatient().getName());
                            System.out.println("Vital Signs Recorded on: "+ cur.getDate());
                            System.out.println("Status: "+(isNormal?"Normal":"Not Normal"));
                            System.out.println("");
                        }                                           
                    
                    }
                   
                }
            
            
           }
      }
      
}