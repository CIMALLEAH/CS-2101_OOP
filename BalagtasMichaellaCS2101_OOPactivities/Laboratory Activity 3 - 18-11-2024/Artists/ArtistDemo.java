package Artists;

import Artists.Dancer.DanceStyle;
import Artists.Painter.Medium;
import Artists.Singer.Genre;
import Artists.Writer.WritingStyle;

public class ArtistDemo {
    public static void main(String[] args) {
        Artist artist = new Artist("Charlie Puth", "American", 32, "Music");
        Painter painter = new Painter("Leonardo Da Vinci", "Italian", 67, Medium.OIL);
        Singer singer = new Singer("Nayeon Im", "South Korean", 29, Genre.POP);
        Writer writer = new Writer("William Shakespeare", "English", 52, WritingStyle.FICTION);
        Dancer dancer = new Dancer("Misty Copeland", "American", 41, DanceStyle.BALLET);

        // Use polymorphism to call the appropriate method for each artist
        artist.displayInfo();
        painter.displayInfo();
        singer.displayInfo();
        writer.displayInfo();
        dancer.displayInfo();
    }
}

