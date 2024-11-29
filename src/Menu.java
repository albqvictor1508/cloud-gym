import java.util.Scanner;

public class Menu {
    private final CloudGym cloudGym;
    private final Scanner scanner;

    public Menu() {
        this.cloudGym = new CloudGym();
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        int option = -1;
        do {
            try {
                System.out.println("\n--- Gym Management System ---");
                System.out.println("1. Add Student");
                System.out.println("2. Add Trainer");
                System.out.println("3. List People");
                System.out.println("4. Update Person");
                System.out.println("5. Remove Person");
                System.out.println("6. Assign Student to Trainer");
                System.out.println("7. List Trainer's Students");
                System.out.println("0. Exit");
                System.out.print("Choose an option: ");
                option = Integer.parseInt(scanner.nextLine());

                switch (option) {
                    case 1 -> addStudent();
                    case 2 -> addTrainer();
                    case 3 -> cloudGym.listAll();
                    case 4 -> update();
                    case 5 -> removePerson();
                    case 6 -> assignStudentToTrainer();
                    case 7 -> listTrainerStudents();
                    case 0 -> System.out.println("Exiting...");
                    default -> System.out.println("Invalid option.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        } while (option != 0);
    }


    private void addStudent() {
        try {
            System.out.println("Student id: ");
            int id = Integer.parseInt(scanner.nextLine());

            System.out.print("Student Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = Integer.parseInt(scanner.nextLine());
            if (age <= 0) {
                System.out.println("Age must be a positive number.");
                return;
            }

            System.out.print("Payment day: ");
            int paymentDay = Integer.parseInt(scanner.nextLine());

            cloudGym.add(new Student(name, age, paymentDay, id));
            System.out.println("Student added successfully!");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Age must be a number.");
        }
    }

    private void update() {
        try {
            System.out.print("Enter the index of the person to update: ");
            int index = Integer.parseInt(scanner.nextLine());

            Person person = cloudGym.consult(index);
            if (person == null) {
                System.out.println("Invalid index. No person found.");
                return;
            }

            System.out.println("Updating " + person.getName());
            System.out.print("New Name: ");
            String newName = scanner.nextLine();

            System.out.print("New Age: ");
            int newAge = Integer.parseInt(scanner.nextLine());
            if (newAge <= 0) {
                System.out.println("Age must be a positive number.");
                return;
            }

            if (person instanceof Student) {
                System.out.print("New Payment Day: ");
                int newPaymentDay = Integer.parseInt(scanner.nextLine());
                cloudGym.update(index, new Student(newName, newAge, newPaymentDay, person.getId()));
                System.out.println("Student updated successfully!");
                return;
            }

            if (person instanceof PersonalTrainer) {
                cloudGym.update(index, new PersonalTrainer(newName, newAge, person.getId()));
                System.out.println("Trainer updated successfully!");
                return;
            }

            System.out.println("Person type not recognized.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please try again.");
        }
    }

    private void removePerson() {
        System.out.print("Enter the id of the person to remove: ");
        int id = Integer.parseInt(scanner.nextLine());
        if (!cloudGym.removeById(id)) {
            System.out.println("Person not found.");
            return;
        }
        System.out.println("Person removed successfully.");
    }

    private void addTrainer() {
        try {
            System.out.print("Trainer ID: ");
            int id = Integer.parseInt(scanner.nextLine());

            System.out.print("Trainer Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = Integer.parseInt(scanner.nextLine());
            if (age <= 0) {
                System.out.println("Age must be a positive number.");
                return;
            }

            cloudGym.add(new PersonalTrainer(name, age, id));
            System.out.println("Trainer added successfully!");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Age and ID must be numbers.");
        }

    }

    private void assignStudentToTrainer() {
        try {
            System.out.print("Enter Trainer ID: ");
            int trainerId = Integer.parseInt(scanner.nextLine());

            Person trainer = cloudGym.findById(trainerId);
            if (!(trainer instanceof PersonalTrainer)) {
                System.out.println("Trainer not found or invalid ID.");
                return;
            }

            System.out.print("Enter Student ID: ");
            int studentId = Integer.parseInt(scanner.nextLine());

            Person student = cloudGym.findById(studentId);
            if (!(student instanceof Student)) {
                System.out.println("Student not found or invalid ID.");
                return;
            }

            ((PersonalTrainer) trainer).addStudent((Student) student);
            System.out.println("Student assigned to Trainer successfully!");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. IDs must be numbers.");
        }
    }

    private void listTrainerStudents() {
        try {
            System.out.print("Enter Trainer ID: ");
            int trainerId = Integer.parseInt(scanner.nextLine());

            Person trainer = cloudGym.findById(trainerId);
            if (!(trainer instanceof PersonalTrainer personalTrainer)) {
                System.out.println("Trainer not found or invalid ID.");
                return;
            }

          System.out.println("Students assigned to Trainer " + personalTrainer.getName() + ":");
            if (personalTrainer.getStudents().isEmpty()) {
                System.out.println("No students assigned.");
                return;
            }

            for (Student student : personalTrainer.getStudents()) {
                System.out.println("- " + student.getName() + " (ID: " + student.getId() + ")");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Trainer ID must be a number.");
        }
    }

}
