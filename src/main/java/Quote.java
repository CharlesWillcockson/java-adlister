import java.io.Serializable;

public class Quote implements Serializable {
    private String author;
    private String quote;

    public Quote() { };

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
