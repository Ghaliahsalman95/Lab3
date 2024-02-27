import java.util.ArrayList;

public class Music extends Media{
private String artist;
    public Music() {
    }
    public Music(String title, String auteur, String ISBN, double price, String artist) {
        super(title, auteur, ISBN, price);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String getMediaType() {
        if (super.getPrice()>=10){
            return "Premium Music";
        }
        return  "Music";
    }

    public void listen(User user) {
        user.purchasedMediaList.add(this);
    }


//-------------------------generatePlaylist----------------
public ArrayList<Music>generatePlaylist(ArrayList<Music> musicCatalog){
    String auteur="";
    ArrayList<Music>generatePlaylist=new ArrayList<Music>();
    for (Music music:musicCatalog) {
        if(this!=music&&music.getArtist().equalsIgnoreCase(this.getArtist())){
            generatePlaylist.add(music);
        }
    }

    return generatePlaylist;}

    @Override
    public String toString() {
        return "Music{" +super.toString()+
                "artist='" + artist + '\'' +
                '}';
    }


}
