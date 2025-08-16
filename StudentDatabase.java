import java.util.*;

class StudentDatabase {
    Scanner sc = new Scanner(System.in);
    HashMap<Integer, Student> students = new HashMap<>();

    void addStudent() {
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();
        students.put(roll, new Student(roll, name, marks));
        System.out.println("✅ Student Added Successfully!");
    }

    void updateMarks() {
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();
        if (students.containsKey(roll)) {
            System.out.print("Enter New Marks: ");
            int marks = sc.nextInt();
            Student s = students.get(roll);
            s.marks = marks;
            s.grade = s.calculateGrade(marks);
            System.out.println("✅ Marks Updated!");
        } else {
            System.out.println("❌ Student Not Found!");
        }
    }

    void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("⚠️ No student records found!");
            return;
        }
        System.out.println("\nRoll | Name | Marks | Grade");
        for (Student s : students.values()) {
            System.out.println(s);
        }
    }

    void viewStudent(int roll) {
        if (students.containsKey(roll)) {
            System.out.println("\nDetails: " + students.get(roll));
        } else {
            System.out.println("❌ Student Not Found!");
        }
    }
}
