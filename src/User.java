import java.util.ArrayList;

public class User {

    private String username, email;
    ArrayList<Media>purchasedMediaList,choppingCartList;

    public User() {
    }

    public User(String username, String email, ArrayList<Media> purchasedMediaList, ArrayList<Media> choppingCartList) {
        this.username = username;
        this.email = email;
        this.purchasedMediaList = purchasedMediaList;
        this.choppingCartList = choppingCartList;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Media> getPurchasedMediaList() {
        return purchasedMediaList;
    }

    public void setPurchasedMediaList(ArrayList<Media> purchasedMediaList) {
        this.purchasedMediaList = purchasedMediaList;
    }

    public ArrayList<Media> getChoppingCartList() {
        return choppingCartList;
    }

    public void setChoppingCartList(ArrayList<Media> choppingCartList) {
        this.choppingCartList = choppingCartList;
    }

    public void addToCart(Media media){
        choppingCartList.add(media);
    }
    public void removeFromCart(Media media){
        choppingCartList.remove(media);
    }
public void checkout(){
        for (Media media:choppingCartList){
            if(media instanceof Book && ((Book) media).getStock()>0){
                purchasedMediaList.add(media);
                ((Book) media).setStock(((Book) media).getStock()-1);
            }else {
                purchasedMediaList.add(media);
            }
        }

}



}
