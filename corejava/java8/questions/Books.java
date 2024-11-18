package questions;

public class Books {
    private String title;
    private String author;
    private String genre;
    private float rating;

    Books(String title,String author,String genre,float rating){
        this.title=title;
        this.author=author;
        this.genre=genre;
        this.rating=rating;
    }

    public Books(String abc, String ravi) {
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public float getRating() {
        return rating;
    }
}
