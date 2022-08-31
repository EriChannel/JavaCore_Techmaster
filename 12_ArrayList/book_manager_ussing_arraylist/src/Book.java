public class Book {
    private int id;
    private String title;
    private String author;
    private String category;
    private String publishingCompany;
    private int releaseYear;

    public Book(int id, String title, String author, String category, String publishingCompany, int releaseYear) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.publishingCompany = publishingCompany;
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

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return id + " - " + title + " - " + author + " - " + category +
                " - " + publishingCompany + " - " + releaseYear;
    }
}
