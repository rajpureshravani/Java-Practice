
class Patient{
    int patientId;
    String name ;
    int age;
    String disease;
    int roomNo;

    static  String hospitalName;
    static int totalPatients;

    Patient(int patientId , String  name , int age , String  disease , int roomNo){

        this.patientId = patientId;
        this.name = name ;
        this.age = age;
        this.disease = disease;
        this.roomNo = roomNo;


        totalPatients ++;
    }

    void display(){

        System.out.println("Id           :" + patientId);
        System.out.println("Name         :" + name);
        System.out.println("Age          :" + age);
        System.out.println("Disease      :" + disease);
        System.out.println("RoomNo       :" + roomNo);

    }

    static void searchPatient(Patient[] patients, int patientId) {

        for (int i = 0; i < totalPatients; i++) {

            if (patients[i].patientId == patientId) {

                System.out.println("Patients Found!");
                patients[i].display();
                return;
            }
        }

        System.out.println("Patient not found.");
    }

    static void updateRoom(Patient[] patients, int patientId, int roomNo) {

        for (int i = 0; i < totalPatients; i++) {

            if (patients[i].patientId == patientId) {

                patients[i].roomNo = roomNo;

                System.out.println("Update Room");
                patients[i].display();

                return;
            }
        }

        System.out.println("Patient not found.");
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
    Patient[] patients = new Patient[500];

    Patient.searchPatient(patients,103);

    Patient patient1 = new Patient(101,"Durva Jadhav" ,23,"Fever" ,8);
    Patient patient2 = new Patient(102,"Mona Pandit" ,33,"Covid" ,8);
    Patient patient3 = new Patient(103,"Sham Rathe" ,43,"Diabetes" ,8);

        patients[0] = patient1;
        patients[1] = patient2;
        patients[2] = patient3;

        System.out.println("Total Patients : " + Patient.totalPatients);
        Patient.updateRoom( patients,102,8);

        System.out.println("--------Patient Details-----------");
        for (int i = 0; i < Patient.totalPatients; i++) {

            patients[i].display();

        }

    }
}
