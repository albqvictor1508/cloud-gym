import java.util.Scanner;

public class Menu {
    private Academy academy;
    private Scanner scanner;

    public Menu() {
        this.academy = new Academy();
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        int option;
        do {
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
            option = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (option) {
                case 1 -> addStudent();
                case 2 -> addTrainer();
                case 3 -> academy.listAll();
                case 4 -> updatePerson();
                case 5 -> removePerson();
                case 6 -> assignStudentToTrainer();
                case 7 -> listTrainerStudents();
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid option.");
            }
        } while (option != 0);
    }

    private void addStudent() {
        System.out.print("Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Goal: ");
        String goal = scanner.nextLine();
        academy.add(new Student(name, age, goal));
    }

    private void addTrainer() {
        System.out.print("Trainer Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.
