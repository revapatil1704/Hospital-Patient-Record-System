package HospitalPatientRecorde;
import java.util.Scanner;

public class RecordSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PatientDAO dao = new PatientDAO();

        while (true) {
            System.out.println("\n1.Add Patient");
            System.out.println("2.View Patients");
            System.out.println("3.Delete Patient");
            System.out.println("4.Exit");
            System.out.print("Enter your choice:");

            int ch = sc.nextInt();

            if (ch == 1) {
                sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Age: ");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.print("Disease: ");
                String disease = sc.nextLine();
                dao.addPatient(name, age, disease);

            } else if (ch == 2) {
                dao.viewPatients();

            } else if (ch == 3) {
                System.out.print("Enter ID: ");
                dao.deletePatient(sc.nextInt());

            } else {
                System.exit(0);
            }
        }
    }
}



