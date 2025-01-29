import java.util.*;

public class StudentManagementSystem {

    // Student class
    static class Student {
        private String name;
        private int age;
        private String studentId;
        private double grade;

        public Student(String name, int age, String studentId, double grade) {
            this.name = name;
            this.age = age;
            this.studentId = studentId;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getStudentId() {
            return studentId;
        }

        public double getGrade() {
            return grade;
        }

        public void setGrade(double grade) {
            this.grade = grade;
        }

        @Override
        public String toString() {
            return String.format("Student ID: %s, Name: %s, Age: %d, Grade: %.2f", studentId, name, age, grade);
        }
    }

    // StudentDatabase class
    static class StudentDatabase {
        private Map<String, Student> studentMap;

        public StudentDatabase() {
            studentMap = new HashMap<>();
        }

        public void addStudent(Student student) {
            studentMap.put(student.getStudentId(), student);
        }

        public void removeStudent(String studentId) {
            studentMap.remove(studentId);
        }

        public Student getStudent(String studentId) {
            return studentMap.get(studentId);
        }

        public List<Student> getAllStudents() {
            return new ArrayList<>(studentMap.values());
        }

        public void updateGrade(String studentId, double grade) {
            Student student = studentMap.get(studentId);
            if (student != null) {
                student.setGrade(grade);
            } else {
                System.out.println("Student not found!");
            }
        }
    }

    // Main method for the system
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentDatabase database = new StudentDatabase();
        int choice;

        do {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. View Student Details");
            System.out.println("4. View All Students");
            System.out.println("5. Update Student Grade");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Student Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Student ID: ");
                    String studentId = scanner.nextLine();
                    System.out.print("Enter Student Grade: ");
                    double grade = scanner.nextDouble();
                    Student student = new Student(name, age, studentId, grade);
                    database.addStudent(student);
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    System.out.print("Enter Student ID to remove: ");
                    String removeId = scanner.nextLine();
                    database.removeStudent(removeId);
                    System.out.println("Student removed successfully!");
                    break;

                case 3:
                    System.out.print("Enter Student ID to view: ");
                    String viewId = scanner.nextLine();
                    Student studentDetails = database.getStudent(viewId);
                    if (studentDetails != null) {
                        System.out.println(studentDetails);
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;

                case 4:
                    List<Student> allStudents = database.getAllStudents();
                    if (allStudents.isEmpty()) {
                        System.out.println("No students available.");
                    } else {
                        for (Student s : allStudents) {
                            System.out.println(s);
                        }
                    }
                    break;

                case 5:
                    System.out.print("Enter Student ID to update grade: ");
                    String gradeId = scanner.nextLine();
                    System.out.print("Enter new grade: ");
                    double newGrade = scanner.nextDouble();
                    database.updateGrade(gradeId, newGrade);
                    System.out.println("Grade updated successfully!");
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
