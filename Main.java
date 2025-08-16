import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static StudentDatabase db = new StudentDatabase();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Student Result Management System ---");
            System.out.println("1. Admin");
            System.out.println("2. Student");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> adminMenu();
                case 2 -> studentMenu();
                case 3 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    static void adminMenu() {
        while (true) {
            System.out.println("\n--- Admin Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. Update Marks");
            System.out.println("3. View All Students");
            System.out.println("4. Back");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1 -> db.addStudent();
                case 2 -> db.updateMarks();
                case 3 -> db.viewAllStudents();
                case 4 -> { return; }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    static void studentMenu() {
        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        db.viewStudent(roll);
    }
}
