import java.util.Scanner;

public class AdminMenu {
    public static void menuAdmin(Scanner scanner, Student[] userStudent) {
        int Choice;

        do {
            System.out.println("\n===== Menu Admin =====");
            System.out.println("1. tambahkan Mahasiswa");
            System.out.println("2. List Mahasiswa");
            System.out.println("3. Logout");
            System.out.print("pilih opsi (1-3): ");

            while (!scanner.hasNextInt()) {
                System.out.println("Tolong pilih (1-3): ");
                scanner.next();
            }

            Choice = scanner.nextInt();

            switch (Choice) {
                case 1:
                    StudentMenu.addStudent(scanner, userStudent);
                    break;
                case 2:
                    displayStudents(userStudent);
                    break;
                case 3:
                    System.out.println("lokout...");
                    break;
                default:
                    System.out.println("nda ada pilihannya");
            }
        } while (Choice != 3);
    }

    private static void displayStudents(Student[] userStudent) {
        System.out.println("\n===== List Mahasiswa =====");

        for (int i = 0; i < Main.numStudents; i++) {
            System.out.println((i + 1) + "." + " "+ userStudent[i].nama  + " " + userStudent[i].nim + " " + userStudent[i].fakultas + " " + userStudent[i].prodi);
        }
    }
}
