package tenOfJuni.Article;

/**
 * Created by Konstantin on 10.06.2016.
 */
public class Article {
    // Attribute
    String author;
    String title;
    String journal;
    int year;
    String month;
    // c-tor

    public Article(String title, String author, String journal, int year, String month) {
        this.title = title;
        this.author = author;
        this.journal = journal;
        this.year = year;
        this.month = month;
    }

    public Article(String author, String title, String journal, int year) {
        this.author = author;
        this.title = title;
        this.journal = journal;
        this.year = year;
        this.month = "unknown";
    }
    //Methoden


    public String getAuthor() {
        return author;
    }

    public String getJournal() {
        return journal;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "Article{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", journal='" + journal + '\'' +
                ", year=" + year +
                ", month='" + month + '\'' +
                '}';
    }
}
