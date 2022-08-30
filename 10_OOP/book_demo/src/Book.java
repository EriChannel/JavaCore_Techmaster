public class Book {
    public int id;
    public String title;
    public String author;
    public String category;
    public String publishingCompany;
    public int releaseYear;

    public Book() {
    }

    public Book(int id, String title, String author, String category, String publishingCompany, int releaseYear) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.publishingCompany = publishingCompany;
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return id + " - " + title + " - " + author + " - " + category +
                " - " + publishingCompany + " - " + releaseYear;
    }
}
