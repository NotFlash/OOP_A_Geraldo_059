import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) { //methodddddd
        Scanner scanner = new Scanner(System.in);

        AdminClass admin = new AdminClass("Admin059", "Password059");
        StudentClass student = new StudentClass("Geraldo Agha", "202410370110059");

        System.out.println("Login as: ");
        System.out.println("1. Admin");
        System.out.println("2. Student");
        System.out.print("Choose option (1/2): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        boolean isSuccess = false; //megecek

        if (choice == 1) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            if (admin.login(username, password)) {
                admin.displayInfo();
                isSuccess = true;
            }

        } else if (choice == 2) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter student ID: ");
            String studentId = scanner.nextLine();

            if (student.login(name, studentId)) {
                student.displayInfo();
                isSuccess = true;
            }
        }

        if (!isSuccess) {
            System.out.println("Login failed. Please try again.");
        }

        scanner.close();
    }
}
