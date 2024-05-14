import java.util.Scanner;

public class MainAssignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter maximum queue capacity: ");
        int maxQueue = scanner.nextInt();
        QueueAssignment queue = new QueueAssignment(maxQueue);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Patient to Queue");
            System.out.println("2. Serve Patient (Dequeue)");
            System.out.println("3. Show Front Patient");
            System.out.println("4. Show Rear Patient");
            System.out.println("5. Find Patient Position by Name");
            System.out.println("6. Show All Patients");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter patient name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter patient ID number: ");
                    int idNumber = scanner.nextInt();
                    System.out.print("Enter patient gender (M/F): ");
                    char gender = scanner.next().charAt(0);
                    System.out.print("Enter patient age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();  // Consume newline

                    PatientAssignment patient = new PatientAssignment(name, idNumber, gender, age);
                    queue.enqueue(patient);
                    break;

                case 2:
                    PatientAssignment served = queue.dequeue();
                    if (served != null) {
                        System.out.println("Served patient: " + served);
                    }
                    break;

                case 3:
                    queue.peek();
                    break;

                case 4:
                    queue.peekRear();
                    break;

                case 5:
                    System.out.print("Enter the name of the patient to find: ");
                    String searchName = scanner.nextLine();
                    queue.peekPosition(searchName);
                    break;

                case 6:
                    queue.listPatients();
                    break;

                case 7:
                    System.out.println("Thank you. Exiting the program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
