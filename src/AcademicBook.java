import java.util.ArrayList;

public class AcademicBook extends Book{
    private String subject;

    public AcademicBook() {
    }

    public AcademicBook(String subject) {
        this.subject = subject;
    }

    public AcademicBook(String title, String auteur, String ISBN, double price, int stock, ArrayList<Review> reviews, String subject) {
        super(title, auteur, ISBN, price, stock, reviews);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String getMediaType() {
        /*getMediaType(): return "Bestselling AcademicBook" if Average Rating
        more than or equel 4.5, else return "AcademicBook".*/
        //super.reviews;
//        double rate = 0;
////      Review r
//        for (Review r : super.reviews) {
//            rate += r.getRating();
//        }
//        rate /= super.reviews.size();

        if (super.getAverageRating() >= 4.5) {
            return "Bestselling AcademicBook";
        }
    return "AcademicBook";}
    @Override
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
        return "AcademicBook{" +super.toString()+
                "subject='" + subject + '\'' +
                '}';
    }
}
