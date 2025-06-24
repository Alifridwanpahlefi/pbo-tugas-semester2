package tugasdirumah230625;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Lif Ridwan", "lifridwan.com");
        Book book = new Book("ISBN123456", "Belajar Java", author, 79000.0, 10);

        System.out.println(author);
        System.out.println(book);
    }
}
