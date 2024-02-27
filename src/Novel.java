import java.util.ArrayList;

public class Novel extends Book{
private String genre;

    public Novel() {
    }

    public Novel(String genre) {
        this.genre = genre;
    }

    public Novel(String title, String auteur, String ISBN, double price, int stock, ArrayList<Review> reviews, String genre) {
        super(title, auteur, ISBN, price, stock, reviews);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String getMediaType() {
       if( this.getAverageRating()>= 4.5) {
            return "Bestselling Novel";
        }
        return "Novel";}

    public double getAverageRating(){
        double rate = 0;
//      Review r
        for (Review r : super.reviews) {
            rate += r.getRating();
        }
       return rate /= super.reviews.size();
    }

    @Override
    public String toString() {
        return "Novel{" +super.toString()+
                "genre='" + genre + '\'' +
                '}';
    }
}
