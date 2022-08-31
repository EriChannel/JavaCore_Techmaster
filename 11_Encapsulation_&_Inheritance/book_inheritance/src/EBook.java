public class EBook extends Book{
    private float capacity;
    private int download;

    public EBook() {
    }

    public EBook(int id, String title, String author, String category, int pageNumber, String publisher, int releaseYear, float capacity, int download) {
        super(id, title, author, category, pageNumber, publisher, releaseYear);
        this.capacity = capacity;
        this.download = download;
    }

    public float getCapacity() {
        return capacity;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    public int getDownload() {
        return download;
    }

    public void setDownload(int download) {
        this.download = download;
    }
}
