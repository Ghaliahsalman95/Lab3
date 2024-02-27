import java.util.ArrayList;

public class Store {

    private ArrayList<User> users;
    private ArrayList<Media> medias;

    public Store() {
    }

    public Store(ArrayList<User> users, ArrayList<Media> medias) {
        this.users = users;
        this.medias = medias;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<Media> getMedias() {
        return medias;
    }

    public void setMedias(ArrayList<Media> medias) {
        this.medias = medias;
    }

    public void addUser(User user) {
        for (User u : users) {
            if (!user.getUsername().equalsIgnoreCase(u.getUsername()))
                this.users.add(user);
        }//prevent duplication;
    }

    public ArrayList<User> displayUsers() {
        return this.users;
    }

    public void addMedia(Media media) {
        medias.add(media);
    }

    public ArrayList<Media> displayMedia() {
        return this.medias;
    }

    public Book searchBook(String title) {
        Book book = new Book();
        for (Media media:medias) {
            if (media instanceof Book) {
                if (media.getTitle().equalsIgnoreCase(title)) {
                    {//i use instanceof to check if it book then return all its information
   book = new Book(media.getTitle(), media.getAuteur(),media.getISBN(),
           media.getPrice(), ((Book)  media).getStock(),  ((Book) media).getReviews());
                    return book;}
                }
            }

        }
        return book;

    }



}