import java.util.Scanner;

public class Main {
    private static Student[] userStudent = new Student[100];
    public static int numStudents = 0;

    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("===== Library System =====");
            System.out.println("1. Login sebagai Admin");
            System.out.println("2. Login sebagai Mahasiswa");
            System.out.println("3. LogOut");
            System.out.print("pilih (1-3): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    AdminMenu.menuAdmin(scanner, userStudent);
                    break;
                case 2:
                    StudentMenu.inputNim(scanner, userStudent);
                    break;
                case 3:
                    System.out.println("okeh LogOut");
                    break;
                default:
                    System.out.println("Gada opsinya masbro");
            }
        } while (choice != 3);

        scanner.close();
    }
}

class Book {
    String id;
    String judul;
    String author;
    int jumlah;

    Book(String id, String judul, String author, int jumlah) {
        this.id = id;
        this.judul = judul;
        this.author = author;
        this.jumlah = jumlah;
    }
}
class Student {
    String nama;
    String nim;
    String fakultas;
    String prodi;

    Student(String nama, String nim, String fakultas, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.fakultas = fakultas;
        this.prodi = prodi;
    }
}
