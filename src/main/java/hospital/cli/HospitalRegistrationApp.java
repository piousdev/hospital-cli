package hospital.cli;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

/**
 * The type Hospital registration app is the main class of the application.
 */
public class HospitalRegistrationApp {

    /**
     * The entry point the of application.
     *
     * @param args the input arguments
     */
    public static void main (String[] args) {
        // Spring application context is a container that holds all the beans of the application.
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        VisitorService visitorService = context.getBean(VisitorService.class);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            LocalDateTime timestamp = LocalDateTime.now();
            System.out.println(timestamp);
            System.out.println("Enter command (register, report, or exit):");
            String command = scanner.nextLine();

            if ("register".equalsIgnoreCase(command)) {
                System.out.println("Enter your first name:");
                String firstName = scanner.nextLine();
                System.out.println("Enter your last name:");
                String lastName = scanner.nextLine();

                System.out.println("Choose a doctor (1, 2, or leave empty):");
                System.out.println("1. Dr. Tesse (Cardiologist)");
                System.out.println("2. Dr. Yousra (Neurologist)");
                String doctorChoice = scanner.nextLine();

                Doctor doctor = null;
                if ("1".equals(doctorChoice)) {
                    doctor = new Doctor("Dr. Tesse", "Cardiologist");
                } else if ("2".equals(doctorChoice)) {
                    doctor = new Doctor("Dr. Yousra", "Neurologist");
                } else {
                    System.out.println("You have chosen to visit a patient.");
                }

                Visitor visitor = new Visitor(firstName, lastName, doctor, LocalDateTime.now());
                visitorService.registerVisitor(visitor);
                System.out.println("You have successfully registered for the visit!");

            } else if ("report".equalsIgnoreCase(command)) {
                List<Visitor> visitors = visitorService.getVisitorsReport();
                if (visitors.isEmpty()) {
                    System.out.println("No visitors have been registered yet.");
                } else {
                    System.out.println("Visitor Report:");
                    for (Visitor visitor : visitors) {
                        String visitPurpose = visitor.doctor() != null ? "Doctor: " + visitor.doctor().name() : "Visiting a patient";
                        System.out.printf("Name: %s %s, Purpose: %s, Timestamp: %s%n",
                                visitor.name(), visitor.lastName(), visitPurpose, visitor.timestamp());
                    }
                }

            } else if ("exit".equalsIgnoreCase(command)) {
                System.out.println("Exiting the application...");
                break;

            } else {
                System.out.println("Invalid command. Please try again.");
            }
        }
        scanner.close();
    }
}