package zajecia.dziewiate;

public class Book {
    private String title;
    private String author;
    private int numberOfPages;
    private String description;
    private String[] content;
    private String category;
    private int releaseDate;

    //konstruktor
    public Book(String title, String author, int releaseDate, String description, String[] content, String category) {
        this(title, author, releaseDate, content);
        this.description = description;
        this.category = category;
    }

    public Book(String title, String author, int releaseDate, String[] content) {
        this.title = title;
        this.author = author;
        this.numberOfPages = content.length;
        this.content = content;
        this.releaseDate = releaseDate;
    }

    public Book() {
    }

    public String getPage(int index) {
        int actualIndex = index-1;
//        if (actualIndex >= 0 && actualIndex < this.numberOfPages) {
//            return  content[actualIndex];
//        } else {
//            return "Brak strony";
//        }
        return (actualIndex >= 0 && actualIndex < this.numberOfPages) ? content[actualIndex] : "Brak strony";
    }


    public void printBook() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(title)
                .append(" ")
                .append(author)
                .append(" ")
                .append(numberOfPages)
                .append(" ")
                .append(description);
    }
    //mozliwe metody

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getDescription() {
        return description;
    }

    public String[] getContent() {
        return content;
    }

    public String getCategory() {
        return category;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                '}';
    }
}
