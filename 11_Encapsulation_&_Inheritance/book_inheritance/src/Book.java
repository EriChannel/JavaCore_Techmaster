public class Book {
    private int id;
    private String title;
    private String author;
    private String category;
    private int pageNumber;
    private String publisher;
    private int releaseYear;

    public Book(int id, String title, String author, String category, int pageNumber, String publisher, int releaseYear) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.pageNumber = pageNumber;
        this.publisher = publisher;
        this.releaseYear = releaseYear;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}
