class Student {
    int rollNo;
    String name;
    int marks;
    String grade;

    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        this.grade = calculateGrade(marks);
    }

    String calculateGrade(int marks) {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 50) return "C";
        else return "F";
    }

    @Override
    public String toString() {
        return rollNo + " | " + name + " | " + marks + " | " + grade;
    }
}
