import java.util.Scanner;

class Patient {

    void addPatient(String name , int age , String address , String phone_number){
        System.out.println("-----------Basic Patient Information---------");
        System.out.println("Name           :" + name);
        System.out.println("Age            :" + age);
        System.out.println("Address        :" + address);
        System.out.println("Phone Number   :" + phone_number);
    }

    void addPatient(String name , int age , String address , String phone_number,String insurance_info , double advance_amount){

        System.out.println("---------Admitted Patient Information-------");
        System.out.println("Name                       :" + name);
        System.out.println("Age                        :" + age);
        System.out.println("Address                    :" + address);
        System.out.println("Phone Number               :" + phone_number);
        System.out.println("insurance information      :" + insurance_info);
        System.out.println("advance amount             :" + advance_amount);
    }

}
public class HospitalManagement1 {
    public static void main(String[] args) {

        Patient patient = new Patient();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        if(choice == 1){

            System.out.print("Enter Patient Name : ");
            String name = sc.nextLine();

            System.out.print("Enter Patient Age : ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Patient Address : ");
            String address = sc.nextLine();


            System.out.print("Enter Patient Phone Number : ");
            String phone_number = sc.nextLine();

            patient.addPatient(name,age,address,phone_number);

        }

        else if (choice == 2){
            System.out.print("Enter Patient Name : ");
            String name = sc.nextLine();

            System.out.print("Enter Patient Age : ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Patient Address : ");
            String address = sc.nextLine();


            System.out.print("Enter Patient Phone Number : ");
            String phone_number = sc.nextLine();

            System.out.print("Enter Patient insurance_info : ");
            String insurance_info = sc.nextLine();

            System.out.print("Enter Patient advance_amount : ");
            double advance_amount = sc.nextInt();

            patient.addPatient(name,age,address,phone_number,insurance_info,advance_amount);

        }


        }


    }

