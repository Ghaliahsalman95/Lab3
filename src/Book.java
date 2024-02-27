import java.util.ArrayList;

public class Book extends Media{
    //quantity in stock, list of reviews.
    protected int stock;
    ArrayList<Review> reviews;

    public Book() {
    }

    public Book(String title, String auteur, String ISBN, double price, int stock,  ArrayList<Review> reviews) {
        super(title, auteur, ISBN, price);
        this.stock = stock;
        this.reviews = reviews;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    public void addReview(Review review){
        reviews.add(review);
    }
    //-------------------------------------------getAverageRating----------------

    public double getAverageRating(){
        double rate=0;
        if(reviews.isEmpty()){return 0;}
        for (Review r:reviews){
            rate+=r.getRating();
        }
        return rate/reviews.size();
    }

    public void purchase(User user){
        if(this.getStock()>0){
            user.purchasedMediaList.add(this);
        this.setStock(this.getStock()-1);}}
    //--------------------------------------------isBestseller-------------------
            public boolean isBestseller(){
            return this.getAverageRating()>=4.5;
            }
            //--------------------------restock---------------------------
public void restock(int quantity){
        this.setStock(this.getStock()+quantity);
    System.out.println("Restoking "+this.getTitle()+
            " with "+quantity+
            " "+this.getStock());}
    //----------------------------------getMediaType-------------------------
    @Override
    public String getMediaType() {

        if (this.getAverageRating() >= 4.5) {
            return "Bestselling Book";
        }
        return "Book";}

    @Override
    public String toString() {
        return "Book{" +super.toString()+
                "stock=" + stock +
                ", reviews=" + reviews +
                '}';
    }
}
