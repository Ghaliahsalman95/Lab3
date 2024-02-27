import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");
        //-------------------------Object from each class ------------------------

        ArrayList<Review>bookList=new ArrayList<Review>();
        ArrayList<Review>bookList1=new ArrayList<Review>();
        ArrayList<Review>bookList2=new ArrayList<Review>();
        Book book =new Book("Book","BookAuteur","ISBN",50,10,bookList);
        Book book1 =new Book("Book1","BookAuteur1","ISBN1",100,5,bookList1);
        Book book2=new Book("Book2","BookAuteur2","ISBN2",150,5,bookList2);
        //-----------------------------------------------------
        Music music=new Music("Music","MusicAuteur","ISBN",50,"Fadia");
        Music music1=new Music("Music1","MusicAuteur1","ISBN1",100,"Fadia1");
        Music music2=new Music("Music2","MusicAuteur2","ISBN2",150,"Fadia2");

        //-------------------------------------------
        Movie movie=new Movie("movie","movieAuteur","ISBN",50,120);
        Movie movie1=new Movie("movie1","movieAuteur","ISBN1",100,220);
        Movie movie2=new Movie("movie2","movieAuteur2","ISBN2",150,100);
        //--------------------------------------------------
        Novel novel=new Novel("novel","novelauteur","ISBN",20,5,new ArrayList<Review>(),"genre");
        Novel novel1=new Novel("novel1","novelauteur1","ISBN",40,5,new ArrayList<Review>(),"genre");
        Novel novel2=new Novel("novel2","novelauteur2","ISBN",120,5,new ArrayList<Review>(),"genre");
        //------------------------------------------------------------
        AcademicBook academicBook=new AcademicBook("academicBook","academicBookAuteur","ISBN",50,10,new ArrayList<Review>(),"Subject");
        AcademicBook academicBook1=new AcademicBook("academicBook1","academicBookAuteur1","ISBN",100,20,new ArrayList<Review>(),"Subject1");
        AcademicBook academicBook2=new AcademicBook("academicBook2","academicBookAuteur2","ISBN",150,30,new ArrayList<Review>(),"Subject2");
        //---------------------------------------

        //---------------------------------------------------------
        User user=new User("Ghaliah","ghaliah@gmail.com",new ArrayList<Media>(),new ArrayList<Media>());
        User user1=new User("Riyam","Riyam@gmail.com",new ArrayList<Media>(),new ArrayList<Media>());
        User user2=new User("Sema","Sema@gmail.com",new ArrayList<Media>(),new ArrayList<Media>());

        //-------------------------------------------------------
        ArrayList<Media>mediaArrayList=new ArrayList<Media>();
        Media media=new Media("Media","Auteur","ISBN",3);
//media.set
        Store store=new Store();
        store.setMedias(mediaArrayList);
        store.addMedia(book);store.addMedia(book1);store.addMedia(book2);
        store.addMedia(music);store.addMedia(music1);store.addMedia(music2);
        store.addMedia(movie);store.addMedia(movie1);store.addMedia(movie2);
        store.addMedia(novel);store.addMedia(novel1);store.addMedia(novel2);
        store.addMedia(academicBook);store.addMedia(academicBook1);store.addMedia(academicBook1);
        ArrayList<User> users=new ArrayList<User>();
        store.setUsers(users);
        store.addUser(user);
        store.addUser(user1);
        store.addUser(user2);
       Book searchBook=store.searchBook("book");
        System.out.println("TestSearchBook "+searchBook.toString());
        user.choppingCartList.add(book);user.choppingCartList.add(book);user.choppingCartList.add(book);
       System.out.println(user.getChoppingCartList());
        user.checkout();
        user.checkout();
       System.out.println(user.getChoppingCartList());
       System.out.println(user.purchasedMediaList);
        System.out.println(store.displayMedia());
        System.out.println(store.displayUsers());
        book.restock(4);
        System.out.println(book.toString());
        ArrayList<Movie>similar=new ArrayList<Movie>();
        similar.add(movie1);similar.add(movie);similar.add(movie);
        movie.recommendSimilarMovies(similar);//like generatePlaylist
        for (Movie movie3:similar){
            System.out.println(movie3.toString());
        }
    }
}