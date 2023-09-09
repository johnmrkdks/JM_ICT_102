package Week10;

public class song {
    //CREATE FIELDS FOR CLASS SONG
    public String title;
    public String writer;
    public String artist;
    public int duration;
    public String genre;

//CONSTRUCTOR TO TAKE THE TITLE AND ARTIST INSIDE THE CONSTRUCTOR PARAMETER
    public song(String t,String a){
        title = t;
        artist = a;
    }

    //CONSTRUCTOR THAT TAKE EACH OF THE 5 INSTANCE INSIDE THE CONSTRUCTOR PARAMETER
    public song (String t, String w, String a, int d, String g){
        title = t;
        writer = w;
        artist = a;
        duration = d;
        genre = g;
    }

    //SETTER - METHODS TO PERFORM OPERATIONS
    public void setTitle(String Title){
        title = Title;
    }
    public void setWriter(String Writer){
        writer = Writer;
    }
    public void setArtist(String Artist){
        artist = Artist;
    }
    public void setDuration(int Duration){
        duration = Duration;
    }
    public void setGenre(String Genre){
        genre = Genre;
    }


    //GETTER
    public String getTitle(){
        return title;
    }
    public String getWriter(){
        return writer;
    }
    public String getArtist(){
        return artist;
    }
    public int getDuration(){
        return duration;
    }
    public String getGenre(){
        return genre;
    }
}

