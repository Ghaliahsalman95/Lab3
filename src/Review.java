public class Review {

    // username, rating, and comments.
    private String username,  comments;
private int rating;
    public Review() {
    }

    public Review(String username, int rating, String comments) {
        this.username = username;
        this.rating = rating;
        this.comments = comments;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
