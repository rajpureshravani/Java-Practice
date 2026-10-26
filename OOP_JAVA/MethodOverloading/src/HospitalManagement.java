import java.util.Scanner;

class Hospital {

     void addPatient(String name , int age , String address , int phone_number){
         System.out.println("Name           :" + name);
         System.out.println("Age            :" + age);
         System.out.println("Address        :" + address);
         System.out.println("Phone Number   :" + phone_number);
     }

     void addPatient(String name , int age , String address , int phone_number,String insurance_info , double advance_amount){
         System.out.println("Name                       :" + name);
         System.out.println("Age                        :" + age);
         System.out.println("Address                    :" + address);
         System.out.println("Phone Number               :" + phone_number);
         System.out.println("insurance information      :" + insurance_info);
         System.out.println("advance amount             :" + advance_amount);
     }

}
public class HospitalManagement {
    public static void main(String[] args) {

        Hospital hospital = new Hospital();
       // Hospital hospital1 = new Hospital();

        hospital.addPatient("Kartik" , 25 ,"Pune",390883918);
        hospital.addPatient("Prem",36,"Mumbai" ,1234567890,"Insurance health",3500000);



    }
}
