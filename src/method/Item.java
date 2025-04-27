package method;

public abstract class Item {
    private String id;
    private String title;
    private String publisher;
    private boolean isBorrowed; 

    public Item(String id, String title, String publisher) {
        this.id = id;
        this.title = title;
        this.publisher = publisher;
        this.isBorrowed = false; // Default itemnya belum dipinjam
    }
 
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }
    
    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }

    public abstract void displayInfo();  // Realization
}
