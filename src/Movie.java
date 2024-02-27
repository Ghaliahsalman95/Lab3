import java.util.ArrayList;

public class Movie extends Media{
    private int duration;

    public Movie(int duration) {
        this.duration = duration;
    }

    public Movie() {
    }

    public Movie(String title, String auteur, String ISBN, double price, int duration) {
        super(title, auteur, ISBN, price);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
public void watch(User user) {
      // Movie movie=new Movie(super.getTitle(),super.getAuteur(),super.getISBN(),super.getPrice(),this.duration);
        user.purchasedMediaList.add(this);

}

//--------------------------recommendSimilarMovies----------------
public ArrayList<Movie> recommendSimilarMovies(ArrayList<Movie> movieCatalog){

        ArrayList<Movie>recommendSimilarMovies=new ArrayList<Movie>();
        String auteur=this.getAuteur();
        for (Movie movie:movieCatalog){
           if(movie!=this && movie.getAuteur().equalsIgnoreCase(this.getAuteur())){
               recommendSimilarMovies.add(movie);
           }
            }
        return recommendSimilarMovies;}


    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String getMediaType() {
        if (this.getDuration()>=120){
            return "Long Movie";
        }
        return "Movie";
    }

    @Override
    public String toString() {
        return "Movie{" +super.toString()+
                "duration=" + duration +
                '}';
    }
}
