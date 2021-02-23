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
public class Patient {
    
        
        private VitalSigns vitalPatientInformation;
        private double age;
        private String name;

        public VitalSigns getVitalSigns() {
            return vitalPatientInformation;
        }

        public void setVitalSigns(VitalSigns vitalSigns) {
            this.vitalPatientInformation = vitalSigns;
        }

        public double getAge() {
            return age;
        }

        public void setAge(double age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        
        public Patient (double age , String name ){
            this.age = age;
            this.name= name;
        }
        
               
        public String getgroupAge(double age) {
            String groupAge;
            if (age<1){
                groupAge= "New Born";
            } else if ( age > 0.08 && age < 1) {
                groupAge = " Infant";
            } else if (age>=1 &&  age <= 3){
                groupAge = "Toddler";
            } else if (age >= 3.08 && age <= 5)  {
                groupAge = " PreSchooler";
            } else if (age >= 5.08 && age <= 12){
                groupAge= " School Age";
            } else if ( age >= 12.08){
                groupAge= " Adolescent";
            } else {
                groupAge = "Invaild age";
                
            }
            return groupAge;
        }   
                                
        public double monthsToYears(double age)
       {
           double ageInYears = age / 12;
           return ageInYears;
       }

    public boolean isPatientNormal() {
        int respiratoryRate = vitalPatientInformation.getRespiratoryRate();
        int heartRate = vitalPatientInformation.getHeartRate();
        int bloodPressure = vitalPatientInformation.getBloodPressure();
        double weightInKilos = vitalPatientInformation.getWeightInKilos();
        double weightInPounds= vitalPatientInformation.getWeightInPounds();   



        String groupAge= getgroupAge(monthsToYears(age)); 
        if(groupAge == "New Born"){
            System.out.println("Vital sings of new born normal ");
            if ((respiratoryRate <= 50 && respiratoryRate >= 30)
                    && (heartRate <= 160 && heartRate >= 120)
                    && (bloodPressure <= 70 && bloodPressure >= 50)
                    && (weightInKilos <= 3 && weightInKilos >= 2)
                    && (weightInPounds <= 7 && weightInPounds >= 4.5)) {
                return true;
            } else {
                return false;
            }
        } else if ( groupAge =="Infant"){
            System.out.println("Vital sings of infant normal ");
            if ((respiratoryRate <= 30 && respiratoryRate >= 20)
                    && (heartRate <= 140 && heartRate >= 80)
                    && (bloodPressure <= 100 && bloodPressure >= 70)
                    && (weightInKilos <= 10 && weightInKilos >= 4)
                    && (weightInPounds <= 22 && weightInPounds >= 9)) {
                return true;
            } else {
                return false;
            }

        } else if  (groupAge== "Toddler") {
            System.out.println("Vital sings of infant ");
            if ((respiratoryRate <= 30 && respiratoryRate >= 20)
                    && (heartRate <= 130 && heartRate >= 80)
                    && (bloodPressure <= 110 && bloodPressure >= 80)
                    && (weightInKilos <= 14 && weightInKilos >= 10)
                    && (weightInPounds <= 31 && weightInPounds >= 22)) {
                return true;
            } else {
                return false;
            }

        }else if ( groupAge== "PreSchooler"){
            System.out.println("Vital sings of pre schooler ");
            if ((respiratoryRate <= 30 && respiratoryRate >= 20)
                    && (heartRate <= 120 && heartRate >= 80)
                    && (bloodPressure <= 110 && bloodPressure >= 80)
                    && (weightInKilos <= 18 && weightInKilos >= 14)
                    && (weightInPounds <= 40 && weightInPounds >= 31)) {
                return true;
            } else {
                return false;
            }

        } else if (groupAge== "School Age"){
            System.out.println("Vital sings of School Age ");
            if ((respiratoryRate <= 30 && respiratoryRate >= 20)
                    && (heartRate <= 110 && heartRate >= 70)
                    && (bloodPressure <= 120 && bloodPressure >= 80)
                    && (weightInKilos <= 42 && weightInKilos >= 20)
                    && (weightInPounds <= 92 && weightInPounds >= 41)) {
                return true;
            } else {
                return false;
            }

        }else if (groupAge == "Adolescent"){
            System.out.println("Vital sings of Adolscent ");
            if ((respiratoryRate <= 20 && respiratoryRate >= 12)
                    && (heartRate <= 105 && heartRate >= 55)
                    && (bloodPressure <= 120 && bloodPressure >= 110)
                    && (weightInKilos > 50)
                    && (weightInPounds > 110)) {
                return true;
            } else {
                return false;
            }

        }else if ( groupAge == "Invalid Age")
            System.out.println("Enter a Valid Age");
            return false;

    }
    
}
