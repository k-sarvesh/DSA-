import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Attendence attendance = new Attendence(0, "", "");
        System.out.print("========================================\nSTUDENT ATTENDANCE & DIRECTORY\n========================================\n");
        System.out.println("1. Add Student");
        System.out.println("2. Mark Attendance");
        System.out.println("3. View Present Students");
        System.out.println("4. View All Registered Students");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        int n = sc.nextInt();


        switch(n){
            case 1:
                System.out.println("Enter ID: ");
                int id = sc.nextInt();
                System.out.println("Enter Name: ");
                String name = sc.next();
                System.out.println("Enter Email: ");
                String email = sc.next();
                Students student = new Students(id, name, email);
                attendance.registerStudent(student);
                System.out.println("Student added successfully!");
                break;
                
            case 2:
                System.out.println("Enter the student id to mark attendance: ");
                int studentId = sc.nextInt();
                if (!attendance.hasStudent(studentId)) {
                    System.out.println("Student not found.");
                } else if (attendance.isPresent(studentId)) {
                    System.out.println("Attendance already marked for this student today.");
                } else {
                    attendance.markAttendance(studentId);
                    System.out.println("Attendance marked successfully!");
                }
                break;

            case 3:
                System.out.println("Present Students today: " + attendance.presentToday());
                for(Students s : attendance.getPresentStudents()){
                    System.out.println(s);
                }
                break;
                

            case 4:
                System.out.println("All Registered Students: ");
                for(Students s : attendance.getRegisteredStudents()){
                    System.out.println(s);
                }
                break;

            case 5:
                System.out.println("Exiting the program.");
                break;

                
            default:
                System.out.println("Invalid choice");
        }

    }
}
