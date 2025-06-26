import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook(new Book("Java Basics", "Sagar Rathod"));
        lib.addBook(new Book("Python 101", "Guido"));
        lib.addBook(new Book("Clean Code", "Robert Martin"));

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Show Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    lib.showBooks();
                    break;
                case 2:
                    System.out.print("Enter book title to issue: ");
                    String issueTitle = sc.nextLine();
                    lib.issueBook(issueTitle);
                    break;
                case 3:
                    System.out.print("Enter book title to return: ");
                    String returnTitle = sc.nextLine();
                    lib.returnBook(returnTitle);
                    break;
                case 0:
                    System.out.println("Exiting system.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);

        sc.close();
    }
}
