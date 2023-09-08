package Week10;
import java.util.Scanner;
import Week10.song;


public class assessment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //calling the constructor in song class
        song song1 = new song("Beautiful", "Akon");
        song song2 = new song("Smack That", "Akon", "Akon", 12, "pop");

        //asking the user to input the song title and artist
        System.out.println("\nFor the First song object, the USER will only provide song title and artist\n");
        System.out.print("Enter the title of the first song: ");
        song1.title = sc.nextLine();
        System.out.print("Enter the artist of the first song: ");
        song1.artist = sc.nextLine();

        //printing the song title and artist give by the user
        System.out.println("Title : "+song1.title + "\nArtist : "+song1.artist);

        //asking for the song details
        System.out.println("\nFor the Second song object, the USER will provide ALL the song information for all Instance variables\n");
        System.out.print("Enter the title: ");
        song2.title = sc.nextLine();
        System.out.print("Enter the artist: ");
        song2.artist= sc.nextLine();
        System.out.print("Enter the writer: ");
        song2.writer = sc.nextLine();
        System.out.print("Enter the genre: ");
        song2.genre = sc.nextLine();
        System.out.print("Enter the duration: ");
        song2.duration = sc.nextInt();

        //displaying all song informations
        System.out.println("\nUse ACCESSOR functions from song class to display all song information\n");
        System.out.println("Title: "+song2.title);
        System.out.println("Writer: "+song2.writer);
        System.out.println("Artist: "+song2.artist);
        System.out.println("Duration: "+song2.duration);
        System.out.println("Genre: "+song2.genre);

        //manual modification the song information in song class
        System.out.println("\nUse MUTATOR functions from song class to modify song ARTIST and GENRE and display all song information AGAIN\n");
        song2.setArtist(song2.artist = "Sarah");
        song2.setGenre(song2.genre = "rock");

        //printing the updated song information
        System.out.println("Title: "+song2.title);
        System.out.println("Writer: "+song2.writer);
        System.out.println("Artist: "+song2.artist);
        System.out.println("Duration: "+song2.duration);
        System.out.println("Genre: "+song2.genre);
    }
}
