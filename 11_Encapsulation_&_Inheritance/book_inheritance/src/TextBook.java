public class TextBook extends Book{

    private String size;
    private String coverForm;

    public TextBook() {
    }

    public TextBook(int id, String title, String author, String category, int pageNumber, String publisher, int releaseYear, String size, String coverForm) {
        super(id, title, author, category, pageNumber, publisher, releaseYear);
        this.size = size;
        this.coverForm = coverForm;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCoverForm() {
        return coverForm;
    }

    public void setCoverForm(String coverForm) {
        this.coverForm = coverForm;
    }
}
