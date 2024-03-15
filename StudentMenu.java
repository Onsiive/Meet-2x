import java.util.Scanner;

public class StudentMenu {
    public static void inputNim(Scanner scanner, Student[] userStudent) {
        System.out.print("Masukkan NIM: ");
        String nim = scanner.next();

        if (checkNim(nim)) {
            System.out.println("berhasil login ke NIM: "+ nim );
            menuStudent(scanner);
        } else {
            System.out.println("Invalid NIM. Please try again.");
        }
    }

    private static boolean checkNim(String nim) {
        return nim.length() == 15;
    }

    private static void menuStudent(Scanner scanner) {
        int choice;

        do {
            System.out.println("\n===== Menu Mahasiswa =====");
            System.out.println("1. List Buku");
            System.out.println("2. Logout");
            System.out.print("Choose option (1-2): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Method to display books
                    break;
                case 2:
                    System.out.println("Donn..");
                    break;
                default:
                    System.out.println("nda ada pilihannya");
            }
        } while (choice != 2);
    }

    public static void addStudent(Scanner scanner, Student[] userStudent) {
        scanner.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();

        System.out.print("fakultas: ");
        String fakultas = scanner.nextLine();

        System.out.print("prodi: ");
        String prodi = scanner.nextLine();

        if (checkNim(nim)) {
            userStudent[Main.numStudents] = new Student(nama, nim, fakultas, prodi);
            Main.numStudents++;
            System.out.println("data Mahasiswa sudah di tambahkan");
        } else {
            System.out.println("Nim mu gak sesuai");
        }
    }
}
