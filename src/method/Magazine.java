package method;

public class Magazine extends Item {   // Inheritance nya item
    private String editor;

    public Magazine(String id, String title, String publisher, String editor) {
        super(id, title, publisher);
        this.editor = editor;
    }

    public String getEditor() {
        return editor;
    }

    @Override
    public void displayInfo() {
        System.out.println("Magazine: " + getTitle() + " edited by " + editor + " (" + getPublisher() + ")");
    }
}
