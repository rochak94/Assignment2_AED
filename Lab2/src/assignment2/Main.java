/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author rocha
 */
public class Main {
    
    public static void viewSignHistory(EncounterHistory  record) {
    
        List<Encounter> list=  record.getEncounterHistoryList();
        for (int i = 0; i < list.size() ; i++) {
        
    
         VitalSigns vitals= list.get(i).getVitalSigns();
    
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
    
    public static void displayLastRecordedVitalSign(EncounterHistory record) {

        Encounter latest = record.getEncounterHistoryList().get(record.getEncounterHistoryList().size() - 1);
        VitalSigns vitals = latest.getVitalSigns();
                
        System.out.println("Patient's name is :" + vitals.getInformationOfPatient().getName());
        System.out.println("Patient's age is :" + vitals.getInformationOfPatient().getAge());
        System.out.println("Patien's respiratory rate is :" + vitals.getRespiratoryRate());
        System.out.println("Patient's heart rate is :" + vitals.getHeartRate());
        System.out.println("Patient's blood pressure is :" + vitals.getBloodPressure());
        System.out.println("Patient's weight in Kilos is :" + vitals.getWeightInKilos());
        System.out.println("Patient's wight in Pounds is :" + vitals.getWeightInPounds());

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
          
          //VitalSignsHistory histObject= new VitalSignsHistory();
          EncounterHistory encounterHist= new EncounterHistory();
          
          PatientDirectory patientDir= new PatientDirectory();
          
          PersonDirectory personDir= new PersonDirectory();
          
          
          
           Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Choose an option : "
                    + "\n 1> New Patient's Visit "
                    + "\n 2> View patient vital sign record "
                    + "\n 3> Check vital signs "
                    + "\n 4> Find BP cases in Community");
            String recordOption = (sc.nextLine());
          
            
         if (recordOption.equals("1") ){
                    System.out.print("Enter patient's name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter patient's age in years: ");
                    double age = Double.parseDouble(sc.nextLine());
                    System.out.print("Enter patient's house: ");
                    String house = sc.nextLine();
                    System.out.print("Enter patient's community: ");
                    String community = sc.nextLine();
                    System.out.print("Enter patient's city: ");
                    String city = sc.nextLine();
                    Patient patientInformation = new Patient(name,age, house, community, city);
                    patientDir.add(patientInformation);
                    personDir.add(patientInformation);

                    VitalSigns vitalSigns = newVitalSign(patientInformation);
                    
                    Encounter encounter= new Encounter(vitalSigns);
                    
                    patientInformation.setVitalSigns(vitalSigns);
                    
                    encounterHist.getEncounterHistoryList().add(encounter);
                    //histObject.addVital(vitalSigns);
                    System.out.println("New entry has been created");
                    
         } else if (recordOption.equals ("2") ) {
                    System.out.println("Choose an option : "
                            + "\n 1> View last entered record "
                            + "\n 2> View All recorded history ");
                    recordOption = (sc.nextLine());
                    
                      if (recordOption.equals("1") ){
                            System.out.println("Viewing latest entry: ");
                            displayLastRecordedVitalSign(encounterHist);
                            
                     } else if (recordOption.equals("2")){
                            System.out.println("Viewing historical data: ");
                            viewSignHistory(encounterHist);
                        }
                     else {
                            System.out.println("Re enter your choice: ");
                    }
        } else if (recordOption.equals("3") ) {
            
                    List<Encounter> list= encounterHist.getEncounterHistoryList();
                    if(list.size()==0)
                        System.out.println("No Patient records found");
            
                    else{
                        
                        System.out.println("Enter which vital signs to verify records for: "
                                + "\n 1> Respiratory Rate \n 2> Heart Rate "
                                + "\n 3> Blood Pressure \n 4> Weight in kilos "
                                + "\n 5> Weight in pounds ");
                        recordOption = (sc.nextLine());
                        
                        String[] options = new String[]{"Respiratory rate","Heart Rate",
                        "Blood Pressure","Weight in kilos","Weight in pounds"};
                                
                                
                        if(Integer.parseInt(recordOption)>options.length)
                        {
                            System.out.println("Invalid option");
                        }
                        else
                        {
                            System.out.println("Records: ");
                            for (int i=0; i< list.size(); i++) {
                                VitalSigns cur = list.get(i).getVitalSigns();
                                boolean isNormal = cur.isThisVitalSignNormal(options[Integer.parseInt(recordOption)]);
                                System.out.println("");
                                System.out.println("Patient: "+ cur.getInformationOfPatient().getName());
                                System.out.println("Vital Signs Recorded on: "+ cur.getDate());
                                System.out.println("Status: "+(isNormal?"Normal":"Not Normal"));
                                System.out.println("");
                            }                
                        }
                    
                    }
                   
                }else if (recordOption.equals ("4") ) {
                    System.out.println("Enter Community Name: ");
                    recordOption = (sc.nextLine());
                    
                    displayAbnormalBPForCommunity(recordOption, patientDir.getList());
                    
                } 
            
            
           }
      }
      
      
      public static void displayAbnormalBPForCommunity(String community, List<Patient> patientDir){
          int count=0;
          
          if(patientDir.size()==0)
              return;
          
          for(Patient P: patientDir)
          {
              if(P.getCommunity().equals(community))
              {
                    VitalSigns sign = P.getVitalSigns();
                    boolean isNormal = sign.isThisVitalSignNormal("Blood Pressure");
                    
                    if(!isNormal)
                        count++;
                    
              }
          }
          System.out.println("Community: "+community+ "\nAbnormal Cases: "+count);
              
          
          
      }
      
}