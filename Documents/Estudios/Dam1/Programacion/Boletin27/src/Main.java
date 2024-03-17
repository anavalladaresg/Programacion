import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add book\n2. Get book price\n3. Display books\n4. Delete books with 0 units\n5. Update book price\n6. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter book name, author, price, units:");
                    library.addBook(new Book(scanner.nextLine(), scanner.nextLine(), scanner.nextDouble(), scanner.nextInt()));
                    scanner.nextLine();
                    break;
                case 2:
                    System.out.println("Enter book name:");
                    double price = library.getBookPrice(scanner.nextLine());
                    if (price == -1) {
                        System.out.println("Book not found");
                    } else {
                        System.out.println("Price: " + price);
                    }
                    break;
                case 3:
                    library.displayBooks();
                    break;
                case 4:
                    library.deleteBook();
                    break;
                case 5:
                    System.out.println("Enter book name and new price:");
                    library.updateBookPrice(scanner.nextLine(), scanner.nextDouble());
                    scanner.nextLine();
                    break;
                case 6:
                    return;
            }
        }
    }
}
