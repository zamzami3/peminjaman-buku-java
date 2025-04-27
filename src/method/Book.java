package method;

public class Book extends Item {
    private String author; 

    public Book(String id, String title, String publisher, String author) {
        super(id, title, publisher);
        this.author = author; 
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public void displayInfo() {
        System.out.println("Book: " + getTitle() + " by " + author + " (" + getPublisher() + ")");
    }
}
